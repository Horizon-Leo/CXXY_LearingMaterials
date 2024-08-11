import java.awt.event.*;
public class ReaderListen implements ActionListener { 
   public void actionPerformed(ActionEvent e) {
      String str=e.getActionCommand();
      System.out.println(str+"µÄ³¤¶È:"+str.length());
   }
}
