import java.util.ArrayList;
import java.util.Scanner;

class Thor {
    // Returns the distance between the two closest numbers.
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            initialTx = 2;
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            String direction = "";

            if (initialTy < lightY)
            {
                initialTy++;
                direction = "S";
            }

            else if (initialTy > lightY)
            {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX)
            {
                initialTx++;
                direction += "E";
            }

            else if (initialTx > lightX)
            {
                initialTx--;
                direction += "W";
            }
            System.out.println(initialTx);
            System.out.println(initialTy);
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println("SE");
        }
    }
}
