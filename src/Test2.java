import java.awt.*;

import javax.swing.*;


public class Test2 {
public static void main(String[] args) {
	JFrame jframe=new JFrame("������");
	jframe.setSize(500, 400);
	jframe.setLayout(new FlowLayout());
	jframe.add(new JButton("Ӣ��"),BorderLayout.SOUTH);
	jframe.add(new JButton("����"));
	jframe.add(new JButton("Java"),BorderLayout.NORTH);
	jframe.add(new JButton("����ϵͳ"));
	jframe.add(new JButton("Web"));
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
}
