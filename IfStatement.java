public class IfStatement {
    public static void main(String[] args) {
        System.out.println("if statement........");

        boolean comparison = 3 < 2;
        boolean notEquals = 3 != 2;
        boolean equals = 5 == 4;

        System.out.println(comparison);
        System.out.println(notEquals);
        System.out.println(equals);

        int amount = 20;
        if (amount == 10) {
            System.out.println("it's true");
        } else if (amount > 30) {
            System.out.println("amount is big");
        } else {
            System.out.println("it's false");
        }
    }
}
