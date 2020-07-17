import java.awt.*;

import javax.swing.*;


public class Test2 {
public static void main(String[] args) {
	JFrame jframe=new JFrame("主窗口");
	jframe.setSize(500, 400);
	jframe.setLayout(new FlowLayout());
	jframe.add(new JButton("英语"),BorderLayout.SOUTH);
	jframe.add(new JButton("高数"));
	jframe.add(new JButton("Java"),BorderLayout.NORTH);
	jframe.add(new JButton("操作系统"));
	jframe.add(new JButton("Web"));
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
}
