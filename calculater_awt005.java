import java.awt.*;
import java.awt.event.*;

class calculater_awt005 extends Frame implements ActionListener
{
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	double a=0,b=0,c=0;
	int f=0;
	double e=0;
	calculater_awt005()
	{
		l1=new Label("0");
		l1.setBounds(10,10,320,150);
		l1.setBackground(new Color(252, 250, 249 ));
		l1.setFont(new Font("Times New Roman",Font.PLAIN,50));
		l1.setAlignment(Label.RIGHT);
		
		b1=new Button("%");
		b1.setBounds(10,160,80,50);
		b1.setBackground(new Color(249, 235, 234));
		b1.addActionListener(this);
		
		b2=new Button("CE");
		b2.setBounds(90,160,80,50);
		b2.setBackground(new Color(249, 235, 234));
		b2.addActionListener(this);
		
		b3=new Button("C");
		b3.setBounds(170,160,80,50);
		b3.setBackground(new Color(249, 235, 234));
		b3.addActionListener(this);
		
		b4=new Button("X");
		b4.setBounds(250,160,80,50);
		b4.setBackground(new Color(249, 235, 234));
		b4.addActionListener(this);
		
		b5=new Button("1/x");
		b5.setBounds(10,210,80,50);
		b5.setBackground(new Color(249, 235, 234));
		b5.addActionListener(this);
		
		b6=new Button("X*X");
		b6.setBounds(90,210,80,50);
		b6.setBackground(new Color(249, 235, 234));
		b6.addActionListener(this);
		
		b7=new Button("X*X*X");
		b7.setBounds(170,210,80,50);
		b7.setBackground(new Color(249, 235, 234));
		b7.addActionListener(this);
		
		b8=new Button("/");
		b8.setBounds(250,210,80,50);
		b8.setBackground(new Color(249, 235, 234));
		b8.addActionListener(this);
		
		b9=new Button("7");
		b9.setBounds(10,260,80,50);
		b9.setBackground(new Color(249, 235, 234));
		b9.addActionListener(this);
		
		b10=new Button("8");
		b10.setBounds(90,260,80,50);
		b10.setBackground(new Color(249, 235, 234));
		b10.addActionListener(this);
		
		b11=new Button("9");
		b11.setBounds(170,260,80,50);
		b11.setBackground(new Color(249, 235, 234));
		b11.addActionListener(this);
		
		b12=new Button("*");
		b12.setBounds(250,260,80,50);
		b12.setBackground(new Color(249, 235, 234));
		b12.addActionListener(this);
		
		b13=new Button("4");
		b13.setBounds(10,310,80,50);
		b13.setBackground(new Color(249, 235, 234));
		b13.addActionListener(this);
		
		b14=new Button("5");
		b14.setBounds(90,310,80,50);
		b14.setBackground(new Color(249, 235, 234));
		b14.addActionListener(this);
		
		b15=new Button("6");
		b15.setBounds(170,310,80,50);
		b15.setBackground(new Color(249, 235, 234));
		b15.addActionListener(this);
		
		b16=new Button("-");
		b16.setBounds(250,310,80,50);
		b16.setBackground(new Color(249, 235, 234));
		b16.addActionListener(this);
		
		b17=new Button("1");
		b17.setBounds(10,360,80,50);
		b17.setBackground(new Color(249, 235, 234));
		b17.addActionListener(this);
		
		b18=new Button("2");
		b18.setBounds(90,360,80,50);
		b18.setBackground(new Color(249, 235, 234));
		b18.addActionListener(this);
		
		b19=new Button("3");
		b19.setBounds(170,360,80,50);
		b19.setBackground(new Color(249, 235, 234));
		b19.addActionListener(this);
		
		b20=new Button("+");
		b20.setBounds(250,360,80,50);
		b20.setBackground(new Color(249, 235, 234));
		b20.addActionListener(this);
		
		b21=new Button("+/-");
		b21.setBounds(10,410,80,50);
		b21.setBackground(new Color(249, 235, 234));
		b21.addActionListener(this);
		
		b22=new Button("0");
		b22.setBounds(90,410,80,50);
		b22.setBackground(new Color(249, 235, 234));
		b22.addActionListener(this);
		
		b23=new Button(".");
		b23.setBounds(170,410,80,50);
		b23.setBackground(new Color(249, 235, 234));
		b23.addActionListener(this);
		
		b24=new Button("=");
		b24.setBounds(250,410,80,50);
		b24.setBackground(new Color(249, 235, 234));
		b24.addActionListener(this);
		
		
		
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
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(l1.getText().startsWith("0"))
			l1.setText(l1.getText().substring(1));	
			
		if(ae.getSource()==b17)
			l1.setText(l1.getText()+"1");
		
		if(ae.getSource()==b18)
			l1.setText(l1.getText()+"2");
		
		if(ae.getSource()==b19)
			l1.setText(l1.getText()+"3");
		
		if(ae.getSource()==b13)
			l1.setText(l1.getText()+"4");
		
		if(ae.getSource()==b14)
			l1.setText(l1.getText()+"5");
		
		if(ae.getSource()==b15)
			l1.setText(l1.getText()+"6");
		
		if(ae.getSource()==b9)
			l1.setText(l1.getText()+"7");
		
		if(ae.getSource()==b10)
			l1.setText(l1.getText()+"8");
		
		if(ae.getSource()==b11)
			l1.setText(l1.getText()+"9");
		
		if(ae.getSource()==b22)
			l1.setText(l1.getText()+"0");
		
		if(ae.getSource()==b23)
			l1.setText(l1.getText()+".");
		
		
		if(ae.getSource()==b20) //+ button 
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			f=1;
		}
		
		if(ae.getSource()==b16) //- button 
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			f=2;
		}
		
		if(ae.getSource()==b12) //* button
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			f=3;
		}
		
		if(ae.getSource()==b8) // /button
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			f=4;
		}
		if(ae.getSource()==b1) // %button
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			f=5;
		}
		
		if(ae.getSource()==b6) // square button
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			c=a*a;
			
			l1.setText(String.valueOf(c));
		}
		
		if(ae.getSource()==b7)
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			c=a*a*a;
			
			l1.setText(String.valueOf(c));
		}
		
		if(ae.getSource()==b5)
		{
			a=Float.parseFloat(l1.getText());
			l1.setText("");
			e=1.0/a;
			
			l1.setText(String.valueOf(e).substring(0,9));
		}
		
		if(ae.getSource()==b21)
		{
			if(!l1.getText().startsWith("-"))
				l1.setText("-"+l1.getText());
			else	
				l1.setText(l1.getText().substring(1));
		}
		
		if(ae.getSource()==b3)
		{
			l1.setText("");
		}
		
		if(ae.getSource()==b4)
		{
			if(l1.getText().length()>1)
				l1.setText(l1.getText().substring(1));
			else 
				l1.setText("0");
		}
		
		if(ae.getSource()==b24) // = button
		{
			b=Float.parseFloat(l1.getText());
			if(f==1)
				c=a+b;
			if(f==2)
				c=a-b;
			if(f==3)
				c=a*b;
			if(f==4)
				c=a/b;
			if(f==5)
				c=a%b;
			
			
			double k=(int)c;
			if(k!=c)
				l1.setText(String.format("%.02f",c));
			else
				l1.setText(String.valueOf((int)c));
		}	
	}
	
	public static void main(String [] ar)
	{
		new calculater_awt005();
	}
}