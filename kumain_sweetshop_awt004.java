import java.awt.*;
import java.awt.event.*;
class kumain_sweetshop_awt004 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	List list1;
	Button b1,b2;
	
	kumain_sweetshop_awt004()
	{
		l1=new Label("Samosa");
		l1.setBounds(50,50,100,20);
		
		l2=new Label("Chai");
		l2.setBounds(50,80,100,20);
		
		l3=new Label("Coffee");
		l3.setBounds(50,110,100,20);
		
		list1=new List();
		list1.add("General");
		list1.add("Student");
		list1.add("Staff");
		list1.setBounds(50,140,100,50);
		
		l4=new Label("Total");
		l4.setBounds(190,140,100,20);
		
		l5=new Label("Discount");
		l5.setBounds(190,170,100,20);
		
		l6=new Label("Amount");
		l6.setBounds(190,200,100,20);
		
		tf1=new TextField(15);
		tf1.setBounds(170,50,100,20);
		
		tf2=new TextField(15);
		tf2.setBounds(170,80,100,20);
		
		tf3=new TextField(15);
		tf3.setBounds(170,110,100,20);
		
		tf4=new TextField(15);
		tf4.setBounds(290,50,100,20);
	
		cb1=new Checkbox("Chole");
		cb1.setBounds(405,50,100,20);
		
		tf5=new TextField(15);
		tf5.setBounds(290,80,100,20);
		
		cb2=new Checkbox("Dahi");
		cb2.setBounds(405,80,100,20);
		
		tf6=new TextField(15);
		tf6.setBounds(290,110,100,20);
		
		cb3=new Checkbox("Masala");
		cb3.setBounds(405,110,100,20);
		
		tf7=new TextField(15);
		tf7.setBounds(290,140,100,20);
		
		cb4=new Checkbox("kullad");
		cb4.setBounds(405,140,100,20);
		
		tf8=new TextField(15);
		tf8.setBounds(290,170,100,20);
		
		cb5=new Checkbox("Latte");
		cb5.setBounds(405,170,100,20);
		
		tf9=new TextField(15);
		tf9.setBounds(290,200,100,20);
		
		cb6=new Checkbox("Express");
		cb6.setBounds(405,200,100,20);
		
		b1=new Button("Calculate");
		b1.setBounds(170,230,100,20);
		b1.addActionListener(this);
		
		b2=new Button("Cancel");
		b2.setBounds(290,230,100,20);
		b2.addActionListener(this);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		
		add(list1);
		
		add(tf3);
		add(l4);
		add(tf4);
		add(cb1);
		add(l5);
		add(tf5);
		add(cb2);
		add(l6);
		add(tf6);
		add(cb3);
		add(tf7);
		add(cb4);
		add(tf8);
		add(cb5);
		add(tf9);
		add(cb6);
		add(b1);
		add(b2);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int s=0,c=0,cf=0,t=0,d=0,a=0;
		int p=0;
		if(ae.getSource()==b1)
		{
			
			s=Integer.parseInt(tf1.getText())*16;
			c=Integer.parseInt(tf2.getText())*11;
			cf=Integer.parseInt(tf3.getText())*25;
			t=s+c+cf;
			d=(t*10)/100;
			a=t-d;
			
			tf4.setText(String.valueOf(s));
			tf5.setText(String.valueOf(c));
			tf6.setText(String.valueOf(cf));
			tf7.setText(String.valueOf(t));
			tf8.setText(String.valueOf(d));
			tf9.setText(String.valueOf(a));
			
			if(cb1.getState()==true)
				s+=Integer.parseInt(tf1.getText())*10;
			if(cb2.getState()==true)
				s+=Integer.parseInt(tf1.getText())*10;
			
			tf4.setText(String.valueOf(s));
			
			if(cb3.getState()==true)
				c+=Integer.parseInt(tf2.getText())*10;
			if(cb4.getState()==true)
				c+=Integer.parseInt(tf2.getText())*10;
			
			tf5.setText(String.valueOf(c));
			
			if(cb5.getState()==true)
				cf+=Integer.parseInt(tf3.getText())*10;
			if(cb6.getState()==true)
				cf+=Integer.parseInt(tf3.getText())*10;
			
			tf6.setText(String.valueOf(cf));
			
			
			
			if(list1.getSelectedItem().equals("General"))
			{
				d=(t*5)/100;
				a=t-d;
				tf8.setText(String.valueOf(d));
				tf9.setText(String.valueOf(a));
			}
			if(list1.getSelectedItem().equals("Student"))
			{
				d=(t*10)/100;
				a=t-d;
				tf8.setText(String.valueOf(d));
				tf9.setText(String.valueOf(a));
			}
			if(list1.getSelectedItem().equals("Staff"))
			{
				d=(t*15)/100;
				a=t-d;
				tf8.setText(String.valueOf(d));
				tf9.setText(String.valueOf(a));
			}
		}
	
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			tf8.setText("");
			tf9.setText("");
		}
	}
	
	public static void main(String[] ar)
	{
		new kumain_sweetshop_awt004();
	}
}