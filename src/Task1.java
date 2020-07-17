import java.awt.*;

import javax.swing.*;

public class Task1 {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(750,600);	
	JPanel leftPanel = new JPanel();
	 JPanel rightPanel = new JPanel();
	 leftPanel.setLayout(null);
	 rightPanel.setLayout(null);
	 leftPanel.setPreferredSize(new Dimension(250, 100)); 
	 ImageIcon image=new ImageIcon("./src/1.PNG");
	 JLabel jlabel=new JLabel();
	 jlabel.setIcon(image);
	 frame.add(leftPanel,BorderLayout.WEST);
	 jlabel.setBounds(10, 10, 300, 250);
	 leftPanel.add(jlabel);
	 frame.add(rightPanel);
		JLabel label2=new JLabel("学号");
        JLabel label3=new JLabel("姓名");
        JLabel label4=new JLabel("性别");
        JLabel label5=new JLabel("年龄");
        JLabel label6=new JLabel("手机");
        JLabel label7=new JLabel("地址");
	    JRadioButton radio1 = new JRadioButton("男",true);
		JRadioButton radio2 = new JRadioButton("女",false);
		//设置单选按钮组
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		 rightPanel.add(radio1);
		 rightPanel.add(radio2);
		 JTextField jtf=new JTextField(10);
		 JTextField jtf1=new JTextField(10);
		 JTextField jtf2=new JTextField(10);
		 JTextField jtf3=new JTextField(10);
		 JTextField jtf4=new JTextField(10);
		 JTextField jtf5=new JTextField(10);
		 JButton jbt1=new JButton("添加图片");
		 JButton jbt2=new JButton("增加记录");
		 JButton jbt3=new JButton("修改记录");
		 JButton jbt4=new JButton("删除记录");
		 radio1.setBounds(150, 130, 50, 20);
		 radio2.setBounds(200, 130, 50, 20);
		 jbt1.setBounds(0, 300, 90, 30);
		 jbt2.setBounds(120, 300, 90, 30);
		 jbt3.setBounds(240, 300, 90, 30);
		 jbt4.setBounds(360, 300, 90, 30);
		 label2.setBounds(100,50, 50,50);
		 label3.setBounds(100,80, 50,50);
		 label6.setBounds(100,145, 50,50);
		 label7.setBounds(100,175, 50,50);
		 label5.setBounds(100,205, 50,50);
		 label4.setBounds(100,115, 50,50);
		 jtf1.setBounds(150,35,150,20);
		 jtf1.setBounds(150,65,150,20);
		 jtf2.setBounds(150,95,150,20);
		 jtf3.setBounds(150,160,150,20);
		 jtf4.setBounds(150,190,150,20);
		 jtf5.setBounds(150,220,150,20);

		 rightPanel.add(label2);
         rightPanel.add(label3);
	     rightPanel.add(label4);
	     rightPanel.add(label5);
	     rightPanel.add(label6);
	     rightPanel.add(label7);
	     rightPanel.add(jtf);
	     rightPanel.add(jtf1);
	     rightPanel.add(jtf2);
	     rightPanel.add(jtf3);
	     rightPanel.add(jtf4);
	     rightPanel.add(jtf5);
	     rightPanel.add(jbt1);
	     rightPanel.add(jbt2);
	     rightPanel.add(jbt3);
	     rightPanel.add(jbt4);

		//设置菜单
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("编辑");
		JMenu menu3 = new JMenu("视图");
		JMenu menu4 = new JMenu("帮助");
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}

}
