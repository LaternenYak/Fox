import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    int width = 400;
    int height = 400;
    JLabel text;
    //ImageIcon icon = new ImageIcon(getClass().getResource("red-fox.png"));
    JButton fabricCalculateButton;
    JButton infoButton;
    JButton profileButton;


    public void interfaceFrame() {
        setSize(width,height);
        setTitle("Fox - Fabric Organize Expert v1.3");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(Color.pink);

        text = new JLabel("Wo möchtest du hin?");
        text.setBounds(100,10,200,50);
        Font schrift = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        text.setFont(schrift);
        setForeground(Color.BLACK);
        add(text);


        fabricCalculateButton = new JButton("Stoffe berechnen"); //"icon" für Bild im Button
        fabricCalculateButton.setBackground(Color.lightGray);
        fabricCalculateButton.setBounds(125,50,150,50);
        add(fabricCalculateButton);
        fabricCalculateButton.addActionListener(new Listener(text));


        infoButton = new JButton("Informationen");
        infoButton.setBackground(Color.lightGray);
        infoButton.setBounds(125,150,150,50);
        add(infoButton);

        profileButton = new JButton("Profil");
        profileButton.setBackground(Color.lightGray);
        profileButton.setBounds(125,250,150,50);
        add(profileButton);





    }

}
