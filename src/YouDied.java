
/**
 *
 * @author Leon
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.05.2015
 * @author
 */
public class YouDied extends JFrame {
    private final JButton Ok = new JButton();
    private final JLabel TRON = new JLabel();
    private final JLabel jLabelX = new JLabel();
    private BufferedImage image = null;
    
    
    public YouDied(String title, String name) {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int frameWidth = 800;
        int frameHeight = 600;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        this.setLayout(null);
        try {
            image = ImageIO.read(new File("BikeBackground.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Startpage.class.getName()).log(Level.SEVERE, null, ex);
        }

       Container c = new Container() {
            public void paint(Graphics g) {
                g.drawImage(image, 0, 0, null);
                super.paint(g);
            }
        };
        c.setBackground(new Color(0, 0, 0, 0));
        this.setContentPane(c);
        
        Ok.setBounds(360, 352, 75, 25);
        Ok.setText("Ok");
        Ok.setMargin(new Insets(2, 2, 2, 2));
        Ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        this.add(Ok);

        TRON.setBounds(100, 40,800, 104);
        TRON.setText("You Died, " + name + "!!!");
        TRON.setFont(new Font("Consolas", Font.BOLD, 54));
        TRON.setForeground(Color.WHITE);
        
        this.add(TRON);
        
        jLabelX.setBounds(250, 100,800, 104);
        jLabelX.setText("#Looser");
        jLabelX.setFont(new Font("Consolas", Font.BOLD, 72));
        jLabelX.setForeground(Color.WHITE);
        this.add(jLabelX);
       
        
        setVisible(true);
    
     }


    public static void main(String[] args) {
        new YouDied("YouDied", "Torsten");
    }
}
