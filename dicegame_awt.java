import java.util.*;
import java.awt.*;
import java.awt.event.*;

class dicegame_awt extends Frame implements ActionListener
{
	Label l2,l3,l4,l5,l6,l7,l8,l9;
	TextField tf4,tf5,tf6,tf7,tf8;
	Button b12,b13,b14,b15;
	
	int z1=0,z2=0,cn=0,a1=0,a2=0;
	int cnt=0;
	
	dicegame_awt()
	{
		l2=new Label("DICE NUMBER GAME");
		l2.setBounds(10,30,250,60);
		l2.setFont(new Font("Times New Roman",Font.PLAIN,24));
		
		l3=new Label("0");
		l3.setBounds(40,100,190,100);
		l3.setBackground(new Color(237, 235, 233));
		l3.setFont(new Font("Times New Roman",Font.PLAIN,50));
		l3.setAlignment(Label.CENTER);
		
		l4=new Label("PLAYER1");
		l4.setBounds(40,210,78,30);
		l4.setFont(new Font("Times New Roman",Font.PLAIN,17));
		
		l5=new Label("PLAYER2");
		l5.setBounds(153,210,78,30);
		l5.setFont(new Font("Times New Roman",Font.PLAIN,17));
		
		l6=new Label("Scane");
		l6.setBounds(30,250,46,30);
		l6.setFont(new Font("Times New Roman",Font.PLAIN,15));
		
		tf4=new TextField(15);
		tf4.setBounds(81,250,46,30);
		tf4.setBackground(new Color(237, 235, 233));
		tf4.setEnabled(false);
		
		l7=new Label("Scane");
		l7.setBounds(142,250,46,30);
		l7.setFont(new Font("Times New Roman",Font.PLAIN,15));
		
		tf5=new TextField(15);
		tf5.setBounds(193,250,46,30);
		tf5.setBackground(new Color(237, 235, 233));
		tf5.setEnabled(false);
		
		b12=new Button("DICE");
		b12.setBounds(83,285,40,30);
		b12.setBackground(new Color(237, 235, 233));
		b12.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b12.addActionListener(this);
		b12.setEnabled(false);
		
		b13=new Button("DICE");
		b13.setBounds(195,285,40,30);
		b13.setBackground(new Color(237, 235, 233));
		b13.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b13.addActionListener(this);
		b13.setEnabled(false);
		
		tf6=new TextField(15);
		tf6.setBounds(10,325,250,30);
		tf6.setBackground(new Color(237, 235, 233));
		tf6.setEnabled(false);
		
		b14=new Button("Restart");
		b14.setBounds(100,370,80,30);
		b14.setBackground(new Color(244, 244, 244));
		b14.addActionListener(this);
		b14.setFont(new Font("Time New Romen",Font.PLAIN,18));
		
		b15=new Button("Start");
		b15.setBounds(100,410,80,30);
		b15.setBackground(new Color(244, 244, 244));
		b15.addActionListener(this);
		b15.setFont(new Font("Time New Romen",Font.PLAIN,18));
		
		tf7=new TextField(15);
		tf7.setBounds(70,450,60,30);
		tf7.setBackground(new Color(237, 235, 233));
		tf7.setEnabled(false);
		
		tf8=new TextField(15);
		tf8.setBounds(140,450,60,30);
		tf8.setBackground(new Color(237, 235, 233));
		tf8.setEnabled(false);
		
		
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(tf4);
		add(l7);
		add(tf5);
		add(b12);
		add(b13);
		add(tf6);
		add(b14);
		add(b15);
		add(tf7);
		add(tf8);
		
		
		setSize(300,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void gen_rand_val()
	{
		for(int i=0;i<=10;i++)
		{
			Random d=new Random();
			int dice1=d.nextInt(6)+1;
			try{
				Thread.sleep(100);
			}catch(Exception e){}
			l3.setText(String.valueOf(dice1));
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b12)
		{	
			gen_rand_val();
			cn=cn+1;
			z1=z1+Integer.parseInt(l3.getText());
			tf4.setText(String.valueOf(z1));
			b12.setEnabled(false);
			b13.setEnabled(true);
			Winner();
		}
		
		if(ae.getSource()==b13)
		{
			gen_rand_val();
			cn=cn+1;
			z2=z2+Integer.parseInt(l3.getText());
			tf5.setText(String.valueOf(z2));
			b13.setEnabled(false);
			b12.setEnabled(true);
			Winner();
		}
		
		if(ae.getSource()==b14)
		{
			l3.setText("0");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			b12.setEnabled(true);
			b13.setEnabled(true);
			cn=0;
		}
		
		if(ae.getSource()==b15)
		{
			b12.setEnabled(true);
			b13.setEnabled(true);
		}
	}
	
		void Winner()
		{
		
			if(cn==10)
			{
				b12.setEnabled(false);
				b13.setEnabled(false);
				if(z1>z2)
				{
					tf6.setText("Winner is Player1: "+z1);
					a1=a1+1;
					tf7.setText(String.valueOf(a1));
				}
				
				else if(z2>z1)
				{
					tf6.setText("Winner is Player2: "+z2);
					a2=a2+1;
					tf8.setText(String.valueOf(a2));
				}
				z1=0;
				z2=0;
				cnt=cnt+1;
			}
			
			if(cnt==5)
			{
				if(a1>a2)
				{
					tf6.setText("Tournament winner Player1 : "+a1);
				}
				else if(a2>a1)
				{
					tf6.setText("Tournament winner Player2 : "+a2);
				}
				cnt=0;
				a1=0;
				a2=0;
				tf7.setText("0");
				tf8.setText("0");
			}
		}
	public static void main(String[] ar)
	{
		new dicegame_awt();
	}
}
