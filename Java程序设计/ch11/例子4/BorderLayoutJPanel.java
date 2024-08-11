import javax.swing.*;
import java.awt.*;
class BorderLayoutJPanel extends JPanel {
    JButton bSouth,bNorth,bEast,bWest;
    JTextArea bCenter;
    BorderLayoutJPanel() {
        setLayout(new BorderLayout());
        bSouth=new JButton("南");
        bNorth=new JButton("北");
        bEast =new JButton("东");
        bWest =new JButton("西");
        bCenter=new JTextArea("中心");
        add(bNorth,BorderLayout.NORTH);
        add(bSouth,BorderLayout.SOUTH);
        add(bEast,BorderLayout.EAST);
        add(bWest,BorderLayout.WEST); 
        add(bCenter,BorderLayout.CENTER);
        validate();
    }
}