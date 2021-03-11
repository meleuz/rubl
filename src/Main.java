public class Main {
    public static void main(String[] args) {
        double currentBalance = 100.55;
        double payment = 1500.74;
        int currentBalance = 100_55;
        int payment = 1517_74;

        double bonus;
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
            bonus = payment / 100 / 100;
        } else {
            bonus = 0;
        }

        /*System.out.printf("%.0f", bonus);*/

        double newBalance = currentBalance + payment + bonus;
        System.out.printf("%.2f",newBalance);
        System.out.println(bonus);
    }
}