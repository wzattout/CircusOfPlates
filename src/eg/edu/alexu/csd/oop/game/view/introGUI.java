package eg.edu.alexu.csd.oop.game.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class introGUI extends JComponent{

    JFrame window = new JFrame("Circus of Plates");

    String path;
    BufferedImage image;

    JButton newGame =new JButton("New Game");
    JButton load =new JButton("Load");
    JButton exit =new JButton("Exit");

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public introGUI(String path) throws IOException {


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

                newGame.setBounds(565, 200, 300, 75);
                load.setBounds(565, 300, 300, 75);
                exit.setBounds(565, 400, 300, 75);

                newGame.setBackground(Color.cyan);
                load.setBackground(Color.cyan);
                exit.setBackground(Color.cyan);

                newGame.setFont(new Font("Tahoma", Font.BOLD, 30));
                load.setFont(new Font("Tahoma", Font.BOLD, 30));
                exit.setFont(new Font("Tahoma", Font.BOLD, 30));

                window.add(newGame); window.add(load); window.add(exit);

                newGame.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });

                load.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });

                exit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });

                newGame.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // write here
                    }
                });

                load.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // write here
                    }
                });

                exit.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // write here
                    }
                });

            }
        });

    }

    public static void main(String[] args) throws IOException {
        introGUI newGame = new introGUI("/circus_background.png");
    }
}
