import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창 이름");
        int 화w, 화h, 창w = 400, 창h = 200;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        화w = screenSize.width;
        화h = screenSize.height;
        frame.setPreferredSize(new Dimension(창w, 창h));        // 프레임 크기
        frame.setLocation((화w-창w)/2, (화h-창h)/2);            // 프레임 위치

        JPanel panel = new JPanel();
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        JButton button = new JButton("오예!");

        panel.add(label);       // 패널은 여러 컴퍼넌트를 넣을 수 있음. (수직 가운데 수평 위 정렬 )
        panel.add(button);

        frame.add(panel);       // 한 프레임 당 하나의 컴퍼넌트를 넣을 수 있음. => 패널 사용. (수직 수평 가운데 정렬 )

        frame.pack();           // 구성요소가 있으면 구성요소만큼 창 크기가 변함.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // X 버튼 누르면 종료
    }
}
