package eg.edu.alexu.csd.oop.game.view;

import eg.edu.alexu.csd.oop.game.GameEngine;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.EasyDifficulty;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.MediumDifficulty;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.ArcadeMode;
import eg.edu.alexu.csd.oop.game.model.worlds.levels.testLevel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {



        testLevel level = new testLevel(new ArcadeMode(new MediumDifficulty()));

        JMenuBar menuBar = new JMenuBar();

        GameEngine.GameController gameController = GameEngine.start("Test Run", level, menuBar);


        JMenu menu1 = new JMenu("File");

        JMenu menu2 = new JMenu("Options");

        JMenuItem newMenuItem = new JMenu("New Game");
        JMenuItem ArcadeModeItem = new JMenu("Arcade Mode");
        JMenuItem TimeModeItem = new JMenu("Time Mode");
        JMenuItem easyArcadeModeItem = new JMenuItem("Easy");
        JMenuItem normalArcadeModeItem = new JMenuItem("Normal");
        JMenuItem hardArcadeModeItem = new JMenuItem("Hard");
        JMenuItem easyTimeModeItem = new JMenuItem("Easy");
        JMenuItem normalTimeModeItem = new JMenuItem("Normal");
        JMenuItem hardTimeModeItem = new JMenuItem("Hard");

        ArcadeModeItem.add(easyArcadeModeItem);
        ArcadeModeItem.add(normalArcadeModeItem);
        ArcadeModeItem.add(hardArcadeModeItem);
        TimeModeItem.add(easyTimeModeItem);
        TimeModeItem.add(normalTimeModeItem);
        TimeModeItem.add(hardTimeModeItem);

        newMenuItem.add(ArcadeModeItem);
        newMenuItem.add(TimeModeItem);

        easyArcadeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                //gameController.changeWorld(new LeveArcadeMode(), new EasyDifficulty());
            }
        });

        normalArcadeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        hardArcadeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        easyTimeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        normalTimeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        hardTimeModeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });


        newMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //gameController.changeWorld();
            }
        });



        newMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //gameController.changeWorld();
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
                //level.undo();
            }
        });

        JMenuItem replayMenuItem = new JMenuItem("Replay");
        replayMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                level.replay();
                gameController.pause();
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
