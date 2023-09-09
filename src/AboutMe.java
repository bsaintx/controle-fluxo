import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
    try{ 
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String name = getStringFromUser(scanner, "Type your name: ");
        String lastName = getStringFromUser(scanner, "Type your last name: ");
        double age = getNumberFromUser(scanner, "How old are you?");
        double height = getNumberFromUser(scanner, "What's your height?");

        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("I'm " + formatAge(age) + " years old ");
        System.out.println("I have " + height + "cm");
        scanner.close();
    } 
    catch(InputMismatchException e){    
            System.out.println("Os campos de idade e altura precisam ser numéricos. Altura precisar ter o separador americano '.'");
        }
    }

    private static String getStringFromUser(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.next();
    }

    private static double getNumberFromUser(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static String formatAge(double age) {
        return String.format("%.0f", age);
    }

}
