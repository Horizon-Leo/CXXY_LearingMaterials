import java.awt.event.*;
import javax.swing.*;
public class Police implements KeyListener,FocusListener  {
    Win view;
    public void setView(Win view){
        this.view = view;
    }
    public void keyTyped(KeyEvent e) {
        JTextField text=(JTextField)e.getSource();
        if(text.getText().length()==6){
             text.setEnabled(false);
             text.transferFocus(); 
        }
    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void focusGained(FocusEvent e) {
        if(e.getSource()==view.button){
          for(int i=0;i<3;i++) {
            view.text[i].setEnabled(true);
          }
        }
        if(e.getSource() instanceof JTextField){
           JTextField text=(JTextField)e.getSource();
           text.setText(null);
        }
        
    }
    public void focusLost(FocusEvent e){}
}
