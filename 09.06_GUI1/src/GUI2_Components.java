import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2_Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");

        JPanel panel = new JPanel();

        JLabel lb0 = new JLabel("JLabel");

        JButton bt0 = new JButton("JButton");

        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");

        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);

        JTextField tf0 = new JTextField("JTextField");
//        JTextArea ta0 = new JTextArea("JTextArea");

        JTextArea ta0 = new JTextArea(2, 10);

        String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach"};
        JComboBox cbox0 = new JComboBox(fruits);

        JComboBox<String> cbox1 = new JComboBox<>(fruits);
        cbox1.addItem("blueberry");
        cbox1.addItem("strawberry");

        JLabel lbResult = new JLabel("Result");

        rb0.setSelected(true);      // rb0 의 초기값을 true 로 세팅.
        cb1.setSelected(true);      // cb1 의 초기값을 true 로 세팅.
        tf0.setText("전화번호를 입력하세요.");        // tf0 의 초기 텍스트를 "" 로 세팅.

        tf0.addFocusListener(new FocusListener() {      // 포커스 이벤트 처리.
            @Override
            public void focusGained(FocusEvent e) {     // 포커스 얻음
                if (tf0.getText().equals("전화번호를 입력하세요.")) {
                    tf0.setText("");        // tf0 을 클릭하면 "전화번호를 입력하세요." 사라짐.
                }
            }

            @Override
            public void focusLost(FocusEvent e) {       // 포커스 잃음
                if (tf0.getText().equals("")) {                 // tf0 가 빈칸일 경우에
                    tf0.setText("전화번호를 입력하세요.");        // tf0 에서 포커스를 변경하면 "전화번호를 입력하세요." 생김.
                }
            }
        });

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showResult(lb0, bt0, cb0, cb1, rb0, rb1, tf0, ta0, cbox0, lbResult);

//                bt0.setText("Clicked");       // bt0 클릭 시 텍스트를 Clicked 로 바꿔줌.
            }
        });

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                showResult(lb0, bt0, cb0, cb1, rb0, rb1, tf0, ta0, cbox0, lbResult);
//                if (e.getSource() == cb0) {
//                    System.out.println("JCheckbox0 : " + cb0.isSelected());
//                } else if (e.getSource() == cb1) {
//                    System.out.println("JCheckbox1 : " + cb1.isSelected());
//                } else if (e.getSource() == rb0) {
//                    System.out.println("미성년자 : " + rb0.isSelected());
//                } else if (e.getSource() == rb1) {
//                    System.out.println("성인 : " + rb1.isSelected());
//                } else if (e.getSource() == cbox0) {
//                    System.out.println(cbox0.getSelectedItem());
//                }
            }
        };
        cb0.addItemListener(il);
        cb1.addItemListener(il);
        rb0.addItemListener(il);
        rb1.addItemListener(il);
        cbox0.addItemListener(il);

        panel.add(lb0);     panel.add(bt0);     panel.add(cb0);
        panel.add(cb1);     panel.add(rb0);     panel.add(rb1);
        panel.add(tf0);     panel.add(ta0);     panel.add(cbox0);
        panel.add(cbox1);   panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void showResult(JLabel lb0, JButton bt0,
                                   JCheckBox cb0, JCheckBox cb1,
                                   JRadioButton rb0, JRadioButton rb1,
                                   JTextField tf0, JTextArea ta0,
                                   JComboBox cbox0, JLabel lbResult) {
        String result = "";
        result += lb0.getText();
        result += bt0.getText();
        result += cb0.isSelected();
        result += cb1.isSelected();
        result += rb0.isSelected();
        result += rb1.isSelected();
        result += tf0.getText();
        result += ta0.getText();
        result += cbox0.getSelectedIndex();
        result += cbox0.getSelectedItem();

        lbResult.setText(result);
        // 버튼이나 체크박스 클릭 후 bt 클릭 시 result 가 바뀜.
    }
}
