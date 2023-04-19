public class Main {
    /*Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */
    public static void main(String[] args) {

        System.out.println("\nTask 3: ");
        doTask3();

    }

    public static void doTask3() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
