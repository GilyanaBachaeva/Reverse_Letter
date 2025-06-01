package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userLine = scanner.nextLine();
        String revUserLine = StringUtil.reverseLetters(userLine);
        System.out.println("Перевернутая строка: " + revUserLine);
    }
}
