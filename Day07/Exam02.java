package Day07;

import java.awt.*;
import java.awt.event.InputEvent;

public class Exam02 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();

        robot.mouseMove(400,1000);


        for(int i=0; i<100; i++)
        {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseMove(600+i,1000);
            robot.delay(50);
        }
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

    }
}
