import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            while (true) {
                robot.mouseMove(0, 0); // move the mouse to (0, 0) on the screen
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press the left mouse button
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release the left mouse button
                Thread.sleep(30000); // wait for 1 second before repeating the loop
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
