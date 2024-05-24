import java.awt.*;
import java.awt.event.*;
class Divawt extends Frame implements ActionListener
{
	Button b1;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Divawt() 
	{
		l1= new Label("First Num: ");
		l1.setBounds(60,50,80,30);
		add(l1);
                l2= new Label("Second Num: ");
		l2.setBounds(60,80,80,30);
		add(l2);
		tf1= new TextField("");
		tf1.setBounds(160,50,80,30);
		add(tf1);
		tf2= new TextField("");
		tf2.setBounds(160,85,80,30);
		add(tf2);
		b1= new Button("DIVIDE");
		b1.setBounds(100,150,80,30);
		add(b1);
		l3= new Label("RESULT:");
		l3.setBounds(80,200,80,30);
		add(l3);
		tf3= new TextField("");
		tf3.setBounds(180,200,200,30);
		add(tf3);
		b1.addActionListener(this);
		setSize(500,500);
		setTitle("DIVISION");
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	        try
		{
		int n1 =Integer.parseInt(tf1.getText());
		int n2 =Integer.parseInt(tf2.getText());
              	  tf3.setText(""+(n1/n2));
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
	public static void main(String args[])
	{
		Divawt obj = new Divawt();
	}
}
