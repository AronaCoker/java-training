import java.util.Locale;
import java.util.Scanner;

public class Steckbrief2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?:");
        String name =  scanner.nextLine();

        System.out.println("wie alt bist du?:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Wie Groß bist du in Metern?:");
       double height = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.println("Trinkst du Kaffee? (Ja/Nein)");
        String drinksCoffe = scanner.nextLine();
        System.out.println(drinksCoffe.equalsIgnoreCase("Ja"));
        int birthyear = 2026 - age;

        System.out.printf("%s ist %d Jahre alt, %.2f m gross und wurde %d geboren", name, age, height, birthyear);

        System.out.println("");
        System.out.printf("Annas name groß geschrieben " +name.toUpperCase() + " + die Länge des namens "+ name.length());
    }
}
