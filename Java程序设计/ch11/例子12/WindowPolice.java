import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowPolice extends JFrame implements ActionListener{ 
   JTextField text1,text2;
   public WindowPolice() {
      init();
      setBounds(100,100,350,150);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   void init() {
      setLayout(new FlowLayout());
      text1=new JTextField(10);
      text2=new JTextField(10); 
      text1.addActionListener(this); //WindowPolice类的实例（当前窗口）做监视器
      add(text1); 
      add(text2);
      text1.addActionListener(new ActionListener() {  //匿名类实例做监视器
                          public void actionPerformed(ActionEvent e) {
                               String str=text1.getText();
                               if(str.equalsIgnoreCase("Exit")) 
                                  System.exit(0);
                          }}); 

   }
   public void actionPerformed(ActionEvent e) {  //重写接口中的方法
      String str=text1.getText();
      int n=0,m=0;
      try{  
           n=Integer.parseInt(str);
           m=n*n*n;
           text2.setText(""+m);
      }
      catch(Exception ee) {
          text2.setText("请输入数字字符");
          text1.setText(null);
      }
   }
}


