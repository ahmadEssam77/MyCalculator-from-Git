package calcolatoro;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class KeyPad extends JPanel{
    static JButton button0 = new JButton("0");
    static JButton button1 = new JButton("1");
    static JButton button2 = new JButton("2");
    static JButton button3 = new JButton("3");
    static JButton button4 = new JButton("4");
    static JButton button5 = new JButton("5");
    static JButton button6 = new JButton("6");
    static JButton button7 = new JButton("7");
    static JButton button8 = new JButton("8");
    static JButton button9 = new JButton("9");
    
    static JButton buttonAdd = new JButton("+");
    static JButton buttonSub = new JButton("-");
    static JButton buttonMulti = new JButton("*");
    static JButton buttonDivid = new JButton("/");
    static JButton buttonDot = new JButton(".");
    static JButton buttonEqual = new JButton("=");
    
    static JButton buttonClear = new JButton("C");
    static JButton buttonBack = new JButton("back");
    static JButton buttonEmpty1 = new JButton("E1");
    static JButton buttonEmpty2 = new JButton("E2");

    public KeyPad() {
        GridLayout grid = new GridLayout(5, 4, 3, 3);
        setLayout(grid);
        
        
        add(buttonClear);
        add(buttonBack);
        add(buttonEmpty1);
        add(buttonEmpty2);
        add(button7);
        add(button8);
        add(button9);
        add(buttonDivid);
        add(button4);
        add(button5);
        add(button6);
        add(buttonMulti);
        add(button1);
        add(button2);
        add(button3);
        add(buttonSub);
        add(button0);
        add(buttonDot);
        add(buttonEqual);
        add(buttonAdd);
        
        
        
        MyListener listener = new MyListener();
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        buttonDivid.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        buttonMulti.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        buttonSub.addActionListener(listener);
        button0.addActionListener(listener);
        buttonDot.addActionListener(listener);
        buttonAdd.addActionListener(listener);
        buttonEqual.addActionListener(listener);
        buttonClear.addActionListener(listener);
        buttonBack.addActionListener(listener);
        buttonEmpty1.addActionListener(listener);
        buttonEmpty2.addActionListener(listener);
    }
            
}
