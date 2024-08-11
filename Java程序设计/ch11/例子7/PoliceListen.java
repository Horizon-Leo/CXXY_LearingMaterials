import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class PoliceListen implements ItemListener {
   JComboBox choice;
   JTextArea textShow;
   public void setJComboBox(JComboBox box) {
      choice = box;
   }
   public void setJTextArea(JTextArea area) {
      textShow = area;
   } 
   public void itemStateChanged(ItemEvent e)  {
      textShow.setText(null);
      try{ String fileName = choice.getSelectedItem().toString();
           File file = new File(fileName);
           FileReader inOne = new FileReader(file);
           BufferedReader inTwo = new BufferedReader(inOne);
           String s=null;
           while((s=inTwo.readLine())!=null) {
             textShow.append(s+"\n");
           }
           inOne.close();
           inTwo.close();
      }
      catch(Exception ee) {
          textShow.append(ee.toString());
      }
   }
}
