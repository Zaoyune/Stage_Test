import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.*;

class solution {
   /* public static int computeClosestToZero(int[] ts) {
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
                    diff = abs;
                } else if (abs == diff && ts[i] > 0 && ts[closestIndex] < 0) {
                    //same distance to zero but positive
                    closestIndex = i;
                }
            }
        }

        return ts[closestIndex ];
    }*/
    public static int squareDigits(int n) {
        // TODO Implement me
        int num = 1234;

        String s = Integer.toString(n);

        int[] intArray = new int[s.length()];


        for(int i=0; i<s.length(); i++){
            intArray[i] = Character.getNumericValue(s.charAt(i));
            //System.out.println(intArray[i]);
        }
        for(int i=0;i<intArray.length;i++){
            intArray[i]=intArray[i]*intArray[i];
        }
        for (int i=0; i< intArray.length; i++) {
            System.out.print(intArray[i]);
            if(i < intArray.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

        StringBuilder builder = new StringBuilder();
        for (int numb : intArray) {
            builder.append(numb);
        }
        int number = Integer.parseInt(builder.toString());
        return number;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {

        int b = 9119;
        System.out.println(squareDigits(b));
        Scanner in = new Scanner(System.in);
       /* int n = in.nextInt();
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
        }*/

    }
}
