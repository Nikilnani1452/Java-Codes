import java.awt.*;
import java.awt.event.*;
class Facawt2 extends Frame implements ActionListener
{
	Button b1;
	Label l1,l2,L3;
	TextField tf1,tf2,T3;
	Facawt2() 
	{
		l1= new Label(" FIRST NUMBER : ");
		l1.setBounds(60,50,80,30);
		add(l1);
		tf1= new TextField("");
		tf1.setBounds(160,50,80,30);
		add(tf1);
		b1= new Button("FIND");
		b1.setBounds(100,150,80,30);
		add(b1);
		l2= new Label(" FIRST NUMBER : ");
		l2.setBounds(100,100,80,30);
		add(l2);
		tf2= new TextField("");
		tf2.setBounds(100,100,80,30);
		add(tf2);
		l3= new Label("RESULT : ");
		l3.setBounds(200,200,80,30);
		add(l3);
		tf3= new TextField("");
		tf3.setBounds(250,250,80,30);
		add(tf3);
		b1.addActionListener(this);
		setSize(500,500);
		setTitle("DIVISION");
		setLayout(null);
		setVisible(true);
	}
	/*public void actionPerformed(ActionEvent e)
	{
		int fact = 1;
		int n =Integer.parseInt(tf1.getText());
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		tf2.setText(""+fact);
	}*/
	public static void main(String args[])
	{
		Facawt2 obj = new Facawt2();
	}
} 
