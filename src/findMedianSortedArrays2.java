// {

// }

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/

import java.util.Arrays;

public class findMedianSortedArrays2 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArrayLength = nums1.length + nums2.length;
        int[] mergedArray = new int[mergedArrayLength];
        double inPairValue = 0;
        int i = 0;
        int j = 0;
        int pos = 0;
        while(i<nums1.length ){
            mergedArray[pos++] = nums1[i++];
        }
        while(j<nums2.length){
            mergedArray[pos++] = nums2[j++];
        }
        Arrays.sort(mergedArray);
        System.out.println(mergedArray.length);
        //AscendantArray(mergedArray);
        if(mergedArray.length%2!=0){
            inPairValue = mergedArray[(mergedArray.length/2)];
        }else {
            //double number = (mergedArray[(mergedArray.length / 2)]) - (mergedArray[(mergedArray.length / 2) - 1]);
            //inPairValue = mergedArray[(mergedArray.length / 2) - 1] + number/2;
            inPairValue = (mergedArray[(mergedArray.length / 2)-1] + mergedArray[(mergedArray.length / 2) ])/2.0;


        }
        return inPairValue;
    }
    public static void main(String[] args)  {
        int[] nums1 = {5,6,8,4};
        int[] nums2 = {4,2,6,1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        //AscendantArray(nums1);

    }
}






