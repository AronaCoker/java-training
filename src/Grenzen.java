public class Grenzen {
    static void main() {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);


        int daysLived = 70 * 365; //Common whole Number (Einheitliche Ganzzahl)
       long ageInSeconds = (long) daysLived * 24 * 60 * 60; // Long
       long heatbeats = (long) ageInSeconds * 70;
        System.out.println("lived for " + daysLived + " Days");
        System.out.println("lived for " + ageInSeconds + " Seconds");
        System.out.println("Had aprox " + heatbeats + " Heartbeats in his/her life");



    double compareNumber1 = 0.1;
    double compareNumber2 = 0.2;
    double compareNumber3 = 0.3;
        System.out.println(compareNumber1 + compareNumber2);
        System.out.println((compareNumber1 + compareNumber2) == compareNumber3);


        int compareNumber4 = 1;
        int compareNumber5 = 2;
        int compareNumber6 = 3;

        System.out.println(compareNumber4 + compareNumber5 == compareNumber6);

    }
}
