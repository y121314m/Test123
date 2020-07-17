import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Test3 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(300,300);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // 创建内容面板，默认使用流式布局
    JPanel panel = new JPanel();
    final JButton btn = new JButton("测试按钮");
    JLabel label = new JLabel();
    label.setText("文本和图片");
    label.setIcon(new ImageIcon("./src/1.PNG"));
    label.setHorizontalTextPosition(SwingConstants.CENTER);   // 水平方向文本在图片中心
    label.setVerticalTextPosition(SwingConstants.BOTTOM);     // 垂直方向文本在图片下方
    panel.add(label);
    jf.setContentPane(panel);
    jf.pack();
    jf.setLocationRelativeTo(null);
    // 添加按钮的点击事件监听器
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 获取到的事件源就是按钮本身
            // JButton btn = (JButton) e.getSource();
            
            System.out.println("按钮被点击");
        }
    });

    panel.add(btn);

    jf.setContentPane(panel);
    
    jf.setVisible(true);
}

}

