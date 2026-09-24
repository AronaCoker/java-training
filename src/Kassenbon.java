import java.util.Scanner;

public class Kassenbon {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Produkt name? ");
        String productName = scanner.nextLine();

        double costPerItem = 0;

        System.out.println("Preis pro Stück in Euro? ");
        String itemInput = scanner.nextLine().trim();
        if (itemInput.isEmpty()) {
            System.out.println("Gebe eine zahl ein: ");
            itemInput = scanner.nextLine().trim();

        }   else {
            costPerItem = Double.parsedouble(itemInput);

        }
        double costPerItemRounded = Math.round(costPerItem * 100);

        System.out.println("Wie viele? ");
        String amount = scanner.nextLine();

        System.out.println("Ist das Item ein Lebensmittel? ");
        String isFood = scanner.nextLine();
    }
}
