import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeDayGains {
    public static int computeDayGains(int nbSeats,int[] payingGuests,int[] guestMovements){
        int gains=0;
        int disp=0;
        List<Integer>Dispos = new ArrayList<>();
        List<Integer>queue = new ArrayList<>();
        HashMap<Integer,Integer> Clients = new HashMap<>();
        for (int number : guestMovements) {
            Clients.put(number, Clients.getOrDefault(number, 0) + 1);
            int value = Clients.getOrDefault(number, -1);
            System.out.println("key "+number);
            System.out.println("value "+value);
            if(disp<nbSeats && queue.isEmpty() || value%2==0 && Dispos.contains(number)){
                if(value==1){
                    gains += payingGuests[number];
                    Dispos.add(number);
                    disp++;
                }else if(value%2==0){
                    System.out.println("une place est disponible");
                    Dispos.remove(Integer.valueOf(number));
                    disp--;
                    continue;
                }else if(value%2!=0 && value>1){
                    Dispos.add(number);
                    disp++;
                }
            }else if(disp>=nbSeats){
                if(queue.contains(number)){
                    queue.remove(Integer.valueOf(number));
                    System.out.println("le client a quitté la file d'attente "+queue.size());
                }else{
                    queue.add(number);
                    System.out.println("plus de places disponible, ajouté à la file d'attente "+queue.size());
                }
            }else if(disp<nbSeats && !queue.isEmpty()){
                System.out.println("une place disponible pour la premiere personne en file d'attente");
                for (int i = 0; i < queue.size() ; i++) {
                    if(disp<nbSeats){
                        gains += payingGuests[queue.get(i)];
                        disp++;
                        queue.remove(queue.get(i));
                    }
                }
            }
            System.out.println("disponibility "+disp);
        }
        return gains;
    }
    
    public static void main(String[] args) {
        int[] guestMovements = new int[]{0, 1, 2,3,3,4,0,1,5,5,2,4};
        int[] payingGuests = new int[]{25,40,50,20,99,100};
        System.out.println(computeDayGains(2,payingGuests,guestMovements));

    }
}
