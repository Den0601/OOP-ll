import java.awt.*;
import java.awt.event.*;

public class w5calculate {
    private static Frame cal = new Frame("a1083320的計算機");
    private static Panel pn1 = new Panel(new GridLayout(4, 3));
    private static Panel pn2 = new Panel(new GridLayout(4, 1));
    private static Label lab = new Label("0", Label.RIGHT);

    private static Button delete, add, sub, mul, div, eql;
    private static Button ary[] = new Button[10];;

    private static long num;
    private static byte op;

    public static void main(String args[]) {
        cal.setLayout(null);
        cal.setBounds(450, 250, 160, 180);

        lab.setBounds(20, 30, 120, 20);
        lab.setBackground(new Color(240, 220, 190));
        pn1.setBounds(20, 60, 90, 105);
        pn2.setBounds(110, 60, 30, 105);

        for (int i = 9; i >= 0; i--) {
            ary[i] = new Button(Integer.toString(i));
            pn1.add(ary[i]);
            ary[i].addActionListener(new ActLis());

        }
        // Button one = new Button(Integer.toString(1));
        // pn1.add(one);
        // one.addActionListener(new ActLis());
        // Button two = new Button(Integer.toString(2));
        // pn1.add(two);
        // two.addActionListener(new ActLis());
        // Button three = new Button(Integer.toString(3));
        // pn1.add(three);
        // three.addActionListener(new ActLis());
        // Button four = new Button(Integer.toString(4));
        // pn1.add(four);
        // four.addActionListener(new ActLis());
        // Button five = new Button(Integer.toString(5));
        // pn1.add(five);
        // five.addActionListener(new ActLis());
        // Button six = new Button(Integer.toString(6));
        // pn1.add(six);
        // six.addActionListener(new ActLis());
        // Button seven = new Button(Integer.toString(7));
        // pn1.add(seven);
        // seven.addActionListener(new ActLis());
        // Button eight = new Button(Integer.toString(8));
        // pn1.add(eight);
        // eight.addActionListener(new ActLis());
        // Button night = new Button(Integer.toString(9));
        // pn1.add(night);
        // night.addActionListener(new ActLis());
        // Button zero = new Button(Integer.toString(0));
        // pn1.add(zero);
        // zero.addActionListener(new ActLis());

        delete = new Button("C");
        pn1.add(delete);
        delete.addActionListener(new ActLis());

        eql = new Button("=");
        pn1.add(eql);
        eql.addActionListener(new ActLis());

        add = new Button("+");
        pn2.add(add);
        add.addActionListener(new ActLis());

        sub = new Button("-");
        pn2.add(sub);
        sub.addActionListener(new ActLis());

        mul = new Button("*");
        pn2.add(mul);
        mul.addActionListener(new ActLis());

        div = new Button("/");
        pn2.add(div);
        div.addActionListener(new ActLis());

        cal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        cal.add(lab);
        cal.add(pn1);
        cal.add(pn2);
        cal.setVisible(true);
    }

    public static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) throws NumberFormatException, ArithmeticException {
            long result;

            Button btn = (Button) e.getSource();
            try {

                for (int i = 0; i <= 9; i++) {
                    if (btn == ary[i]) {
                        output_digit(ary[i]);
                        break;
                    }
                }
                if (btn == delete) {
                    result = 0L;
                    num = 0L;
                    op = 0;
                    lab.setText(Long.toString(num));
                } else if (btn == add) {
                    save_num(add);
                    op = 1;
                } else if (btn == sub) {
                    save_num(sub);
                    op = 2;
                } else if (btn == mul) {
                    save_num(mul);
                    op = 3;
                } else if (btn == div) {
                    save_num(div);
                    op = 4;
                } else if (btn == eql) {
                    result = Long.parseLong(lab.getText());

                    switch (op) {
                        case 1:
                            num += result;
                            break;
                        case 2:
                            num -= result;
                            break;
                        case 3:
                            num *= result;
                            break;
                        case 4:
                            num /= result;
                            break;
                        default:
                    }
                    result = 0L;

                    lab.setText(Long.toString(num));
                }
            } catch (NumberFormatException ne) {

            } catch (ArithmeticException ae) {

            }
        }

        private void output_digit(Button btn) {
            lab.setText(Long.toString(Long.parseLong(lab.getText() + btn.getLabel())));
        }

        private void save_num(Button oper) {
            num = Long.parseLong(lab.getText());
            lab.setText(Long.toString(0L));
        }
    }
}
