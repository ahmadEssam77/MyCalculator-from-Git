package calcolatoro;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
    
    public MenuBar() {
                
        JMenu view = new JMenu("View");
        JMenuItem standard = new JMenuItem("Standard");
        JMenuItem programmer = new JMenuItem("Programmer");
        JMenuItem scientific = new JMenuItem("Scientific");
        JMenuItem statistics = new JMenuItem("Statistics");
        JMenuItem history = new JMenuItem("History");
        
        JMenu edit = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem history2 = new JMenuItem("History");
        
        JMenu help = new JMenu("Help");
        JMenuItem viewHelp = new JMenuItem("View Help");
        JMenuItem aboutCalculator = new JMenuItem("About Calculatoer");
        
        view.add(standard);
        view.add(scientific);
        view.add(programmer);
        view.add(statistics);
        view.addSeparator();
        view.add(history);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(history2);
        help.add(viewHelp);
        help.addSeparator();
        help.add(aboutCalculator);
        add(view);
        add(edit);
        add(help);
        
    }
    
}
