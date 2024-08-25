import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeDayGains2 {
    public static int computeDayGains(int nbSeats,int[] payingGuests,int[] guestMovements){
        int sum = 0;
        final HashMap<Integer, Integer> hGuestStatus = new HashMap<>();
        int sDispo = nbSeats;
        for (int i =0; i < guestMovements.length; i++){
            int arr = guestMovements[i];
            if (hGuestStatus.containsKey(arr)) {
                int value = hGuestStatus.get(arr);
                if (value %2 == 1) {
                    value ++;
                    sDispo ++;
                    hGuestStatus.put(arr,value);
                } else {
                    if (sDispo > 0){
                        value ++;
                        sDispo --;
                        hGuestStatus.put(arr,value);
                    }
                }
            }
            else {
                if (sDispo > 0) {
                    hGuestStatus.put(arr, 1);
                    sDispo--;
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : hGuestStatus.entrySet()) {
            sum+=payingGuests[entry.getKey()];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] guestMovements = new int[]{0, 1, 2,3,3,4,0,1,5,5,2,4};
        int[] payingGuests = new int[]{25,40,50,20,99,100};
        System.out.println(computeDayGains(2,payingGuests,guestMovements));

    }
}
