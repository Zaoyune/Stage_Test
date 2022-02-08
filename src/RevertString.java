import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class RevertString {

    public void main() {

        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/

    }

    public  int printDigits(int num) {
        int sum = 0;
            if(num / 10 > 0) {
                printDigits(num / 10);
            }
           // System.out.printf("%d ", num % 10);
            sum+=num%10;
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {
        String[] cars = {"h","b","h","r","h","h"};
        String word = "prese";
        boolean oncemore = false;
        String p="";
        //List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        for (int i = 0; i <word.length() ; i++) {
            //System.out.println(cars[i]);
            for (int j = word.length()-1; j>=0; j--) {
                if(word.charAt(i) == word.charAt(j)){
                    word.replace(word.charAt(i), ')');
                    break;
                }else{
                    word.replace(word.charAt(i), '(');
                }

            }
        }
        System.out.println(word);

       // encode("hbhrhh");
    }
    }






