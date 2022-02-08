import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NegativeSum {

    public static int addNegValues(ArrayList<Integer> list)
    {
        int sumnegative=0;
        // Écrivez votre code ici
        for (Integer n : list) {
            if (n < 0) {
                sumnegative += n;
            }
        }
        return sumnegative;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        liste.add(1);
        liste.add(-2);
        liste.add(3);
        liste.add(-4);
        liste.add(-5);
        liste.add(6);
        liste.add(7);

        System.out.println(addNegValues(liste));
    }
}
