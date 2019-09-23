public class Lesson2 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("\r\n**********");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] == 1 ? 0 : 1;
            System.out.print(array1[i] + " ");
        }

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        System.out.println("\r\n*********");
        int[] array2 = new int[8];
        for (int i = 1, j = 0; i < array2.length; i++) array2[i] = j += 3;
        for (int x : array2) System.out.print(x + " ");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;

        System.out.println("\r\n*********");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
            System.out.print(array3[i] + " ");
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("\r\n********");
        int[][] array4 = new int[7][7];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0, j2 = array4[i].length; j < array4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) array4[i][j] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        System.out.println("\r\n**********");
        int[] array5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = array5[0], max = array5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
                indMax = i;
            }
            if (array5[i] < min) {
                min = array5[i];
                indMin = i;
            }
        }
        System.out.println("The maximum element is in the array below the index " + indMax + " with the value  = " + max);
        System.out.println("The minimum element is in the array below the index " + indMin + " with the value  = " + min);


    }


}
