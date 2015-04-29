package kulturhusprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditContactWindow extends JFrame implements ActionListener
{
    private final JTextField navnfelt, mobilfelt, epostfelt, nettsidefelt, firmafelt;
    private final JButton registrer, rediger, slett;
    private final JComboBox velgArrangement;
    
    public EditContactWindow()
    {
        super("Administrering av Kontakt person");
        
        setLayout(new GridLayout(7,2,5,5));
        
        add(new Label("Navn: "));
        navnfelt = new JTextField(20);
        navnfelt.addActionListener(this);
        add(navnfelt);
        
        add( new Label("Tlf: "));
        mobilfelt = new JTextField(20);
        mobilfelt.addActionListener(this);
        add(mobilfelt);
        
        add( new Label("E-post: "));
        epostfelt = new JTextField(20);
        epostfelt.addActionListener(this);
        add(epostfelt);
        
        add( new Label("Nettside: "));
        nettsidefelt = new JTextField(20);
        nettsidefelt.addActionListener(this);
        add(nettsidefelt);
        
        add(new Label("Arrangement: "));
        velgArrangement = new JComboBox();
        add(velgArrangement);
        
        registrer = new JButton("Registrer");
        rediger = new JButton("Rediger");
        slett = new JButton("Slett");
        
        registrer.addActionListener(this);
        rediger.addActionListener(this);
        slett.addActionListener(this);
        
        setSize(300,220);
    }
    
    public void registrer()
    {}
    
    public void rediger()
    {
        
    }
    
    public void slett ()
    {
        
    }
    
    public void actionPerformed( ActionEvent e )
    {
        if(e.getSource() == registrer )
            registrer();
        else if( e.getSource() == rediger )
            rediger();
        else if( e.getSource() == slett )
            slett();
    }
      
}
