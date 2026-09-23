public class Steckbrief {
    static void main() {
        String name = "Arona";
        int age = 30;
        double height = 1.15;
        char favoriteCharacter = 'A';
        boolean drinksCoffe = true;
        int birthYear = 2026 - age;
        int heightInCm  = (int) (height * 100);



        System.out.println(
                "Name: " + name + "\n" +
                "Age:  " + age + "\n" +
                "Height in cm: " + heightInCm + "\n" +
                "Favorit character: " + favoriteCharacter + "\n" +
                "Drinks Coffee?: " + drinksCoffe + "\n" +
                "Birthyear: " + birthYear );


    }

}
