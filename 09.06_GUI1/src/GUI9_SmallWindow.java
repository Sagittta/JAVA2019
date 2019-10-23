import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton bt0 = new JButton("작은 창1");
        JButton bt1 = new JButton("작은 창2");

        JDialog dialog = new JDialog(frame,"다이얼로그", false);      // modal true : dialog 가 꺼지지 않으면 frame 으로 이동 불가능
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);
        dialog.setSize(100, 200);

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, "메시지", "제목", JOptionPane.INFORMATION_MESSAGE);

//                int select = JOptionPane.showConfirmDialog(null, "저장할까요?");
//                System.out.println(select);

                String lucky = JOptionPane.showInputDialog(frame, "너의 행운의 번호는?");
                System.out.println(lucky);
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        panel.add(bt0);
        panel.add(bt1);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
