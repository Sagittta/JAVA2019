import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        ImageIcon iiJpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/alice.jpg"));
        ImageIcon iiJpg_edit = new ImageIcon(
                iiJpg.getImage().getScaledInstance(
                        iiJpg.getIconWidth()/2, iiJpg.getIconHeight()/2, Image.SCALE_DEFAULT)
        );
        JLabel lbII = new JLabel(iiJpg_edit);
        ImageIcon iiPng = new ImageIcon(GUI8_ImageIcon.class.getResource("img/alice2.png"));
        ImageIcon iiPng_edit = new ImageIcon(
                iiPng.getImage().getScaledInstance(
                        iiPng.getIconWidth()/2, iiPng.getIconHeight()/2, Image.SCALE_DEFAULT)
        );
        JButton btII = new JButton(iiPng_edit);

        panel.add(lbII);
        panel.add(btII);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
