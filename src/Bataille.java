// {

// }

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/
import java.util.*;

public class Bataille {

    public static void main(String[] args)  {
        String  line;
        int playerA;
        int playerB;
        int ScoreA = 0;
        int ScoreB = 0;
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int nombreDeTours = sc.nextInt();
        //sc.nextLine();
        System.out.println("Le nombre de tours est : " + nombreDeTours);
        while(sc.hasNextLine()) {
            for (int i = 0; i < nombreDeTours; i++) {
                playerA = sc.nextInt();
                System.out.println("player A's card number : " + playerA);
                playerB = sc.nextInt();
                System.out.println("player B's card number : " + playerB);
                if (playerA > playerB) {
                    ScoreA++;
                } else if (playerB > playerA) {
                    ScoreB++;
                }
                //sc.nextLine();
            }
            //sc.close();
            if (ScoreA > ScoreB) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

}
