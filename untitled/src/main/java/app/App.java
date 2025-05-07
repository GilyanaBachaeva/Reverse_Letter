package app;

import java.util.Scanner;
import static app.ReverseResult.madeReverse;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я могу перевернуть символы в строке.");

        String userChoice;
        do {
            System.out.println("Введите строку: ");
            String userLine = scanner.nextLine();
            ReverseResult result = madeReverse(userLine);
            System.out.println("Перевернутая строка: " + result.getReversedString());
            System.out.println("Количество символов: " + result.getCharacterCount());

            System.out.println("Хотите ввести еще одну строку? (Y/N): ");
            userChoice = scanner.nextLine().trim().toLowerCase();
        } while (userChoice.equals("y"));

        System.out.println("Спасибо за использование программы! До свидания!");
        scanner.close();
    }
}
