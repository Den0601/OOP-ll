
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class w6image1 extends JFrame {

    private JButton bt;
    private JButton bt1;
    private JLabel label;
    private int i = 2;

    w6image1() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My JFrame");
        setBounds(300, 200, 800, 600);
        setVisible(true);
        getContentPane().setLayout(null);
        label = new JLabel("");
        label.setIcon(new ImageIcon(".//" + i + ".jpg"));
        label.setBounds(111, 44, 217, 200);

        bt = new JButton("上一張圖片");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt1.setEnabled(true);
                i = i - 1;
                label.setIcon(new ImageIcon(".//" + i + ".jpg"));

                if (i == 1) {
                    bt.setEnabled(false);
                    JOptionPane.showMessageDialog(w6image1.this, "前無圖片");
                }

            }
        });
        bt.setBounds(111, 285, 93, 35);
        getContentPane().add(bt);

        bt1 = new JButton("下一張圖片");
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt.setEnabled(true);
                i = i + 1;
                label.setIcon(new ImageIcon(".//" + i + ".jpg"));

                if (i == 3) {
                    bt1.setEnabled(false);
                    JOptionPane.showMessageDialog(w6image1.this, "圖片已結束");
                }

            }
        });

        bt1.setBounds(232, 285, 93, 35);
        getContentPane().add(bt1);
        getContentPane().add(label);
        setVisible(true);

    }
}

public class w6image {
    public static void main(String[] args) {
        w6image1 e = new w6image1();
    }

}
