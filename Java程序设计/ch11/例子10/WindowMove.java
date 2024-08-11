import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new TextField[3];
   JButton b; 
   Win() {
      setLayout(new FlowLayout());
      for(int i=0;i<3;i++) {
         text[i]=new JTextField(7);
         text[i].addKeyListener(this);  //监视键盘事件
         text[i].addFocusListener(this);
         add(text[i]);
      }
      b=new JButton("确定");
      add(b);
      text[0].requestFocusInWindow();
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

