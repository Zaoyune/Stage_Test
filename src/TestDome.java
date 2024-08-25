/*
//a private attribute is visible from sub-class => false
//int i = 0; System.out.println(i++); => 0
//a java class can have more than one parent class => false
//if 2 objects are equals, they should have the same hashcode => true
//the garbage collector guarantees that a java program will not run out of memory => false
//public interface A extends B,C,D{},the interface is correct if B,C and D are interfaces too. =>true
*/
/********************************************//*

//ArrayList l = new ArrayList(2);
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        System.out.println(l.size());
//=>3
*/
/********************************************//*

*/
/*enum Planet{
    MERCURY, VENUS, EARTH
}
    select all acceptable answers :
        Planet.MERCURY == Planet.MERCURY is true
        Planet.MERCURY == Planet.VENUS is true
        Planet.MERCURY.equals(Planet.MERCURY) is true
        Planet.MERCURY.equals(Planet.VENUS ) is true
=> 1&3
 *//*

*/
/************************************************//*

*/
/*
* which of the following method declarations is the most appropriate :
public ArrayList getOrders()
public Vector getOrders()
public List getOrders() => true
* *//*

*/
/*
* whenever an object of type T is expected, is it possible to use an object of type U, with U a sub-type of T. =>True
* *//*

//improve GestionUtilisateurs => HashMap

import java.io.BufferedReader;
import java.io.IOException;

*/
/*************************************************//*

//Modify the utility class
public final class Utilities {
    // Private constructor to prevent instantiation
    private Utilities() {
        throw new AssertionError(); // To prevent instantiation even within the class using reflection
    }

    public static void main(String[] args) {
        // Your main method logic here
    }
}

*/
/*******************************************************//*

//Question 13 => 1&2 GHLAT FIHA
//question 14:
public class Product {
    private String name;
    private int quantity;

    public Product(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }
}
*/
/*****************************************//*

//Question 15 :
public class DriverExam {
    public static void executeExercise(IExercise exercise) {
        try {
            exercise.start();
            exercise.execute();
        } catch (Exception e) {
            try {
                exercise.markNegativePoints();
            } catch (Exception ex) {
                System.out.println("markNegativePoints Error Exception " + ex.getMessage());
            }
        } finally {
            exercise.end();
        }
    }

    public static void main(String[] args) {
        DriverExam.executeExercise(new Exercise());
    }
}

class Exercise implements IExercise {
    public void start() throws Exception { System.out.println("Start"); }
    public void execute() { System.out.println("Execute"); }
    public void markNegativePoints() { System.out.println("MarkNegativePoints"); }
    public void end() { System.out.println("End"); }
}

interface IExercise {
    void start() throws Exception;
    void execute();
    void markNegativePoints();
    void end();
}
*/
/******************************************************//*

//Question 16 :
import org.springframework.context.annotation.*;
        import org.springframework.beans.factory.annotation.*;
        import java.util.*;

@Configuration
public class BookSearch {
    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public RecommendationService recommendationService() {
        return new RecommendationService(bookRepository());
    }
}

class RecommendationService {
    private final BookRepository bookRepository;

    public RecommendationService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String recommendBook() {
        return bookRepository.getBooks().get(0);
    }
}

class BookRepository {
    public List<String> getBooks() {
        List<String> books = new ArrayList<>();
        books.add("Book");
        books.add("Short book");
        books.add("Long book");

        return books;
    }
}
*/
/*****************************************************************//*

//Question 17 => 3&4 ZID FIHA CHII WA7DA
*/
/*****************************************************************//*

//question 18 =>2&3   ZID FIHA CHII WA7DA
//Question 19 => 2
//Question 20 => beans
//Question 21 => Component
//Question 22 => Autowired
//Question 23 => maybe 2&3 GHLAT FIHA
//Question 24 => 2
//Question 25 =>   SELECT DISTINCT country FROM companies ORDER BY country ASC;
//Question 26 => SELECT name FROM authors WHERE (name LIKE 'N%' AND books > 30) OR age < 30;
*/
/*.
* .
* .
* .
* .
* .
* .
* *//*

//Question 29 => String interpolation
//Question 30 => of
//Question 31 => <router-outlet></router-outlet>
//Question 33 => @HostListener
//Question 34 => 3
//Question 35 =>4
//Question 36 => 3
//Question 37 => $200.13
//Question 38 => 3&6
*/
