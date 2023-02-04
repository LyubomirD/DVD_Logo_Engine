package working_projects.DVD_Logo;

import javax.swing.*;

public class JWindowStructure extends JWindow {
    private final JWindow jWindow;
    private final JPanelBackground jPanel;
    private final int widthSize;
    private final int heightSize;


    //constructor and main functions of JWindow
    public JWindowStructure(JWindow jWindow,
                            JPanelBackground jPanel,
                            int widthSize, int heightSize) {
        this.jWindow = jWindow;
        this.jPanel = jPanel;
        this.widthSize = widthSize;
        this.heightSize = heightSize;

        updateBackgroundColor();
        jWindow.add(jPanel);
        jWindow.setSize(widthSize, heightSize);
        jWindow.setAlwaysOnTop(true);
        jWindow.setVisible(true);
    }

    //Only getters, because I set the width and height in the constructor parameters
    @Override
    public int getWidth() {
        return widthSize;
    }

    @Override
    public int getHeight() {
        return heightSize;
    }

    //method to set the new location of the JWindow
    public void setLocationWindow(int x, int y) {
        jWindow.setLocation(x, y);
    }

    //updating the background
    public void updateBackgroundColor() {
        jPanel.setBackground(jPanel.getColor());
    }
}
