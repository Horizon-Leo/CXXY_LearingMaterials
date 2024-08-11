import javax.swing.*;
import java.awt.*;
public class FlowLayoutJPanel extends JPanel {
    FlowLayoutJPanel() {
       add(new JLabel("FlowLayout布局的面板"));
       add(new JButton(new ImageIcon("dog.jpg")));
       add(new JScrollPane(new JTextArea(12,15)));
    }
}