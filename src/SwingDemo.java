import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingDemo {

    SwingDemo() {

        JFrame jfrm = new JFrame("Swing App");
        jfrm.setLayout(null);
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbth = new JButton("BAN");
        /*jbth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });*/
        jbth.setBounds(10,10, 70, 30);

        jbth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int x = (int)(Math.random() * (jfrm.getBounds().width - 100));
                int y = (int)(Math.random() * (jfrm.getBounds().height-100)) + 30 ;
                jbth.setBounds(x, y, 70, 30);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jfrm.add(jbth);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
