import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Test1 {
public static void main(String[] args) {
	JFrame jf=new JFrame("����������");//��������,����Ϊ:����������
	jf.setLocation(400, 200); //����λ��
	jf.setSize(700, 500); //���ô�С
	jf.setLayout(new FlowLayout());  //������ʽ����
	
	//����������
	Container cont = jf.getContentPane();
	//����ı�
	JLabel label=new JLabel("�û���:");	
	JLabel label1 = new JLabel(new ImageIcon("./src/1.PNG"));  //���ñ�ǩͼƬ
	cont.add(label);
	cont.add(label1);
	
	//����ı���
	JTextField userN = new JTextField();
	userN.setText("GUI");
	System.out.println(userN.getText());    //�õ��ı����е�ֵ
	cont.add(userN);
	
	//����ı���
	JTextArea textArea=new JTextArea(20,20);
	textArea.setText("��ע����������:");
	textArea.append("���ǿ��:");  //׷���ı�
	cont.add(textArea);
	
	//���ð�ť
	JButton button = new JButton("���");

	cont.add(button);
	
	//���ø�ѡ��
	JCheckBox checkBox = new JCheckBox("����",true);
	System.out.println(checkBox.getText());
	cont.add(checkBox);
	
	//���õ�ѡ��ť
	JRadioButton radio1 = new JRadioButton("��",true);
	cont.add(radio1);
	JRadioButton radio2 = new JRadioButton("Ů",false);
	cont.add(radio2);
	
	//���õ�ѡ��ť��
	ButtonGroup bg = new ButtonGroup();
	bg.add(radio1);
	bg.add(radio2);
	
	//���������б�
	String [] items = {"��һ","���","����"};
	JComboBox<String> sel = new JComboBox<String>(items);
	sel.addItem("����");
	sel.setSelectedIndex(1);  //����������Ĭ����
	System.out.println(sel.getSelectedItem());
	cont.add(sel);
	
	//���ñ��
	//û����ʾ����	
	String [] colName = {"ѧ��","����","�Ա�","����",}; 
	DefaultTableModel dt = new DefaultTableModel(colName,0);
	
	dt.addRow(new String[]{"18111111","����","��","15"});
	dt.addRow(new String[]{"18222222","����","��","19"});
	dt.addRow(new String[]{"18333333","����","��","16"});
	dt.addRow(new String[]{"18444444","����","Ů","18"});
	
	JTable table = new JTable(dt);
	table.setRowHeight(60);
	
	JScrollPane jp = new JScrollPane(table);   //���ù������
	jp.setPreferredSize(new Dimension(400, 200));  //���ù�������С
	jf.add(jp);  //�ڴ�������ӹ������
	
	//���ò˵�
	JMenuBar menuBar = new JMenuBar();
	jf.setJMenuBar(menuBar);
	
	JMenu menu1 = new JMenu("�ļ�");  //һ���˵�
	JMenu menu2 = new JMenu("����");
	
	menuBar.add(menu1);
	menuBar.add(menu2);
	
	menu1.add(new JMenuItem("��")); //��Ӷ����˵�
	menu1.add(new JMenuItem("����")); //��Ӷ����˵�
	
	//jf.pack();//�Զ�ƥ�䴰���С ,setSize()������ʧЧ
//jf.setLocationRelativeTo(null);  //���ô��������ָ�������λ�á���������ǰδ��ʾ���� c Ϊ null����˴��ڽ�������Ļ�����롣
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
