package kulturhusprogram;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kulturhusprogram {

    public static void main(String[] args) {
        Mainwindow mainwindow = new Mainwindow();
        

                
                
        
        mainwindow.addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing( WindowEvent e )
                {
                    //mainwindow.skrivTilFil();
                    System.exit( 0 );
                }
    
        });
    }
}
