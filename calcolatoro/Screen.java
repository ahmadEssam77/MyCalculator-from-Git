package calcolatoro;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Screen extends JPanel{
    static JTextField field;
    public Screen() {
        
        field = new JTextField();
        
        field.setEnabled(false);
        field.setDisabledTextColor(Color.GRAY);
        field.setFont(new Font("serif", Font.BOLD, 30));
        field.setText("");
        
        JPanel panel = new JPanel();
        ButtonGroup group1 = new ButtonGroup();
        JRadioButton on = new JRadioButton("On");
        JRadioButton off = new JRadioButton("Off");
        
        group1.add(on);
        group1.add(off);
        
        panel.add(on);
        panel.add(off);
        
        setLayout(new GridLayout(2, 1));  // set layout 
        add(field);
        add(panel);
    }
    
}
