import java.util.Arrays;

public class Xbonacci {
    public static int[] tribonacci(int[] s, int n) {
        if (n == 0) {
            return new int[0]; // Return an empty array for n = 0
        } else if (n <= 3) {
            // Return the initial elements of s if n is less than or equal to 3
            return Arrays.copyOf(s, n);
        }
        /*int[] result = new int[n];
        for (int i = 0; i < 3; i++) {
            result[i] = s[i];
        }

        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;*/
        for (int i = 3; i < n; i++) {
            int nextTribonacci = s[i - 1] + s[i - 2] + s[i - 3];
            s = Arrays.copyOf(s, s.length + 1); // Extend the array
            s[i] = nextTribonacci;
        }

        return s;
    }

    public static void main(String args[]) {
        int [] monTableau = {2,3,5,10};
        System.out.println(Arrays.toString(tribonacci(monTableau, 7)));
    }
}




