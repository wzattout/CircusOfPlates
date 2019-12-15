package eg.edu.alexu.csd.oop.game.control;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class dynamicLoading {

    public Class dynamicLoad() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                URL url = selectedFile.toURI().toURL();
                URL[] urls = new URL[]{url};
                ClassLoader cl = new URLClassLoader(urls);
                Class cls = cl.loadClass("external shape");
                return cls;
            } catch (MalformedURLException e) {
            } catch (ClassNotFoundException e) {
            }
        }
        return null;
    }
}
