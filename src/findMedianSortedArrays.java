// {

// }

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/

import java.util.Arrays;
import java.util.Scanner;

public class findMedianSortedArrays {
    public static int[] AscendantArray(int[] ArrayInt){
        int number;
            for (int i = 0; i < ArrayInt.length; i++) {
                for (int j = i+1; j < ArrayInt.length; j++) {
                    if (ArrayInt[j] < ArrayInt[i]) {
                        number = ArrayInt[i];
                        ArrayInt[i] = ArrayInt[j];
                        ArrayInt[j] = number;
                    }
                }

            }
        return ArrayInt;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArrayLength = nums1.length + nums2.length;
        int[] mergedArray = new int[mergedArrayLength];
        int PairValue = 0;
        double inPairValue = 0;
        // Copy the elements of nums1 to mergedArray

        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }

        // Copy elements from array2 to mergedArray
        for (int i = 0; i < nums2.length; i++) {
            mergedArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(mergedArray);
        //AscendantArray(mergedArray);
        if(mergedArray.length%2!=0){
                inPairValue = 0;
                System.out.println(0);
            inPairValue = mergedArray[(mergedArray.length/2)];
        }else if(mergedArray.length%2==0){
            if(mergedArray[mergedArray.length/2] == 0 && mergedArray[mergedArray.length/2 + 1] ==0){
                inPairValue = 0;
                System.out.println(0);
            }else {
                double number = (mergedArray[(mergedArray.length / 2)]) - (mergedArray[(mergedArray.length / 2) - 1]);
                inPairValue = mergedArray[(mergedArray.length / 2) - 1] + number/2;
                //System.out.println(mergedArray.length/2 +0.5);
            }
        }
        System.out.println("the value is : " + inPairValue);
        return inPairValue;
    }
    public static void main(String[] args)  {
        int[] nums1 = {5,6,8,4};
        int[] nums2 = {4,2,6,1};
        findMedianSortedArrays(nums1, nums2);
        //AscendantArray(nums1);

    }

}
