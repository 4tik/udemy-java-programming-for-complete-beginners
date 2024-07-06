public class Arrays {
    public static void main(String[] args) {
        System.out.println("Array....");
        int[] numbers = { 1, 4, 6, 0 };
        for (int number : numbers) {
            System.out.println("number : " + number);
        }

        int[][] multiArray = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[0].length; j++) {
                System.out.println("array value : " + multiArray[i][j]);
            }
        }
    }
}
