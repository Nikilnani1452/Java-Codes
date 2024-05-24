import java.awt.event.*;
import javax.swing.*;
class GridCal extends JFrame implements ActionListener
{
	 JTextField t;
	 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	int opt=0;
	double a=0,b=0,res=0;
 GridCal()
 {
  t=new JTextField();
  t.setBounds(55,45,200,30);
  JFrame f=new JFrame();
  JPanel panel=new JPanel();
  panel.setBounds(40,80,200,200);
  b1= new JButton("1");
  b2= new JButton("2");
  b3= new JButton("3");
  b4= new JButton("+");
  b5= new JButton("4");
  b6= new JButton("5");
  b7= new JButton("6");
  b8= new JButton("-");
  b9= new JButton("7");
  b10= new JButton("8");
  b11= new JButton("9");
  b12= new JButton("*");
  b13= new JButton("0");
  b14= new JButton(".");
  b15= new JButton("/");
  b16= new JButton("=");
  b17= new JButton("DEL");
  b18= new JButton("AC");
  panel.add(b1);
  panel.add(b2);
  panel.add(b3);
  panel.add(b4);
  panel.add(b5);
  panel.add(b6);
  panel.add(b7);
  panel.add(b8);
  panel.add(b9);
  panel.add(b10);
  panel.add(b11);
  panel.add(b12);
  panel.add(b13);
  panel.add(b14);
  panel.add(b15);
  panel.add(b16);
  panel.add(b17);
  panel.add(b18);
  f.add(panel);
  f.add(t);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  b12.addActionListener(this);
  b13.addActionListener(this);
  b14.addActionListener(this);
  b15.addActionListener(this);
  b16.addActionListener(this);
  b17.addActionListener(this);
  b18.addActionListener(this);
  f.setSize(300,300);
  f.setTitle("Calculator");
  f.setLayout(null);
  f.setVisible(true);
 }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b5)
t.setText(t.getText().concat("4"));
if(e.getSource()==b6)
t.setText(t.getText().concat("5"));
if(e.getSource()==b7)
t.setText(t.getText().concat("6"));
if(e.getSource()==b9)
t.setText(t.getText().concat("7"));
if(e.getSource()==b10)
t.setText(t.getText().concat("8"));
if(e.getSource()==b11)
t.setText(t.getText().concat("9"));
if(e.getSource()==b13)
t.setText(t.getText().concat("0"));
if(e.getSource()==b14)
t.setText(t.getText().concat("."));
if(e.getSource()==b4)
{
a=Double.parseDouble(t.getText());
opt=1;
t.setText("");
}
if(e.getSource()==b8)
{
a=Double.parseDouble(t.getText());
opt=2;
t.setText("");
}
if(e.getSource()==b12)
{
a=Double.parseDouble(t.getText());
opt=3;
t.setText("");
}
if(e.getSource()==b15)
{
a=Double.parseDouble(t.getText());
opt=4;
t.setText("");
}
if(e.getSource()==b16)
{
b=Double.parseDouble(t.getText());
switch(opt)
{
case 1: res=a+b;
break;
case 2: res=a-b;
break;
case 3: res=a*b;
break;
case 4: res=a/b;
break;
default: res=0;
}
t.setText(""+res);
}
if(e.getSource()==b18)
t.setText("");
if(e.getSource()==b17)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
public static void main(String args[])
{
 GridCal obj=new GridCal();
}
}