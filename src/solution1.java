import java.util.Scanner;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class PrixLePlusBas {

    public void main() {

        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            int numbprod = sc.nextInt();

            Map<Integer, String> products = new HashMap<Integer, String>()
            {
                {
                    for (int i = 0; i <numbprod ; i++) {
                        System.out.print( "Veuillez saisir un prix : " );
                        int priceprod = sc.nextInt();
                        System.out.print( "Veuillez saisir un nom : " );
                        String nameprod = sc.next();
                        sc.nextLine();
                        put(priceprod, nameprod);
                    }

                }
            };

            int minprice = Integer.MAX_VALUE;
            System.out.print( "Veuillez saisir le nom du produit souhaité : " );
            String namep = sc.next();
            sc.nextLine();
            for (Map.Entry<Integer, String> entry : products.entrySet()) {
                Integer k = entry.getKey();
                String v = entry.getValue();
                System.out.println((k + ":" + v));
                if (v.equals(namep)) {
                    if (k <= minprice) {

                        minprice = k;
                    }
                }
            }

            System.out.println("minimum price "+minprice);


            }
        }
    }


