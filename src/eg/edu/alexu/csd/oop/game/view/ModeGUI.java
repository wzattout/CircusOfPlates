package eg.edu.alexu.csd.oop.game.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ModeGUI extends JFrame {

    JFrame window = new JFrame("Circus of Plates");

    String path;
    BufferedImage image;

    JButton timedMode = new JButton("Timed Mode");
    JButton arcadeMode = new JButton("Arcade Mode");
    JButton exit = new JButton("Exit");

    public ModeGUI(String path) throws IOException {

        image = ImageIO.read(getClass().getResourceAsStream(path));

        window.setVisible(true);
        window.setSize(1400, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);

                timedMode.setBounds(565, 200, 300, 75);
                arcadeMode.setBounds(565, 300, 300, 75);
                exit.setBounds(565, 400, 300, 75);

                timedMode.setBackground(Color.cyan);
                arcadeMode.setBackground(Color.cyan);
                exit.setBackground(Color.cyan);

                timedMode.setFont(new Font("Tahoma", Font.BOLD, 30));
                arcadeMode.setFont(new Font("Tahoma", Font.BOLD, 30));
                exit.setFont(new Font("Tahoma", Font.BOLD, 30));

                window.add(timedMode);
                window.add(arcadeMode);
                window.add(exit);

                timedMode.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        window.dispose();
                    }
                });

                arcadeMode.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        window.dispose();
                    }
                });

                exit.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.exit(0);
                    }
                });

            }
        });
    }
}

