public class Main {
    public static void main(String[] args) {
        int currentBalance = 100_55;
        int payment = 1517_74;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100 / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}