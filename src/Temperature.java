import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Temperature {

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        if(ts.length == 0) {
            System.out.println("array is null");
        }else{
            for (int i = 0; i < ts.length; ++i) {
                int abs = Math.abs(ts[i]);
                if (abs < diff) {
                    closestIndex = i;
                    System.out.println("dvzvzdv "+i);
                    diff = abs;
                } else if (abs == diff && ts[i] > 0 && ts[closestIndex] < 0) {
                    //same distance to zero but positive
                    closestIndex = i;
                    System.out.println("fdcecdecve "+ i);
                }
            }
        }

        return ts[closestIndex];
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0 && n<1){
            System.out.println(0);
        }  else if(n>=0 && n<=10000){
            int[] ts = new int[n];
            for (int i = 0; i < n; i++) {
                ts[i] = in.nextInt();
            }


            PrintStream outStream = System.out;
            System.setOut(System.err);
            int solution = computeClosestToZero(ts);
            System.setOut(outStream);
            System.out.println(solution);
        }else{
            System.out.println("nop try again");
        }

    }
}
