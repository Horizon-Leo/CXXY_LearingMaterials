import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new JTextField[3];
   Police police; 
   JButton button;
   public Win() {
      setLayout(new FlowLayout());
      Font font = new Font("����",Font.BOLD,36);
      police = new Police(); 
      police.setView(this);//����ǰ���ڴ��ݸ�police��ϵĴ���
      for(int i=0;i<3;i++) {
         text[i]=new JTextField(20);
         text[i].addKeyListener(police);  //���Ӽ����¼�
         text[i].addFocusListener(police);//���ӽ����¼�
         add(text[i]);
         text[i].setFont(font);
      }
      button=new JButton("ȷ��");
      button.addFocusListener(police);
      button.setFont(font);
      add(button);
      setVisible(true); 
      //����ɼ�֮��  text[0]���������뽹��
      text[0].requestFocusInWindow();
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

