package working_projects.DVD_Logo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainDVD {
    public static void main(String[] args) throws InterruptedException {
        //creating obj
        Random random = new Random();

        JPanelBackground panel = new JPanelBackground();
        JWindowStructure window = new JWindowStructure(new JWindow(), panel, 100, 100);

        Position position = new Position();
        Movement movement = new Movement(window, position, 10, 10, panel, random);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //variables of obj.


        int widthSize = window.getWidth();
        int heightSize = window.getHeight();

        int width = screenSize.width;
        int height = screenSize.height;


        position.setxPosition(random.nextInt(width - widthSize));
        position.setyPosition(random.nextInt(height - heightSize));

        int x = position.getxPosition();
        int y = position.getyPosition();
        //methods of obj.
        window.setLocation(x, y);
        movement.Movement(x,y,width,height);

    }
}
