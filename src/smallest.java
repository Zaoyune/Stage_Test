import java.util.ArrayList;

class smallest {

    public void main() {

        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/

    }
    public static void main(String args[]) {
        int[] tab={2,1,4,5,9,8,7,9};
        int currentValue = 0;
        for(int i=0;i<=tab.length-1;i++){
            for(int j=i+1;j<=tab.length-1;j++){
                if(tab[i]>tab[j]){
                    currentValue = tab[i];
                    tab[i]=tab[j];
                    tab[j]=currentValue;
                }
            }

        }

        for(int i=0;i<=tab.length-1;i++){
            System.out.println("la valeur est : "+tab[i]);
        }
    }

}


