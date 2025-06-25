import java.awt.*;
import java.awt.event.*;
class tic_tac_toe_awt extends Frame implements ActionListener
{
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	TextField tf1,tf2,tf3;
	
	int c=0;
	int p=0,t=0;
	int count=0,a=0,b=0;
	
	tic_tac_toe_awt()
	{
		l1=new Label("TIC-TAC-TOE");
		l1.setBounds(10,10,250,150);
		l1.setBackground(new Color(237, 235, 233));
		l1.setFont(new Font("Times New Roman",Font.PLAIN,37));
		
		b1=new Button("1");
		b1.setBounds(10,165,80,50);
		b1.setBackground(new Color(244, 244, 244));
		b1.addActionListener(this);
		b1.setEnabled(false);
		
		b2=new Button("2");
		b2.setBounds(95,165,80,50);
		b2.setBackground(new Color(244, 244, 244));
		b2.addActionListener(this);
		b2.setEnabled(false);
		
		b3=new Button("3");
		b3.setBounds(180,165,80,50);
		b3.setBackground(new Color(244, 244, 244));
		b3.addActionListener(this);
		b3.setEnabled(false);
		
		b4=new Button("4");
		b4.setBounds(10,220,80,50);
		b4.setBackground(new Color(244, 244, 244));
		b4.addActionListener(this);
		b4.setEnabled(false);
		
		b5=new Button("5");
		b5.setBounds(95,220,80,50);
		b5.setBackground(new Color(244, 244, 244));
		b5.addActionListener(this);
		b5.setEnabled(false);
		
		b6=new Button("6");
		b6.setBounds(180,220,80,50);
		b6.setBackground(new Color(244, 244, 244));		
		b6.addActionListener(this);
		b6.setEnabled(false);
		
		b7=new Button("7");
		b7.setBounds(10,275,80,50);
		b7.setBackground(new Color(244, 244, 244));
		b7.addActionListener(this);
		b7.setEnabled(false);
		
		b8=new Button("8");
		b8.setBounds(95,275,80,50);
		b8.setBackground(new Color(244, 244 ,244));
		b8.addActionListener(this);
		b8.setEnabled(false);
		
		b9=new Button("9");
		b9.setBounds(180,275,80,50);
		b9.setBackground(new Color(244, 244, 244));
		b9.addActionListener(this);
		b9.setEnabled(false);
		
		tf1=new TextField(15);
		tf1.setBounds(10,330,250,30);
		tf1.setBackground(new Color(244, 244, 244));
		tf1.setEnabled(false);
		
		b10=new Button("Restart");
		b10.setBounds(60,365,140,30);
		b10.setBackground(new Color(244, 244, 244));
		b10.addActionListener(this);
		b10.setFont(new Font("Time New Romen",Font.PLAIN,20));
		
		tf2=new TextField(15);
		tf2.setBounds(70,400,60,30);
		tf2.setBackground(new Color(244, 244, 244));
		tf2.setEnabled(false);
		
		tf3=new TextField(15);
		tf3.setBounds(130,400,60,30);
		tf3.setBackground(new Color(244, 244, 244));
		tf3.setEnabled(false);
		
		b11=new Button("Start");
		b11.setBounds(100,440,60,30);
		b11.setBackground(new Color(244, 244, 244));
		b11.addActionListener(this);
		b11.setFont(new Font("Time New Romen",Font.PLAIN,18));
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(tf1);
		add(b10);		
		add(tf2);
		add(tf3);
		add(b11);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(c%2==0)
				b1.setLabel("0");
			else
				b1.setLabel("X");
			
			getWinner();
		}
		
		if(ae.getSource()==b2)
		{
			if(c%2==0)
				b2.setLabel("0");
			else
				b2.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b3)
		{
			if(c%2==0)
				b3.setLabel("0");
			else
				b3.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b4)
		{
			if(c%2==0)
				b4.setLabel("0");
			else
				b4.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b5)
		{
			if(c%2==0)
				b5.setLabel("0");
			else
				b5.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b6)
		{
			if(c%2==0)
				b6.setLabel("0");
			else
				b6.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b7)
		{
			if(c%2==0)
				b7.setLabel("0");
			else
				b7.setLabel("X");
			getWinner();
		}
		
		if(ae.getSource()==b8)
		{
			if(c%2==0)
				b8.setLabel("0");
			else
				b8.setLabel("X");
		
			getWinner();
		}
		
		if(ae.getSource()==b9)
		{
			if(c%2==0)
				b9.setLabel("0");
			else
				b9.setLabel("X");
			
			getWinner();
		}
		
		if(ae.getSource()==b10)
		{
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			tf1.setText("");
			c=0;
		}	
		
		if(ae.getSource()==b11)
		{
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
		}
		
		c=c+1;;
	
		
	}
	void getWinner()
	{
		String a=b1.getLabel();
		String b=b2.getLabel();
		String c=b3.getLabel();
		String d=b4.getLabel();
		String e=b5.getLabel();
		String f=b6.getLabel();
		String g=b7.getLabel();
		String h=b8.getLabel();
		String i=b9.getLabel();
		
		if(a.equals(b) && b.equals(c))
		{
			tf1.setText(a+" is Winner");
			if(a.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(a.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(d.equals(e) && e.equals(f))
		{
			tf1.setText(d+" Winner");
			if(d.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(d.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(g.equals(h) && h.equals(i))
		{
			tf1.setText(g+" Winner");
			if(g.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(g.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(a.equals(d) && d.equals(g))
		{
			tf1.setText(a+" Winner");
			if(a.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(a.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(b.equals(e) && e.equals(h))
		{
			tf1.setText(b+" Winner");
			if(b.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(b.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(c.equals(f) && f.equals(i))
		{
			tf1.setText(c+" Winner");
			if(c.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(c.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(a.equals(e) && e.equals(i))
		{
			tf1.setText(a+" Winner");
			if(a.equals("X"))
			{
				p=p+1;
				tf2.setText(String.valueOf(p));
			}
			if(a.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
		}
		
		else if(c.equals(h) && h.equals(g))
		{
			tf1.setText(c+" Winner");
			if(c.equals("X"))
			{
				p=p+1;
			tf2.setText(String.valueOf(p));
			}
			if(c.equals("0"))
			{
				t=t+1;
				tf3.setText(String.valueOf(t));
			}
			count++;
			finnal();
			
		}
	}
	void finnal()
	{
		if(count==5)
		{
			if(p>t)
				tf1.setText("x win is final match");
			else if(t>p)
				tf1.setText("0 win is final match");
		}
	}
	
	public static void main(String[] ar)
	{
		new tic_tac_toe_awt();
	}
	
}