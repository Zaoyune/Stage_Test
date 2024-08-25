import java.util.*;

public class test1 {
    public static int trouverPlusGrand(int[] tableau) {
        // Votre code ici
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < tableau.length; i++) {
                if(tableau[i]>min){
                    min = tableau[i];
                }
        }
        return min;
    }

    public int compterCaracteres(String chaine) {
        // Votre code ici
        int number=0;
        for (int i = 0; i < chaine.length(); i++) {
            number++;
        }
        return number;
    }

    public static int sommeEntiersImpairs(int[] tableau) {
        // Votre code ici
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i]%2 != 0){
                somme+=tableau[i];
            }
        }
        return somme;
    }

    public static boolean estPalindrome(String chaine) {
        // Votre code ici
        int i = 0;
        int j = chaine.length() - 1;
        while (i < j) {
            char charI = Character.toLowerCase(chaine.charAt(i));
            char charJ = Character.toLowerCase(chaine.charAt(j));

            if (charI != charJ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static LinkedList<Integer> linkedList = new LinkedList<>();
    public static void AddInt(LinkedList<Integer> linkedList, int x){
        linkedList.add(x);
    }
    public static void DeleteInt(LinkedList<Integer> linkedList, int x){
        linkedList.forEach(v->{
            if(v == x){
                linkedList.remove(v);
            }
        });
    }
    public static void DisplayList(LinkedList<Integer> linkedList){
        linkedList.forEach(System.out::println);
    }
    public static boolean menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. add 1");
            System.out.println("2. delete 2");
            System.out.println("3. display 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's choice
            choice = scanner.nextInt();

            // Perform actions based on the choice
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    // Add code for Option 1 here
                    System.out.print("Please enter an integer: ");
                    int addValue = scanner.nextInt();
                    AddInt(linkedList,addValue);
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    // Add code for Option 2 here
                    System.out.print("Please enter an integer: ");
                    int deleteValue = scanner.nextInt();
                    DeleteInt(linkedList,deleteValue);
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    // Add code for Option 3 here
                    DisplayList(linkedList);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
        return false;
    }

    public List<Integer> carresDesEntiers(List<Integer> liste) {
        List<Integer> carres = new ArrayList<>();
        liste.forEach(v -> carres.add(v * v));
        return carres;
    }

    public static Map<Character, Integer> frequenceDesCaracteres(String chaine) {
        // Votre code ici
        Map<Character, Integer> mapList = new HashMap<>();
        int Rep;
        for (int i = 0; i < chaine.length(); i++) {
            Rep=1;
            if(mapList.containsKey(chaine.charAt(i))){
                for (int j = i; j < chaine.length(); j++) {
                    if(chaine.charAt(i) == chaine.charAt(j)){
                        Rep++;
                    }
                }
            }
            mapList.put(chaine.charAt(i),Rep);
        }
        return mapList;
    }
    public static Map<Character, Integer> frequenceDesCaracteres2(String chaine) {
        Map<Character, Integer> mapList = new HashMap<>();
        for (int i = 0; i < chaine.length(); i++) {
            char caractere = chaine.charAt(i);
            mapList.put(caractere, mapList.getOrDefault(caractere, 0) + 1);
        }
        return mapList;
    }

    public static List<int[]> trouverPairesPourSomme(int[] tableau, int somme) {
        // Votre code ici
        List<int[]> Liste = new ArrayList<>();
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i+1; j < tableau.length; j++) {
                if(tableau[i] + tableau[j] == somme){
                    Liste.add(new int[]{tableau[i], tableau[j]});
                }
            }
        }
        return Liste;
    }

    public static void main(String[] args) {
        trouverPlusGrand(new int[]{7,8,5,4,6,9});
        System.out.println(trouverPlusGrand(new int[]{7,8,5,4,6,9}));
        System.out.println(sommeEntiersImpairs(new int[]{7,8,5,4,6,9}));
        System.out.println(estPalindrome("hasttsah"));
        //System.out.println(menu());
        System.out.println(frequenceDesCaracteres("tesportpflm"));
        System.out.println(frequenceDesCaracteres2("tesportpflm"));
        System.out.println(trouverPairesPourSomme(new int[]{7,3,4,6,6,9,1},10));
    }
}
