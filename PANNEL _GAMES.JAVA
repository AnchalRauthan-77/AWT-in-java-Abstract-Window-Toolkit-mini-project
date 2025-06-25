import java.util.*;
import java.awt.*;
import java.awt.event.*;
class awt_07 extends Frame implements ActionListener
{
// First Panel Making Tic Tac Toe Game:
	Panel p1,p2,p3;
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b50,b51,b52,b53;
	TextField tf1,tf2,tf3;
	int h=0;
	int c=0;
	int p=0,t=0;
	int count=0,a=0,b=0;
	
// Second Panel Making Dicegame:
	Label l2,l3,l4,l5,l6,l7,l8,l9;
	TextField tf4,tf5,tf6,tf7,tf8;
	Button b12,b13,b14,b15;
	
	int z1=0,z2=0,cn=0,a1=0,a2=0;
	int cnt=0;
	
// Third panel Making Memory Game:
	Label l20;
	Button b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
	
	String arr[]=new String[16];
	int i=0,y1=0,y2=0,y3=0;
	int ct=0;
	awt_07()
	{
		// First Panel Making Tic Tac Toe Game:
		
		b50=new Button("Panel1");
		b50.setBounds(50,50,100,30);
		b50.setBackground(new Color(244,244,244));
		b50.addActionListener(this);
		
		p1=new Panel();
		p1.setBounds(170,50,280,500);
		p1.setBackground(Color.pink);
		p1.setLayout(null);
		
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
		
		b51=new Button("Panel2");
		b51.setBounds(50,90,100,30);
		b51.setBackground(new Color(244,244,244));
		b51.addActionListener(this);
        
		add(p1);
		add(b50);
		p1.add(l1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(tf1);
		p1.add(b10);		
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b11);
		
		// Second Panel Making Dicegame Game:
		b51=new Button("Panel2");
		b51.setBounds(50,90,100,30);
		b51.setBackground(new Color(244,244,244));
		b51.addActionListener(this);
		
		p2=new Panel();
		p2.setBounds(170,50,280,500);
		p2.setBackground(Color.blue);
		p2.setLayout(null);
		
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
		
		add(b51);
		add(p2);
		p2.add(l2);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(tf4);
		p2.add(l7);
		p2.add(tf5);
		p2.add(b12);
		p2.add(b13);
		p2.add(tf6);
		p2.add(b14);
		p2.add(b15);
		p2.add(tf7);
		p2.add(tf8);
		
		
		// Third Panel Making Memory Game:
		b52=new Button("panel3");
		b52.setBounds(50,130,100,30);
		b52.setBackground(new Color(244,244,244));
		b52.addActionListener(this);
		
		p3=new Panel();
		p3.setBounds(170,50,280,500);
		p3.setBackground(Color.red);
		p3.setLayout(null);
		
		l20=new Label("Points");
		l20.setBounds(75,30,80,40);
		l20.setBackground(new Color(244,244,244));
		l20.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		b16=new Button("1");
		b16.setBounds(20,80,40,40);
		b16.setBackground(new Color(237, 235, 233));
		b16.addActionListener(this);
		
		b17=new Button("2");
		b17.setBounds(70,80,40,40);
		b17.setBackground(new Color(237, 235, 233));
		b17.addActionListener(this);
		
		b18=new Button("3");
		b18.setBounds(120,80,40,40);
		b18.setBackground(new Color(237, 235, 233));
		b18.addActionListener(this);
		
		b19=new Button("4");
		b19.setBounds(170,80,40,40);
		b19.setBackground(new Color(237, 235, 233));
		b19.addActionListener(this);
		
		b20=new Button("5");
		b20.setBounds(20,130,40,40);
		b20.setBackground(new Color(237, 235, 233));
		b20.addActionListener(this);
		
		b21=new Button("6");
		b21.setBounds(70,130,40,40);
		b21.setBackground(new Color(237, 235, 233));
		b21.addActionListener(this);
		
		b22=new Button("7");
		b22.setBounds(120,130,40,40);
		b22.setBackground(new Color(237, 235, 233));
		b22.addActionListener(this);
		
		b23=new Button("8");
		b23.setBounds(170,130,40,40);
		b23.setBackground(new Color(237, 235, 233));
		b23.addActionListener(this);
		
		b24=new Button("9");
		b24.setBounds(20,180,40,40);
		b24.setBackground(new Color(237, 235, 233));
		b24.addActionListener(this);
		
		b25=new Button("10");
		b25.setBounds(70,180,40,40);
		b25.setBackground(new Color(237, 235, 233));
		b25.addActionListener(this);
		
		b26=new Button("11");
		b26.setBounds(120,180,40,40);
		b26.setBackground(new Color(237, 235, 233));
		b26.addActionListener(this);
		
		b27=new Button("12");
		b27.setBounds(170,180,40,40);
		b27.setBackground(new Color(237, 235, 233));
		b27.addActionListener(this);
		
		b28=new Button("13");
		b28.setBounds(20,230,40,40);
		b28.setBackground(new Color(237, 235, 233));
		b28.addActionListener(this);
		
		b29=new Button("14");
		b29.setBounds(70,230,40,40);
		b29.setBackground(new Color(237, 235, 233));
		b29.addActionListener(this);
		
		b30=new Button("15");
		b30.setBounds(120,230,40,40);
		b30.setBackground(new Color(237, 235, 233));
		b30.addActionListener(this);
		
		b31=new Button("16");
		b31.setBounds(170,230,40,40);
		b31.setBackground(new Color(237, 235, 233));
		b31.addActionListener(this);
		
		b32=new Button("Replay");
		b32.setBounds(75,280,80,40);
		b32.setBackground(new Color(237, 235, 233));
		b32.addActionListener(this);
		b32.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		add(b52);
		add(p3);
		p3.add(l20);
		p3.add(b16);
		p3.add(b17);
		p3.add(b18);
		p3.add(b19);
		p3.add(b20);
		p3.add(b21);
		p3.add(b22);
		p3.add(b23);
		p3.add(b24);
		p3.add(b25);
		p3.add(b26);
		p3.add(b27);
		p3.add(b28);
		p3.add(b29);
		p3.add(b30);
		p3.add(b31);
		p3.add(b32);
		
		b53=new Button("Hide/Show");
		b53.setBounds(50,170,100,30);
		b53.addActionListener(this);
		add(b53);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	// Second Panel Making Dicegame:
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
		if(ae.getSource()==b50)
		{
			p1.setVisible(true);
			p2.setVisible(false);
			p3.setVisible(false);
		}
		
		if(ae.getSource()==b51)
		{
			p2.setVisible(true);
			p1.setVisible(false);
			p3.setVisible(false);
		}
		
		if(ae.getSource()==b52)
		{
			p3.setVisible(true);
			p2.setVisible(false);
			p1.setVisible(false);
		}
		
		if(ae.getSource()==b53)
		{
			if(h==0)
			{
				
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				h=1;
			}
			else 
			{
				h=0;
				p1.setVisible(true);
				p2.setVisible(true);
				p3.setVisible(true);
			}
		}
		
		// First Panel Making Tic Tac Toe:
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
		
			if(count==5)
			{
				tf2.setText("");
				tf3.setText("");
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
			}
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
		c=c+1;
	
	
		// Secont Panel Making Dice Game:
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
		
		
		// Third Panel Making Memory Game:
		if(ae.getSource()==b16)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b16.setLabel("#");
			else if(ee==2)
				b16.setLabel("@");
			else 
				b16.setLabel("X");
	
			b16.setEnabled(false);
			ct++;
			arr[0]=b16.getLabel();
		}
		
