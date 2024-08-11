import javax.swing.*;
import java.awt.*;
class Example11_4 extends JFrame{
    JTabbedPane p;
    public Example11_4(){
        setBounds(100,100,500,300);
        setVisible(true);
        p = new JTabbedPane(JTabbedPane.LEFT);
        p.add("�ۿ�FlowLayout",new FlowLayoutJPanel());
        p.add("�ۿ�GridLayout",new GridLayoutJPanel());
        p.add("�ۿ�BorderLayout",new BorderLayoutJPanel());
        p.validate();
        add(p,BorderLayout.CENTER); 
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String args[]){
        new Example11_4();
    }
}
