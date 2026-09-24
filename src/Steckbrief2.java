import java.util.Locale;
import java.util.Scanner;

public class Steckbrief2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);


        //Namens ausgabe
        System.out.println("Wie heißt du?:");
        String name =  scanner.nextLine();
        System.out.println("Gebe deinen Vollständigen namen ein: (Zb. Anna Berger)");

        String wholeName = scanner.nextLine();

        System.out.println(wholeName.substring(0, wholeName.indexOf(" ")));

        System.out.println(wholeName.substring(0,1));
        System.out.println(wholeName.substring(wholeName.indexOf(" ")+1,wholeName.indexOf(" ")+2));

        StringBuilder reverseName = new StringBuilder(name).reverse();
        System.out.println(reverseName);


        // Altersausgabe
        System.out.println("wie alt bist du?:");

        int age;
        String ageInput = scanner.nextLine().trim();
        if (ageInput.isEmpty()) {
            age = 18;
        }   else {
            age = Integer.parseInt(ageInput);

        }

        System.out.println("Wie Groß bist du in Metern?:");
       double height = Double.parseDouble(scanner.nextLine().replace(',', '.').trim());

        System.out.println("Trinkst du Kaffee? (Ja/Nein)");
        String drinksCoffe = scanner.nextLine().toLowerCase().trim();

        if (drinksCoffe.equalsIgnoreCase("ja") || drinksCoffe.equalsIgnoreCase("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int birthyear = 2026 - age;

        System.out.printf("%s ist %d Jahre alt, %.2f m gross und wurde %d geboren", name, age, height, birthyear);



        System.out.println("");
        System.out.printf("%s name groß geschrieben ",name   + name.toUpperCase() + " + die Länge des namens "+ name.length());
    }
}
