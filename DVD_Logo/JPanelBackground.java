package working_projects.DVD_Logo;

import javax.swing.*;
import java.awt.*;

public class JPanelBackground extends JPanel {
    private Color color;
    private float h, s, b;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setBackgroundColorOfPanel() {
        Color hsbColor = Color.getHSBColor(getH(),getS(),getB());
        setColor(hsbColor);
    }
}

