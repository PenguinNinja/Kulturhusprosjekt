/*package kulturhusprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AdminWindow extends JFrame implements ActionListener
{
    private JList lokale, kontaktPerson, arrangement;
    private JButton adminLokale, adminKontaktInfo, adminArrangement;
    
    public AdminWindow()
    {
        super("Administrasjon");
        lokale = new JList();
        kontaktPerson = new JList();
        arrangement = new JList();
        
        lokale.setVisibleRowCount( 20 );
        lokale.setFixedCellWidth( 100 );
        lokale.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        
        kontaktPerson.setVisibleRowCount( 20 );
        kontaktPerson.setFixedCellWidth( 100 );
        kontaktPerson.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        
        arrangement.setVisibleRowCount( 20 );
        arrangement.setFixedCellWidth( 100 );
        arrangement.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        
        setLayout( new GridBagLayout() );
        GridBagConstraints c = new GridBagConstraints();
        
        adminLokale = new JButton("Administrer lokale");
        adminKontaktInfo = new JButton("Administrer KontaktPerson");
        adminArrangement = new JButton("Administrer Arrangement");
        
        adminLokale.addActionListener(this);
        adminKontaktInfo.addActionListener(this);
        adminArrangement.addActionListener(this);
        
        c.weightx = 1;
        c.weighty = 5;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 3;
	c.ipady = 0;
	c.fill = GridBagConstraints.CENTER;
	c.gridx = 0;
	c.gridy = 0;
	add(new JLabel("-- Kulturhuset Admin --"), c);
        
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 5;
        add( new JLabel("LOKALE"), c);
        
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 5;
        add( new JLabel("KONTAKT PERSON"), c);
        
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 5;
        add( new JLabel("ARRANGEMENT"), c);
        
        
    }
}
*/