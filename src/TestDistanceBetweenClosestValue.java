import java.util.*;

class TestDistanceBetweenClosestValue {
    // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) {
        // try to implement it!
        int max = Integer.MAX_VALUE;
        ArrayList<Integer>ListValues = new ArrayList<>();
        int soust;
        for(int i=0;i<numbers.length;i++){
                for(int j=i+1;j<numbers.length;j++){
                    soust = numbers[i]-numbers[j];
                    System.out.println(soust);
                    ListValues.add(Math.abs(soust));
                    System.out.println(Math.abs(soust));
                }
            for (Integer l : ListValues) {
                if (max > l) {
                    max = l;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println("the closest distance is : " + result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
    }


