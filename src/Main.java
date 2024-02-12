import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String multiWord;

        final int NUM = 7;

        String word = "World";

        multiWord = NUM + word;

        System.out.println("multiWord: " + multiWord + ", NUM: " + NUM + ", word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.print("Введите ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();


        System.out.println("Привет, " + userName + "!");
    }
}
