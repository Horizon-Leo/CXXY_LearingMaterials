import javax.swing.event.*;
import javax.swing.*;
import java.util.*;
public class PoliceListen implements DocumentListener {
   JTextArea inputText,showText;
   public void setInputText(JTextArea text) {
      inputText = text;
   }
   public void setShowText(JTextArea text) {
      showText = text;
   } 
   public void changedUpdate(DocumentEvent e) {
      String str=inputText.getText(); 
     //�ո����ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ:
      String regex="[\\s\\d\\p{Punct}]+"; 
      String words[]=str.split(regex); 
      Arrays.sort(words);      //���ֵ����С��������
      showText.setText(null); 
      for(String s:words)
        showText.append(s+",");
   }
   public void removeUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
   public void insertUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
}
