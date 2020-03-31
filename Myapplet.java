import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/* <applet code="Myapplet" width="500" height="500"> </applet> */
public class Myapplet extends Applet
{
 	Label l1,l2,l3;
	TextField t1,t2;
	Button button;
	public void init()
	{
		l1=new Label("first number");
		l2=new Label("second number");
		t1=new TextField();
		t2=new TextField();
		button=new Button("add");
		l3=new Label();
		setLayout(null);
		l1.setBounds(30,50,100,20);
       		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		
		t2.setBounds(150,100,100,20);
		button.setBounds(30,180,100,20);
		l3.setBounds(60,200,100,20);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(button);
		add(l3);
		button.addActionListener(new myhandler());
	}
	public class myhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			s=a+b;
			l3.setText("sum is"+s);
		}

	}


}
