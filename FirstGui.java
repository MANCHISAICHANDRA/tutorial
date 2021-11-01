package swing;

import javax.swing.*;

public class FirstGui{
	public static void main(String[] args) {
		Abc obj = new Abc();
		//obj.setVisible(true);//older version we use obj.show() which is depricated
		//obj.setSize(400, 400);
		//always better to use them in constructor
	}
}

class Abc extends JFrame{
	public Abc() {
		setVisible(true);
		setSize(400, 400);
		
		JLabel l = new JLabel("Hello world..!!");//adding the label
		add(l);
		
		JLabel l1 = new JLabel("Welcome Chandra..!!");
		add(l1);
	}
}