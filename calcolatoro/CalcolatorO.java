package calcolatoro;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class CalcolatorO {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculator from git...");
                
        MenuBar bar = new MenuBar();
        
        Screen field = new Screen();
        
        KeyPad keyPad = new KeyPad();
        
        frame.add(field, BorderLayout.PAGE_START);
        frame.add(keyPad, BorderLayout.CENTER);
        
        frame.setJMenuBar(bar);
                       
        frame.setResizable(false);
        frame.setLocation(600, 250);
        frame.setSize(210, 310);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
