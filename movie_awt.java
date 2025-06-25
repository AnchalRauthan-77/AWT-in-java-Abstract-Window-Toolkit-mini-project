import java.util.*;
import java.awt.*;
import java.awt.event.*;
class movie_awt extends Frame implements ActionListener
{
	String name[]={"Rockstar","Spiderman","Batman","Ironman","Avengers","MoneyHeast","Housefull","HeraFeri"};
	String nm="";
	Button b1[],b7,b8;
	TextField tf1;
	
	int k=0,x=50,y=50;
	int j=0,n=0;
	
	movie_awt()
	{
		Random r=new Random();
		k=r.nextInt(name.length)+1;
		nm=name[k];
		b1=new Button[nm.length()];
		
		for(int i=0;i<nm.length();i++)
		{
			b1[i]=new Button(String.valueOf(nm.charAt(i)));
			b1[i].setBounds(x,y,50,50);
			x+=55;
			b1[i].addActionListener(this);
			add(b1[i]);
		}
		blankspc();
		
		tf1=new TextField(15);
		tf1.setBounds(100,120,220,30);
		tf1.setBackground(new Color(237, 235, 233));
		
		b7=new Button("Check");
		b7.setBounds(100,170,60,30);
		b7.setBackground(new Color(237, 235, 233));
		b7.addActionListener(this);
		
		b8=new Button("Restart");
		b8.setBounds(260,170,60,30);
		b8.setBackground(new Color(237, 235, 233));
		b8.addActionListener(this);
		
		add(tf1);
		add(b7);
		add(b8);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
		
	void blankspc()
	{
		int pre=b1.length*50/100;
		for(int i=0;i<nm.length();i++)
			b1[i].setLabel(String.valueOf(nm.charAt(i)));
		
		int j=0;
		int n=nm.length()-1;
		while(j!=pre)
		{
			Random r=new Random();
			int c=r.nextInt(n)+1;
			if(c==0)
			{
				if(b1[c+1].getLabel()!="_")
				{
					b1[c].setLabel("_");
					j=j+1;
				}
			}
			else if(c==n)
			{
				if(b1[c-1].getLabel()!="_")
				{
					b1[c].setLabel("_");
					j=j+1;
				}
			}
			else
			{
				if(b1[c+1].getLabel()!="_" && b1[c-1].getLabel()!="_")
				{
					b1[c].setLabel("_");
					j=j+1;
				}
			}
		}
		
		int p=0;
		for(int i=0;i<nm.length();i++)
		{
			if(b1[i].getLabel().equals("_"))
				p++;
		}
		if(p!=pre)
			blankspc();
	}
				
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b7)
		{
			if(tf1.getText().equals(nm))
			{
				for(int i=0;i<nm.length();i++)
					b1[i].setLabel(String.valueOf(nm.charAt(i)));
				tf1.setBackground(new Color(0,255,0));
		    }
			else
				tf1.setBackground(new Color(255,0,0));
		}
		for(int i=0;i<nm.length();i++)
		{
			if(ae.getSource()==b1[i])
				b1[i].setLabel(String.valueOf(nm.charAt(i)));
		}
		
		if(ae.getSource()==b8)
		{
			new movie_awt();
		}
			
		
	}
	public static void main(String[] ar)
	{
		new movie_awt();
	}
}	
