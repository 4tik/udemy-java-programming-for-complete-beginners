public class Loops {
    public static void main(String[] args) {
        System.out.println("While Loops.......");
        int number = 10;
        while (number <= 20) {
            System.out.println("okay " + number);
            number += 2;
        }

        System.out.println("For Loops.......");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("current value : " + i);
        }
    }
}
