import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new TextField[3];
   JButton b; 
   Win() {
      setLayout(new FlowLayout());
      for(int i=0;i<3;i++) {
         text[i]=new JTextField(7);
         text[i].addKeyListener(this);  //���Ӽ����¼�
         text[i].addFocusListener(this);
         add(text[i]);
      }
      b=new JButton("ȷ��");
      add(b);
      text[0].requestFocusInWindow();
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

