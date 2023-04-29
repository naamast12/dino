import java.awt.*;

public class Utils {
    public static final int X_WINDOW = 0;
    public static final int Y_WINDOW = 0;
    public static final int WIDTH = 1750;
    public static final int HEIGHT = 950;
    public static final int X_PLAYER = 10;
    public static final int Y_PLAYER = 300;
    public static final int PLAYER_JUMP = 300;

    public static final int X_CACTUS = 1300;
    public static final int Y_CACTUS = 400;
    public static final int SPEED = 5;





    public static void sleep (int millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public static boolean collision (Rectangle rectangle1, Rectangle rectangle2) {
            return rectangle1.intersects(rectangle2);
        }
    }
