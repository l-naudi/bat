package main.java.rs;

import javax.swing.*;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.net.URL;
import java.util.HashMap;

public class Launcher implements AppletStub {

    private static final HashMap<String, String> params = new HashMap<>();
    private static URL codebase;

    public static void main(String[] args) throws Exception {
        codebase = new URL("http://72.140.7.176");
        params.put("17", "http://" + codebase.getHost());

        Client client = new Client();
        client.setSize(900, 600);
        client.setStub(new Launcher());
        client.init();

        JFrame frame = new JFrame("BatRS");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(client);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public URL getDocumentBase() {
        return codebase;
    }

    @Override
    public URL getCodeBase() {
        return codebase;
    }

    @Override
    public String getParameter(String name) {
        System.out.println(name + ":" + params.get(name));

        return params.get(name);
    }

    @Override
    public AppletContext getAppletContext() {
        return null;
    }

    @Override
    public void appletResize(int width, int height) { }
}
