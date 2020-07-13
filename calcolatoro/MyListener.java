package calcolatoro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    static String firstNumber = "";
    static char operator = '+';
    static String secondNumber = "";
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == KeyPad.button0) {
            Screen.field.setText(Screen.field.getText() + "0");
        }
        else if(e.getSource() == KeyPad.button1) {
            Screen.field.setText(Screen.field.getText() + "1");
        }
        else if(e.getSource() == KeyPad.button2) {
            Screen.field.setText(Screen.field.getText() + "2");
        }
        else if(e.getSource() == KeyPad.button3) {
            Screen.field.setText(Screen.field.getText() + "3");
        }
        else if(e.getSource() == KeyPad.button4) {
            Screen.field.setText(Screen.field.getText() + "4");
        }
        else if(e.getSource() == KeyPad.button5) {
            Screen.field.setText(Screen.field.getText() + "5");
        }
        else if(e.getSource() == KeyPad.button6) {
            Screen.field.setText(Screen.field.getText() + "6");
        }
        else if(e.getSource() == KeyPad.button7) {
            Screen.field.setText(Screen.field.getText() + "7");
        }
        else if(e.getSource() == KeyPad.button8) {
            Screen.field.setText(Screen.field.getText() + "8");
        }
        else if(e.getSource() == KeyPad.button9) {
            Screen.field.setText(Screen.field.getText() + "9");
        }
        else if(e.getSource() == KeyPad.buttonEmpty1) {
            Screen.field.setText(Screen.field.getText() + "E1");
        }
        else if(e.getSource() == KeyPad.buttonEmpty2) {
            Screen.field.setText(Screen.field.getText() + "E2");
        }
        else if(e.getSource() == KeyPad.buttonAdd) {
            firstNumber = Screen.field.getText();
            operator = '+';
            Screen.field.setText("");
        }
        else if(e.getSource() == KeyPad.buttonSub) {
            firstNumber = Screen.field.getText();
            operator = '-';
            Screen.field.setText("");
        }
        else if(e.getSource() == KeyPad.buttonMulti) {
            firstNumber = Screen.field.getText();
            operator = '*';
            Screen.field.setText("");
        }
        else if(e.getSource() == KeyPad.buttonDivid) {
            firstNumber = Screen.field.getText();
            operator = '/';
            Screen.field.setText("");
        }
        else if(e.getSource() == KeyPad.buttonDot) {
            Screen.field.setText(Screen.field.getText() + ".");
        }
        else if(e.getSource() == KeyPad.buttonClear) {
            Screen.field.setText("");
        }
        else if(e.getSource() == KeyPad.buttonBack) {
            
        }
        else if(e.getSource() == KeyPad.buttonEqual) {
            secondNumber = Screen.field.getText();
            int convertFirstNumber = Integer.parseInt(firstNumber);
            int convertSecondNumber = Integer.parseInt(secondNumber);
            switch (operator) {
                case '+':
                    Screen.field.setText(""+ (convertFirstNumber + convertSecondNumber));
                    break;
                case '-':
                    Screen.field.setText(""+ (convertFirstNumber - convertSecondNumber));
                    break;
                case '*':
                    Screen.field.setText(""+ (convertFirstNumber * convertSecondNumber));
                    break;
                case '/':
                    Screen.field.setText(""+ (convertFirstNumber / convertSecondNumber));
                    break;
            }
        }
    }   
    
}
