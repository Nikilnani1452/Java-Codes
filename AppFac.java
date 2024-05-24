import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class AppFac extends Applet implements ActionListener
{
	Button b1;
	Label l1,l2;
	TextField tf1,tf2;
	public void init() 
	{
		l1= new Label("Number: ");
		l1.setBounds(60,50,80,30);
		add(l1);
		tf1= new TextField("");
		tf1.setBounds(160,50,80,30);
		add(tf1);
		b1= new Button("COMPUTE");
		b1.setBounds(100,150,80,30);
		add(b1);
		l2= new Label("RESULT:");
		l2.setBounds(80,200,80,30);
		add(l2);
		tf2= new TextField("");
		tf2.setBounds(180,200,100,30);
		add(tf2);
		b1.addActionListener(this);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	        int fact=1;
		int n =Integer.parseInt(tf1.getText());
		for(int i=1;i<=n;i++)
		{
              	  fact=fact * i;
		}
		tf2.setText(""+fact);
	}
}
/*  <applet code="AppFac.class" width="300" height="400">
</applet>
*/
