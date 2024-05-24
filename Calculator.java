import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Calculator() 
	{
		l1= new Label("First Num:");
		l1.setBounds(60,50,80,30);
		add(l1);
               l2= new Label("Second Num:");
		l2.setBounds(60,80,80,30);
		add(l2);
		tf1= new TextField("");
		tf1.setBounds(160,50,80,30);
		add(tf1);
		tf2= new TextField("");
		tf2.setBounds(160,85,80,30);
		add(tf2);
		b1= new Button("+");
		b1.setBounds(110,130,80,30);
		add(b1);
		b2= new Button("-");
		b2.setBounds(180,130,80,30);
		add(b2);
		b3= new Button("*");
		b3.setBounds(250,130,80,30);
		add(b3);
		b4= new Button("/");
		b4.setBounds(320,130,80,30);
		add(b4);
		l3= new Label("RESULT:");
		l3.setBounds(80,200,80,30);
		add(l3);
		tf3= new TextField("");
		tf3.setBounds(180,200,200,30);
		add(tf3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(600,600);
		setTitle("CALCULATOR");
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	        if(e.getSource()==b1)
	        {
                 int n1 =Integer.parseInt(tf1.getText());
	      	  int n2 =Integer.parseInt(tf2.getText());
		  tf3.setText(""+(n1+n2));	         
	        }
	        else if(e.getSource()==b2)
	        {
                 int n3 =Integer.parseInt(tf1.getText());
	      	  int n4 =Integer.parseInt(tf2.getText());
		  tf3.setText(""+(n3-n4));	         
	        }
	        else if(e.getSource()==b3)
	        {
                 int n5 =Integer.parseInt(tf1.getText());
	      	  int n6 =Integer.parseInt(tf2.getText());
		  tf3.setText(""+(n5*n6));	         
	        }
	        else if(e.getSource()==b4)
	        {
	         try
	         {
                 int n7 =Integer.parseInt(tf1.getText());
	      	  int n8 =Integer.parseInt(tf2.getText());
		  tf3.setText(""+(n7/n8));	         
	         }
		 catch (ArithmeticException a)
		 {
                 tf3.setText("Number is not Divisible by Zero");
		 }
		 catch(NumberFormatException a)
		 {
		 tf3.setText("Number is not in integer Format");
		 }
	       }
	       else 
	       {
	        tf3.setText("");
	       }
	 }
	public static void main(String args[])
	{	
         Calculator obj = new Calculator();
	}
}
