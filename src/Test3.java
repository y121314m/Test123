import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Test3 {
public static void main(String[] args) {
	JFrame jf = new JFrame("���Դ���");
	jf.setSize(300,300);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // ����������壬Ĭ��ʹ����ʽ����
    JPanel panel = new JPanel();
    final JButton btn = new JButton("���԰�ť");
    JLabel label = new JLabel();
    label.setText("�ı���ͼƬ");
    label.setIcon(new ImageIcon("./src/1.PNG"));
    label.setHorizontalTextPosition(SwingConstants.CENTER);   // ˮƽ�����ı���ͼƬ����
    label.setVerticalTextPosition(SwingConstants.BOTTOM);     // ��ֱ�����ı���ͼƬ�·�
    panel.add(label);
    jf.setContentPane(panel);
    jf.pack();
    jf.setLocationRelativeTo(null);
    // ��Ӱ�ť�ĵ���¼�������
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // ��ȡ�����¼�Դ���ǰ�ť����
            // JButton btn = (JButton) e.getSource();
            
            System.out.println("��ť�����");
        }
    });

    panel.add(btn);

    jf.setContentPane(panel);
    
    jf.setVisible(true);
}

}

