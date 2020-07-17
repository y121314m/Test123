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
	
	//���񲼾�,����,һ��
	leftPanel.setLayout(new GridLayout(4,1)); 
	JButton btnPrev=new JButton("ǰһ��");
	JButton btnNext=new JButton("��һ��");
	JButton btnTwo=new JButton("�ڶ���");
	JButton btnThree=new JButton("������");
	
	leftPanel.add(btnPrev);
	leftPanel.add(btnNext);
	leftPanel.add(btnTwo);
	leftPanel.add(btnThree);		
	
	//�м�������,��Ϊ��Ƭ����
	final CardLayout cl=new CardLayout(); //��Ƭ����
	centerPanel.setLayout(cl);   
	centerPanel.add(new JButton("1"),"A");
	centerPanel.add(new JButton("2"),"B");
	centerPanel.add(new JButton("3"),"C");
	centerPanel.add(new JButton("4"),"D");
	centerPanel.add(new JButton("5"),"E");
	centerPanel.add(new JButton("6"),"F");		
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//���ڰ�ť�¼�������ڲ���
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("ǰһ��")){
				cl.previous(centerPanel);
			}
			
			else if(e.getActionCommand().equals("��һ��")){
				cl.next(centerPanel);
			}
			else if(e.getActionCommand().equals("�ڶ���")){
				cl.show(centerPanel,"D");
			}
			else if(e.getActionCommand().equals("������")){
				cl.show(centerPanel, "E");  //ָ����ʾ��һ��
			}
		}

	}
	
	MyActionListener listener = new MyActionListener();
	
	btnPrev.addActionListener(listener);
	btnNext.addActionListener(listener);
	btnTwo.addActionListener(listener);
	btnThree.addActionListener(listener);
}
	/*JButton btn = new JButton("��ť");
	btn.setBounds(20, 50, 100, 50); //��x,y,width,height��
	jframe.add(btn);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
}
