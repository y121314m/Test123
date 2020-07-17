import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Test1 {
public static void main(String[] args) {
	JFrame jf=new JFrame("这是主界面");//创建窗体,标题为:这是主界面
	jf.setLocation(400, 200); //设置位置
	jf.setSize(700, 500); //设置大小
	jf.setLayout(new FlowLayout());  //设置流式布局
	
	//获得内容面板
	Container cont = jf.getContentPane();
	//添加文本
	JLabel label=new JLabel("用户名:");	
	JLabel label1 = new JLabel(new ImageIcon("./src/1.PNG"));  //设置标签图片
	cont.add(label);
	cont.add(label1);
	
	//添加文本框
	JTextField userN = new JTextField();
	userN.setText("GUI");
	System.out.println(userN.getText());    //得到文本框中的值
	cont.add(userN);
	
	//添加文本域
	JTextArea textArea=new JTextArea(20,20);
	textArea.setText("请注意下面事项:");
	textArea.append("最后强调:");  //追加文本
	cont.add(textArea);
	
	//设置按钮
	JButton button = new JButton("添加");

	cont.add(button);
	
	//设置复选框
	JCheckBox checkBox = new JCheckBox("西瓜",true);
	System.out.println(checkBox.getText());
	cont.add(checkBox);
	
	//设置单选按钮
	JRadioButton radio1 = new JRadioButton("男",true);
	cont.add(radio1);
	JRadioButton radio2 = new JRadioButton("女",false);
	cont.add(radio2);
	
	//设置单选按钮组
	ButtonGroup bg = new ButtonGroup();
	bg.add(radio1);
	bg.add(radio2);
	
	//设置下拉列表
	String [] items = {"大一","大二","大三"};
	JComboBox<String> sel = new JComboBox<String>(items);
	sel.addItem("大四");
	sel.setSelectedIndex(1);  //按索引设置默认项
	System.out.println(sel.getSelectedItem());
	cont.add(sel);
	
	//设置表格
	//没有显示列名	
	String [] colName = {"学号","姓名","性别","年龄",}; 
	DefaultTableModel dt = new DefaultTableModel(colName,0);
	
	dt.addRow(new String[]{"18111111","张三","男","15"});
	dt.addRow(new String[]{"18222222","李四","男","19"});
	dt.addRow(new String[]{"18333333","刘五","男","16"});
	dt.addRow(new String[]{"18444444","赵六","女","18"});
	
	JTable table = new JTable(dt);
	table.setRowHeight(60);
	
	JScrollPane jp = new JScrollPane(table);   //设置滚动面板
	jp.setPreferredSize(new Dimension(400, 200));  //设置滚动面板大小
	jf.add(jp);  //在窗体中添加滚动面板
	
	//设置菜单
	JMenuBar menuBar = new JMenuBar();
	jf.setJMenuBar(menuBar);
	
	JMenu menu1 = new JMenu("文件");  //一级菜单
	JMenu menu2 = new JMenu("管理");
	
	menuBar.add(menu1);
	menuBar.add(menu2);
	
	menu1.add(new JMenuItem("打开")); //添加二级菜单
	menu1.add(new JMenuItem("保存")); //添加二级菜单
	
	//jf.pack();//自动匹配窗体大小 ,setSize()方法则失效
//jf.setLocationRelativeTo(null);  //设置窗口相对于指定组件的位置。如果组件当前未显示或者 c 为 null，则此窗口将置于屏幕的中央。
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
