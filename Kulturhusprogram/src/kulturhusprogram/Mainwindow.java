package kulturhusprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainwindow extends JFrame{
    Adminwindow adminwindow = new Adminwindow();
    //TicketsWindow ticketsWindow = new TicketsWindow();
    
    private JTextField searchField;
    private JTextArea info, cal; //Kalenderen blir til liste senere
    private JButton cinema, theater, other, all, ticket, admin, search;
    
    public Mainwindow(){
        super("Kulturhuset");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.weighty = 1;
        
        c.gridx = 1;
        c.gridy = 0;
        
        c.anchor = GridBagConstraints.CENTER;
        
        pane.add(new Label("Kulturhusets hjemmeside"), c);
        
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        all = new JButton("Hele programmet");
        pane.add(all, c);
        
        c.insets = new Insets(30,0,0,0);
        
        cinema = new JButton("Kino");
        pane.add(cinema, c);
        
        c.insets = new Insets(60,0,0,0);
        
        theater = new JButton("Theater");
        pane.add(theater, c);
        
        c.insets = new Insets(90,0,0,0);
        
        other = new JButton("Annet");
        pane.add(other, c);
        
        c.insets = new Insets(0,0,0,0);
        
        c.weightx = 0;
        c.gridx = 2;
        c.gridy = 0;
        c.ipadx = 40;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.NONE;
        
        searchField = new JTextField(10);
        
        pane.add(searchField, c);
       
        c.ipadx = 40;
        c.anchor = GridBagConstraints.LINE_END;
        
        search = new JButton("Søk");
        
        pane.add(search, c);
        
        c.weighty = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        c.gridheight = 2;
        
        info = new JTextArea(20,20);
        info.setEditable(false);
        pane.add(info, c);
                
        c.fill = GridBagConstraints.NONE;
        c.gridx = 2;
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridheight = 1;
        c.ipadx = 100;
        c.ipady = 40;
        
        pane.add(new Label("Kalender"), c);
        
        c.anchor = GridBagConstraints.CENTER;
        
        cal = new JTextArea(10,10);
        cal.setEditable(false);
        
        pane.add(cal, c);
        
        c.ipadx = 0;
        c.ipady = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 1;
        c.gridy = 3;
        c.weighty = 1;
        
        ticket = new JButton("Billetter");
        pane.add(ticket, c);
        
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        
        admin = new JButton("Administrer");
        
        pane.add(admin, c);
        
        ButtonListener actListener = new ButtonListener();
        
        admin.addActionListener(actListener);
        ticket.addActionListener(actListener);
        cinema.addActionListener(actListener);
        other.addActionListener(actListener);
        theater.addActionListener(actListener);
        all.addActionListener(actListener);
        
        searchField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    
                }
            }
        });
        
        setSize(1000,500);
        setVisible(true);
    }
    
    /*
    public void skrivTilFil(){

 			try(ObjectOutputStream ut = new ObjectOutputStream( new FileOutputStream("baatdata.dta"))){

 				ut.writeObject(register);

 			}
 			catch(NotSerializableException nse){
 				//feilmelding
 			}
 			catch(IOException io){
 				//feilmelding
 			}
 		}

 		public void lesFraFil(){
 			try(ObjectInputStream inn = new ObjectInputStream( new FileInputStream("baatdata.dta"))){

 				register = (Medlemsregister)inn.readObject();
 			}
 			catch(ClassNotFoundException cnfe){
 				//feilmelding
 				register = new Medlemsregister();
 			}
 			catch(FileNotFoundException fnfe){
 				register = new Medlemsregister();
 			}
 			catch(IOException io){
 				register = new Medlemsregister();
 			}
 	}*/
        
    private class ButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == admin){
                adminwindow.setVisible(true);
            }     
            
            else if(e.getSource() == ticket){
                //ticketsWindow.setVisible(true);
            }
            
            else if(e.getSource() == cinema){
                
            }
            
            else if(e.getSource() == theater){
                
            }
            
            else if(e.getSource() == other){
                
            }
            
            else if(e.getSource() == all){
                
            }
            
            else if(e.getSource() == search){
                
            }
        }
    }
}
