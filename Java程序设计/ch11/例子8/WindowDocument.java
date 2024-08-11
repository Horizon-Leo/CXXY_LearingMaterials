import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
public class WindowDocument extends JFrame { 
   JTextArea inputText,showText;
   PoliceListen listen;
   WindowDocument() { 
      init();
      setLayout(new FlowLayout());
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   }
   void init() {
      inputText = new JTextArea(6,8);
      showText = new JTextArea(6,8);
      add(new JScrollPane(inputText));
      add(new JScrollPane(showText));
      listen = new PoliceListen();
      listen.setInputText(inputText);
      listen.setShowText(showText);  
      (inputText.getDocument()).addDocumentListener(listen);//ÏòÎÄµµ×¢²á¼àÊÓÆ÷
   }
}
