package eg.edu.alexu.csd.oop.game.view;

import eg.edu.alexu.csd.oop.game.GameEngine;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.EasyDifficulty;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.HardDifficulty;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.MediumDifficulty;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.ArcadeMode;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.TimedMode;
import eg.edu.alexu.csd.oop.game.model.worlds.levels.Level;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Level level = new Level(new ArcadeMode(new EasyDifficulty()));

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

        easyArcadeModeItem.addActionListener(arg0 -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new ArcadeMode(new EasyDifficulty())));
        });

        normalArcadeModeItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new ArcadeMode(new MediumDifficulty())));
        });

        hardArcadeModeItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new ArcadeMode(new HardDifficulty())));
        });

        easyTimeModeItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new TimedMode(new EasyDifficulty())));
        });

        normalTimeModeItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new TimedMode(new MediumDifficulty())));
        });

        hardTimeModeItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            gameController.changeWorld(new Level(new TimedMode(new HardDifficulty())));
        });

        newMenuItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            //gameController.changeWorld();
        });

        JMenuItem saveMenuItem = new JMenu("Save");
        saveMenuItem.addActionListener(arg0 -> {
            // TODO Auto-generated method stub


        });

        JMenuItem loadMenuItem = new JMenu("Load");
        loadMenuItem.addActionListener(e -> {
            // TODO Auto-generated method stub

        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            System.exit(0);
        });


        menu1.add(newMenuItem);
        menu1.addSeparator();
        menu1.add(saveMenuItem);
        menu1.add(loadMenuItem);
        menu1.addSeparator();
        menu1.add(exitMenuItem);

        JMenuItem undoMenuItem = new JMenuItem("Undo");
        undoMenuItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            //level.undo();
        });

        JMenuItem replayMenuItem = new JMenuItem("Replay");
        replayMenuItem.addActionListener(e -> {
            // TODO Auto-generated method stub
            //gameController.pause();
            level.flag = false;
        });

        JMenuItem resumeItem = new JMenuItem("Resume");
        JMenuItem pauseItem = new JMenuItem("Pause");

        resumeItem.addActionListener(e -> {
            menu2.remove(resumeItem);
            menu2.remove(undoMenuItem);
            menu2.remove(replayMenuItem);
            menu2.add(pauseItem);
            menu2.add(undoMenuItem);
            menu2.add(replayMenuItem);
            gameController.resume();
        });

        pauseItem.addActionListener(e -> {
            menu2.remove(pauseItem);
            menu2.remove(undoMenuItem);
            menu2.remove(replayMenuItem);
            menu2.add(resumeItem);
            menu2.add(undoMenuItem);
            menu2.add(replayMenuItem);
            gameController.pause();
        });

        menu2.add(pauseItem);
        menu2.add(undoMenuItem);
        menu2.add(replayMenuItem);
        menuBar.add(menu1);
        menuBar.add(menu2);
    }
}