		if(ae.getSource()==b17)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b17.setLabel("#");
			else if(ee==2)
				b17.setLabel("@");
			else
				b17.setLabel("X");
			b17.setEnabled(false);
			ct++;
			arr[1]=b17.getLabel();
		}
		
		if(ae.getSource()==b18)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b18.setLabel("#");
			else if(ee==2)
				b18.setLabel("@");
			else
				b18.setLabel("X");
			b18.setEnabled(false);
			ct++;
			arr[2]=b18.getLabel();
		}
		
		if(ae.getSource()==b19)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b19.setLabel("#");
			else if(ee==2)
				b19.setLabel("@");
			else
				b19.setLabel("X");
			b19.setEnabled(false);
			ct++;
			arr[3]=b19.getLabel();
		}
		
		if(ae.getSource()==b20)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b20.setLabel("#");
			else if(ee==2)
				b20.setLabel("@");
			else 
				b20.setLabel("X");
			b20.setEnabled(false);
			ct++;
			arr[4]=b20.getLabel();
		}
		
		if(ae.getSource()==b21)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b21.setLabel("#");
			else if(ee==2)
				b21.setLabel("@");
			else
				b21.setLabel("X");
			b21.setEnabled(false);
			ct++;
			arr[5]=b21.getLabel();
		}
		
		if(ae.getSource()==b22)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b22.setLabel("#");
			else if(ee==2)
			    b22.setLabel("@");
			else
				b22.setLabel("X");
			b22.setEnabled(false);
			ct++;
			arr[6]=b22.getLabel();
		}
		
		if(ae.getSource()==b23)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b23.setLabel("#");
			else if(ee==2)
				b23.setLabel("@");
			else
				b23.setLabel("X");
			b23.setEnabled(false);
			ct++;
			arr[7]=b23.getLabel();
		}
		
		if(ae.getSource()==b24)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b24.setLabel("#");
			else if(ee==2)
				b24.setLabel("@");
			else 
				b24.setLabel("X");
			b24.setEnabled(false);
			ct++;
			arr[8]=b24.getLabel();
		}
	
		if(ae.getSource()==b25)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b25.setLabel("#");
			else if(ee==2)
				b25.setLabel("@");
			else
				b25.setLabel("X");
			b25.setEnabled(false);
			ct++;
			arr[9]=b25.getLabel();
		}
		
		if(ae.getSource()==b26)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b26.setLabel("#");
			else if(ee==2)
				b26.setLabel("@");
			else
				b26.setLabel("X");
			b26.setEnabled(false);
			ct++;
			arr[10]=b26.getLabel();
		}
		
		if(ae.getSource()==b27)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b27.setLabel("#");
			else if(ee==2)
				b27.setLabel("@");
			else
				b27.setLabel("X");
			b27.setEnabled(false);
			ct++;
			arr[11]=b27.getLabel();
		}
		
		if(ae.getSource()==b28)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b28.setLabel("#");
			else if(ee==1)
				b28.setLabel("@");
			else
				b28.setLabel("X");
			b28.setEnabled(false);
			ct++;
			arr[12]=b28.getLabel();
		}
		
		if(ae.getSource()==b29)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b29.setLabel("#");
			else if(ee==2)
				b29.setLabel("@");
			else
				b29.setLabel("X");
			b29.setEnabled(false);
			ct++;
			arr[13]=b29.getLabel();
		}
		
		if(ae.getSource()==b30)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b30.setLabel("#");
			else if(ee==2)
				b30.setLabel("@");
			else
				b30.setLabel("X");
			b30.setEnabled(false);
			ct++;
			arr[14]=b30.getLabel();
		}
		
		if(ae.getSource()==b31)
		{
			Random r=new Random();
			int ee=r.nextInt(3)+1;
			if(ee==1)
				b31.setLabel("#");
			else if(ee==2)
				b31.setLabel("@");
			else
				b31.setLabel("X");
			b31.setEnabled(false);
			ct++;
			arr[15]=b31.getLabel();
		}
		
		if(ct==16)
			winner2();
		
		if(ae.getSource()==b32)
		{
			b16.setLabel("1");
			b17.setLabel("2");
			b18.setLabel("3");
			b19.setLabel("4");
			b20.setLabel("5");
			b21.setLabel("6");
			b22.setLabel("7");
			b23.setLabel("8");
			b24.setLabel("9");
			b25.setLabel("10");
			b26.setLabel("11");
			b27.setLabel("12");
			b28.setLabel("13");
			b29.setLabel("14");
			b30.setLabel("15");
			b31.setLabel("16");
			l20.setText("Point");
			
			b16.setEnabled(true);
			b17.setEnabled(true);
			b18.setEnabled(true);
			b19.setEnabled(true);
			b20.setEnabled(true);
			b21.setEnabled(true);
			b22.setEnabled(true);
			b23.setEnabled(true);
			b24.setEnabled(true);
			b25.setEnabled(true);
			b26.setEnabled(true);
			b27.setEnabled(true);
			b28.setEnabled(true);
			b29.setEnabled(true);
			b30.setEnabled(true);
			b31.setEnabled(true);
		}
		System.out.println("Count : "+ct);
	}
	
	
	
	
	// First Panel Making Tic Tac Toe Game:
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
	
	
	// Second Panel Making Dice Game:
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
		
	// Third Panel Making Memory Game:
	void winner2()
	{
		ct=0;
		System.out.println("Winner Function Called ");
		y1=0;
		y2=0;
		y3=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("@"))
				y1++;
			else if(arr[i].equals("#"))
				y2++;
			else 
				y3++;
		}
		if(y1==y2)
			l20.setText("winner");
		else if(y2==y3)
			l20.setText("winner");
		else if(y1==y3)
			l20.setText("winner");
		else
			l20.setText("Loss");
	}
	
	public static void main(String ar[])
	{
		new awt_07();
	}
}