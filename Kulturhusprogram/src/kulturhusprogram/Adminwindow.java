package kulturhusprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Adminwindow extends JFrame{
    private JTextField searchField;
    private JTextArea place, contact, event;
    private JButton adminPlace, adminContact, adminEvent;
    
    public Adminwindow(){
        super("Administrering");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        
        pane.add(new Label("Administrering av kulturhuset"), c);
        
        c.weightx = 1;
        c.gridx = 2;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        
        searchField = new JTextField(10);
        searchField.setText("søk");
        
        pane.add(searchField, c);
        
        c.weighty = 0;
        c.weightx = 0.5;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
       // c.fill = GridBagConstraints.BOTH;
        c.ipady = 50;
        
        place = new JTextArea(20,25);
        place.setEditable(false);
        pane.add(place, c);
                
        c.gridx = 1;
        
        contact = new JTextArea(20,25);
        contact.setEditable(false);
        
        pane.add(contact, c);
        
        c.gridx = 2;
        
        event = new JTextArea(20,25);
        event.setEditable(false);
        
        pane.add(event, c);
        
        adminPlace = new JButton("Administrer lokaler");
        
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 0;
        c.weighty = 1;
        
        pane.add(adminPlace, c);
        
        c.gridx = 1;
        
        adminContact = new JButton("Administrer kontaktperson");
        
        pane.add(adminContact, c);
        
        c.gridx = 2;
        
        adminEvent = new JButton("Administrer arrangement");
        
        pane.add(adminEvent, c);
        
        setSize(1000,500);
        setVisible(false);
    }
}
