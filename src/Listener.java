import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Listener implements ActionListener {



    JLabel lbl;

    Listener(JLabel lbl) {
        this.lbl = lbl;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        lbl.setText("Hier soll der Wechsel in die Berechnung kommen");

    }
}
