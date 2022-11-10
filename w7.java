import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyJFrame12345 extends JFrame implements ListSelectionListener {
    JTextArea a = new JTextArea("可選擇地名");
    JList list = new JList();

    MyJFrame12345() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My JFrame");
        setBounds(400, 200, 800, 500);
        setVisible(true);
        setLayout(null);

        // JPanel backgrounds = new JPanel();
        String[] data = { "台北", "桃園", "台中", "嘉義", "台南", "高雄" };
        list.setListData(data);
        JScrollPane one = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        one.setBounds(200, 100, 100, 100);
        add(one);
        list.addListSelectionListener(this);
        JScrollPane two = new JScrollPane(a, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        a.setBounds(150, 200, 200, 50);
        a.setLineWrap(true);
        add(a);

        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        StringBuffer selectedCitys = new StringBuffer();

        Object[] selectedItems = list.getSelectedValues();

        for (int i = 0; i < selectedItems.length; i++) {

            selectedCitys.append(selectedItems[i] + "名山" + "\n");

        }

        a.setText(selectedCitys.toString());

        setVisible(true);
    }

}

public class w7 {
    public static void main(String[] args) throws Exception {

        MyJFrame12345 t2 = new MyJFrame12345();

    }
}
