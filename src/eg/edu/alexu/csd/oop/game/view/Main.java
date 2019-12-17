package eg.edu.alexu.csd.oop.game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import eg.edu.alexu.csd.oop.game.GameEngine;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.*;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.*;
import eg.edu.alexu.csd.oop.game.model.worlds.levels.testLevel;

public class Main {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();

        GameEngine.GameController gameController = GameEngine.start("Test Run", new testLevel(new ArcadeMode(), new EasyDifficulty()), menuBar);


        JMenu menu1 = new JMenu("File");

        JMenu menu2 = new JMenu("Options");

        JMenuItem newMenuItem = new JMenu("New Game");
        newMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        JMenuItem saveMenuItem = new JMenu("Save");
        saveMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub


            }
        });

        JMenuItem loadMenuItem = new JMenu("Load");
        loadMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });

        menu1.add(newMenuItem);
        menu1.addSeparator();
        menu1.add(saveMenuItem);
        menu1.add(loadMenuItem);
        menu1.addSeparator();
        menu1.add(exitMenuItem);




        JMenuItem undoMenuItem = new JMenuItem("Undo");
        undoMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        JMenuItem replayMenuItem = new JMenuItem("Replay");
        replayMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });


        JMenuItem resumeItem = new JMenuItem("Resume");
        JMenuItem pauseItem = new JMenuItem("Pause");

        resumeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu2.remove(resumeItem);
                menu2.remove(undoMenuItem);
                menu2.remove(replayMenuItem);
                menu2.add(pauseItem);
                menu2.add(undoMenuItem);
                menu2.add(replayMenuItem);
                gameController.resume();
            }
        });


        pauseItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu2.remove(pauseItem);
                menu2.remove(undoMenuItem);
                menu2.remove(replayMenuItem);
                menu2.add(resumeItem);
                menu2.add(undoMenuItem);
                menu2.add(replayMenuItem);
                gameController.pause();
            }
        });



        menu2.add(pauseItem);
        menu2.add(undoMenuItem);
        menu2.add(replayMenuItem);
        menuBar.add(menu1);
        menuBar.add(menu2);

    }
}
