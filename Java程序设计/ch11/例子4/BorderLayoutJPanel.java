import javax.swing.*;
import java.awt.*;
class BorderLayoutJPanel extends JPanel {
    JButton bSouth,bNorth,bEast,bWest;
    JTextArea bCenter;
    BorderLayoutJPanel() {
        setLayout(new BorderLayout());
        bSouth=new JButton("��");
        bNorth=new JButton("��");
        bEast =new JButton("��");
        bWest =new JButton("��");
        bCenter=new JTextArea("����");
        add(bNorth,BorderLayout.NORTH);
        add(bSouth,BorderLayout.SOUTH);
        add(bEast,BorderLayout.EAST);
        add(bWest,BorderLayout.WEST); 
        add(bCenter,BorderLayout.CENTER);
        validate();
    }
}