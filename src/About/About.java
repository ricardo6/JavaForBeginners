/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 *
 * @author drupal
 */
public class About extends JFrame {

    private final URI uri;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JButton button;

    public About() throws URISyntaxException {
        this.uri = new URI("http://aprendeinglesgratisenlinea.blogspot.com/");
        setSize(800, 600);
        setTitle("Ricardo Ramirez");
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.decode("#BFCEDC"));
        getRootPane().setWindowDecorationStyle(JRootPane.WIDTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        class OpenUrlAction implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                open(uri);
            }

            private void open(URI uri) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(uri);
                    } catch (IOException e) { /* TODO: error handling */ }
                } else { /* TODO: error handling */ }
            }
        }
        button = new JButton();
        button.setText("<HTML>Click the <FONT color=\"#000099\"><U>link</U></FONT>"
                + " go to website.</HTML>");
        button.setToolTipText(uri.toString());
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setBackground(Color.WHITE);
        button.addActionListener(new OpenUrlAction());

        label1 = new JLabel("Hola amigos de programacion");
        label2 = new JLabel("mi nombre es Ricardo soy de Cochabamba Bolivia");
        label3 = new JLabel("me gusta programar y aprender otras idiomas, decide resolver estos ejercicios");
        label4 = new JLabel("esta bueno para empesar a entrar al mundo de programacion que es muy  divertido");
        label5 = new JLabel("#############################");
        label7 = new JLabel("dudas: ricardosilvester6@hotmail.com");

        label1.setBounds(150, 100, 700, 40);
        label2.setBounds(150, 150, 700, 40);
        label3.setBounds(150, 200, 700, 40);
        label4.setBounds(150, 250, 700, 40);
        label5.setBounds(150, 300, 700, 40);
        label7.setBounds(150, 350, 700, 40);
        button.setBounds(150, 400, 700, 40);
        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label7);
        add(button);

    }

    public static void main(String[] args) throws URISyntaxException {
        About a = new About();
        a.setVisible(true);
    }
}
