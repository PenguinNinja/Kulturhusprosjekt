package kulturhusprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Adminwindow extends JFrame{
    private JTextField searchField;
    private JTextArea place, contact, event;
    private JButton adminPlace, adminContact, adminEvent, search, back;
    
    public Adminwindow(){
        super("Administrering");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        
        back = new JButton("Tilbake");
        
        pane.add(back, c);
        
        c.anchor = GridBagConstraints.CENTER;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        
        pane.add(new Label("Administrering av kulturhuset"), c);
        
        c.weightx = 1;
        c.gridx = 2;
        c.anchor = GridBagConstraints.CENTER;
        c.ipadx = 40;
        
        searchField = new JTextField(10);
        
        pane.add(searchField, c);
        c.ipadx = 40;
        
        c.anchor = GridBagConstraints.LINE_END;
        
        search = new JButton("Søk");
        
        pane.add(search, c);
        
        c.ipadx = 0;
        c.weighty = 0;
        c.weightx = 0.5;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
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
        
        ButtonListener actListener = new ButtonListener();
        
        back.addActionListener(actListener);
        adminContact.addActionListener(actListener);
        adminPlace.addActionListener(actListener);
        adminEvent.addActionListener(actListener);
        search.addActionListener(actListener);
        
        searchField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    
                }
            }
        });
        
        setSize(1000,500);
        setVisible(false);
    }
    
     private class ButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == adminPlace){
                
            }
            
            else if(e.getSource() == adminContact){
                
            }
            
            else if(e.getSource() == adminEvent){
                
            }
            
            else if(e.getSource() == search){
                
            }
            
            else if(e.getSource() == back){
                setVisible(false);
            }
        }
     }
}

