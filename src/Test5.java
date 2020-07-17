import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Test5 {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setSize(200, 250);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	//JPanel jp=new JPanel(new FlowLayout());
	GridLayout layout=new GridLayout(3,3);
	JPanel jp = new JPanel(layout);
	JButton btn1=new JButton("按钮一");
	JButton btn2=new JButton("按钮二");
	JButton btn3=new JButton("按钮三");
	JButton btn4=new JButton("按钮四");
	JButton btn5=new JButton("按钮五");
	JButton btn6=new JButton("按钮六");
	JButton btn7=new JButton("按钮七");
	jp.add(btn1);
	jp.add(btn2);
	jp.add(btn3);
	jp.add(btn4);
	jp.add(btn5);
	jp.add(btn6);
	jp.add(btn7);
	frame.setVisible(true);
	frame.setContentPane(jp);
}
}
