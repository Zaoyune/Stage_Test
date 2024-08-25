// {

// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/

public class SmallestSufficientTeam {
    /*public static int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        List<String> MissingSkills = Arrays.asList(req_skills);
        List<String> individualSkills = new ArrayList<>();
        List<String> tempMissingSkills = new ArrayList<>();
        //HashMap<Integer,List<String>> SkilledPeople = new HashMap<>();
        TreeMap<Integer,List<String>> SortedPeople = new TreeMap<>();
        List<Integer> Team = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            SortedPeople.put(i,people.get(i));
        }
        SortedMap<Integer, List<String>> descendingMap = SortedPeople.descendingMap();
        //people.sort((list1, list2) -> Integer.compare(list2.size(), list1.size()));
        for (Map.Entry<Integer, List<String>> entry : descendingMap.entrySet()) {
            System.out.println("start");
            entry.getValue().forEach(System.out::println);
            System.out.println("end");
            int skillsSize = MissingSkills.size();

            individualSkills = entry.getValue(); // Fetch individual's skills

            // Create a copy of MissingSkills for each individual
            tempMissingSkills = new ArrayList<>(MissingSkills);
            tempMissingSkills.removeAll(individualSkills); // Remove individual's skills from the copied MissingSkills


            if (tempMissingSkills.isEmpty()) {
                Team.add(entry.getKey()); // Add individual to the team
                break; // Exit loop since all skills are found for this individual
            } else if (tempMissingSkills.size() < skillsSize) {
                Team.add(entry.getKey()); // Add the individual to the team since they have some skills
            }

            // Update MissingSkills with the modified list after each iteration
            MissingSkills = tempMissingSkills;
        }
        Collections.reverse(Team);
        int[] array = Team.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        return array;
    }*/
    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        // Check if the index is valid
        if (index >= 0 && index < str.length()) {
            char[] charArray = str.toCharArray();
            charArray[index] = replacementChar;
            return new String(charArray);
        }
        return str; // Return original string if index is invalid
    }
    public static String removeDuplicateLetters(String s) {
        char smallest = Character.MAX_VALUE; // Initialize with the maximum value of char
        int smallestPosition = 0;
        int positionI = 0;
        String test = s;
        String stringWithoutChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < smallest) {
                smallest = s.charAt(i);
                smallestPosition = i;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(test);
            List<Integer> ListPositions = new ArrayList<>();

            for (int j = i+1; j < s.length(); j++) {
                int x = Integer.MAX_VALUE;
                if(s.charAt(i) == s.charAt(j)){
                    if(Math.abs(smallestPosition-i)>Math.abs(smallestPosition-j)){
                        test =  replaceCharAtIndex(test, i, ' ');
                    }else if(Math.abs(smallestPosition-j)>Math.abs(smallestPosition-i) && i>smallestPosition){
                        test =  replaceCharAtIndex(test, j, ' ');
                    }else if(Math.abs(smallestPosition-j)>Math.abs(smallestPosition-i) && i<smallestPosition) {
                        test =  replaceCharAtIndex(test, i, ' ');
                    }

                    /*if(i<smallestPosition && j>smallestPosition){
                        System.out.println("tt");
                        //keepPos = j;
                        test =  replaceCharAtIndex(test, i, ' ');
                        ListPositions.add(j);
                    }else {
                        test =  replaceCharAtIndex(test, j, ' ');
                        ListPositions.add(i);
                    }
                    if(i>smallestPosition){
                       if(i>x){
                           test =  replaceCharAtIndex(test, i, ' ');
                       }else if(i<x){
                           x=i;
                       }
                    }*/

                }

            }

        }
        test = test.replace(String.valueOf(' '), "");
        return test;
    }
    public static void main(String[] args)  {

        System.out.println(removeDuplicateLetters("cdadabcc"));

    }
}









