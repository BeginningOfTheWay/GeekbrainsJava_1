public class Lesson1 {

    public static void main(String[] args) {

//   2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte c = 30;
        short e = 40;
        int d = 10;
        long a = 50;
        float t = 60;
        double b = 20;
        char y = '\u1212';
        boolean o = 7 < 9 || 9 > 8;

    }

//   3. Написать метод вычисляющий выражение a * (b + (c / d))
//   и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    public static int printFormula(int a, int b, int c, int d) {
        int p = a * (b + (c / d));
        return p;
    }

//   4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
//   лежит в пределах от 10 до 20(включительно), если да – вернуть true,
//   в противном случае – false;

    static boolean printPoint(int o, int s, int l) {
        l = o + s;
        return  (l > 9 && l < 21);
    }

//   5. Написать метод, которому в качестве параметра передается целое число,
//   метод должен напечатать в консоль положительное ли число передали,
//   или отрицательное; Замечание: ноль считаем положительным числом.
//

    public static void printPlusOrMinus(int num) {
        if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

    }

//   6. Написать метод, которому в качестве параметра передается целое число,
//   метод должен вернуть true, если число отрицательное;

    public static boolean numericMinus(int num){

        return num < 0;
    }

//   7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//   метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    static void helloName(String name) {

        System.out.printf("Привет, +", name);
    }

//   8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void printYear(int year) {
        if (bigYear(year)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    private static boolean bigYear(int year) {
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        }
        return false;
    }
}

