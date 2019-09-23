import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Lesson3 {

    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбирете игру: 1 - Угадай число, 2 - Угадай слово");
        int a = in.nextInt();
        if (a == 1) guessTheNumber();
        else guessTheWord();guessTheWord();
    }



    public static void guessTheNumber(){
        Scanner in = new Scanner(System.in);

        int a, n = (int)(Math.random()*10);
        System.out.println("Загадано число от 0 до 9, угадайте это число с 3 попыток.");
        for (int i = 0; i < 3; i++){
            System.out.println("Попытка " + (i+1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Число больше!");
            if (a > n) System.out.println("Число меньше!");
            if (a == n) {System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) guessTheNumber();
                else {System.out.println("Спасибо за игру!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Вы не угадали :(");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) guessTheNumber();
        else {System.out.println("Спасибо за игру!");
        }
    }

    public static void guessTheWord() {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "peach", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        int lenWord = word.length();
        System.out.println("Я загадал слово, попробуй отгадать его");
        System.out.println(word);

        do {
            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine();
            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!");
                break;
            }

            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }




}

