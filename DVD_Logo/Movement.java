package working_projects.DVD_Logo;

import java.util.Random;

public class Movement implements MovementApps{
    private final Position position;
    private final JWindowStructure windowStructure;
    private int speedX;
    private int speedY;
    private final JPanelBackground panelBackground;
    private final Random random;

    public Movement(JWindowStructure windowStructure,
                    Position position,
                    int speedX, int speedY,
                    JPanelBackground panelBackground, Random random) {

        this.position = position;
        this.windowStructure = windowStructure;
        this.speedX = speedX;
        this.speedY = speedY;
        this.panelBackground = panelBackground;
        this.random = random;
    }

    @Override
    public void Movement(int x, int y, int width, int height) {
        while (true) {
            panelBackground.setBackgroundColorOfPanel();
            int xSpeedDirection = BouncingOnScreenBordersX(x, width);
            int ySpeedDirection = BouncingOnScreenBordersY(y, height);
            x = x + xSpeedDirection;
            y = y + ySpeedDirection;
            try {
                Thread.sleep(19);
                windowStructure.setLocationWindow(position.getxPosition(), position.getyPosition());
                windowStructure.updateBackgroundColor();
                position.setxPosition(x);
                position.setyPosition(y);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //Changing direction of the JWindow on the X axis
    private int BouncingOnScreenBordersX(int x, int width) {
        int sizeShapeW = windowStructure.getWidth();
        if ((x >= width - sizeShapeW) || (x <= 0)) {
            BouncingColorChange();
            speedX *= -1;
        }
        return speedX;
    }
    //Changing direction of the JWindow on the Y axis
    private int BouncingOnScreenBordersY(int y, int height) {
        int sizeShapeH = windowStructure.getHeight();
        if ((y >= height - sizeShapeH) || (y <= 0)) {
            BouncingColorChange();
            speedY *= -1;
        }
        return speedY;
    }

    public void BouncingColorChange() {
        panelBackground.setH(random.nextFloat());
        panelBackground.setS(random.nextFloat());
        panelBackground.setB(random.nextFloat());
    }

}



