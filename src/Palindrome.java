import java.util.*;

class Palindrome {

    public void main() {



    }
    public static void main(String args[]) {
        String[] cars = {"h","a","s","z","s","a","h"};
        boolean palindrome = true;
        //List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        /*for (int i = 0; i <cars.length ; i++) {
            //System.out.println(cars[i]);
            for (int j = cars.length-1; j>=0; j--) {
                if(cars[i].equals(cars[j])){
                    palindrome =  true;
                }else{
                    palindrome =  false;

                }
                break;
            }

        }*/
        int i =0;
        int j = cars.length-1;
        while (i < cars.length && j > i) {
            System.out.println(i);
            if(cars[i].equals(cars[j])){
                palindrome =  true;
                i++;
                j--;
            }else{
                palindrome =  false;
                break;
            }
        }
        if (palindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
    }


