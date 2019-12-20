package eg.edu.alexu.csd.oop.game.control;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class dynamicLoading {

    public Class dynamicLoad(String path, String name) {
        File file = new File(path);

        try {
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};

            ClassLoader cl = new URLClassLoader(urls);

            Class cls = cl.loadClass(name);

            return cls;

        } catch (MalformedURLException e) {
            throw new NullPointerException();
        } catch (ClassNotFoundException e) {
            throw new NullPointerException();
        }

    }
}
