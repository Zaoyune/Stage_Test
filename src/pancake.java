import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pancake {
    public static List<Integer> pancakeSort(int[] arr) {

        List<Integer> flips = new ArrayList<>();
        int n = arr.length;
        for(int i = n ;i > 1 ; i--){
            int maxindex = find(arr , i);
            reverse(arr , maxindex);
            flips.add(maxindex+1);
            reverse(arr , i - 1);
            flips.add(i);
        }
        return flips;

    }

    public static int find(int[] arr, int n){

        int maxindex = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[maxindex] ){
                maxindex = i;
            }
        }
        return maxindex;

    }
    public static void reverse(int[] arr, int k){
        int i = 0;
        int j = k;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }


    public static void main(String[] args) {
        int[]  nums= {3, 2, 4, 1};
        System.out.println(pancakeSort(nums));
    }
}
