package Aston;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() > 7) {
                System.out.println("Привет");
            }
        }
    }
}
