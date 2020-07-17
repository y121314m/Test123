import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test4 {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(300, 500);
	//frame.setLayout(null);
	JPanel leftPanel = new JPanel();
	final JPanel centerPanel = new JPanel();
	
	frame.add(leftPanel,BorderLayout.WEST);
	frame.add(centerPanel);
	
	//网格布局,三行,一列
	leftPanel.setLayout(new GridLayout(4,1)); 
	JButton btnPrev=new JButton("前一个");
	JButton btnNext=new JButton("后一个");
	JButton btnTwo=new JButton("第二个");
	JButton btnThree=new JButton("第三个");
	
	leftPanel.add(btnPrev);
	leftPanel.add(btnNext);
	leftPanel.add(btnTwo);
	leftPanel.add(btnThree);		
	
	//中间的主面板,设为卡片布局
	final CardLayout cl=new CardLayout(); //卡片布局
	centerPanel.setLayout(cl);   
	centerPanel.add(new JButton("1"),"A");
	centerPanel.add(new JButton("2"),"B");
	centerPanel.add(new JButton("3"),"C");
	centerPanel.add(new JButton("4"),"D");
	centerPanel.add(new JButton("5"),"E");
	centerPanel.add(new JButton("6"),"F");		
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//用于按钮事件处理的内部类
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("前一个")){
				cl.previous(centerPanel);
			}
			
			else if(e.getActionCommand().equals("后一个")){
				cl.next(centerPanel);
			}
			else if(e.getActionCommand().equals("第二个")){
				cl.show(centerPanel,"D");
			}
			else if(e.getActionCommand().equals("第三个")){
				cl.show(centerPanel, "E");  //指定显示哪一个
			}
		}

	}
	
	MyActionListener listener = new MyActionListener();
	
	btnPrev.addActionListener(listener);
	btnNext.addActionListener(listener);
	btnTwo.addActionListener(listener);
	btnThree.addActionListener(listener);
}
	/*JButton btn = new JButton("按钮");
	btn.setBounds(20, 50, 100, 50); //（x,y,width,height）
	jframe.add(btn);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
}
