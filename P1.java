import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public  class P1 extends JFrame implements ActionListener{
	   JTextField a;
	   JButton b;
	   JLabel c;
	   JTextArea d;
	
	P1(){
		a=new JTextField(11);
		b=new JButton("确定");
		c=new JLabel("小猪的名字叫");
		c.setIcon(new ImageIcon("d:\\a.jpg"));
		d=new JTextArea(14,30);
		a.addActionListener(this);
		b.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		add(c);
		add(a);
		add(b);
	    add(new JLabel("输出:"));
		add(d);
		this.setVisible(true);
		this.setSize(400,400);
	}
	public void actionPerformed(ActionEvent e) {
		String s=a.getText();
		if(e.getSource()==b){
			d.setText(s);
		}
		if(e.getSource()==a){
			d.setText(s);
		}
	}
	public static void main(String[] args) {
		  P1 win=new P1();
	      win.setBounds(100,100,310,260);
	      win.setTitle("乔治");
		
	
	}

}
