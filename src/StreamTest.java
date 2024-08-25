// {

// }

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class StreamTest {



        public static void main(String[] args) {
            List<Person> people = Arrays.asList(
                    new Person("Alice", 30),
                    new Person("Bob", 20),
                    new Person("Charlie", 25),
                    new Person("David", 28)
            );

            List<String> namesOfPeopleUnder25 = filterAndMapNames(people);

            // Print the result
            namesOfPeopleUnder25.forEach(System.out::println);
        }

        public static List<String> filterAndMapNames(List<Person> people) {
            List<String> listNames = people.stream()
                    .filter(n -> n.getAge()>25)
                    .map(Person::getName)
                    .collect(Collectors.toList());

            return listNames;
        }

}






