package saya61.Example2444;


import java.util.Scanner;

/**
 * 백준 단계6
 * 2444번 문제
 * '이윤동' Code
 * 2024/1/31
 * ST. PM 4:20
 * ET. PM 4:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n - i - 1; a++)
                System.out.print(" ");
            for (int b = 0; b < 2 * i + 1; b++)
                System.out.print("*");
            System.out.println();
        }
        for (int j = 1; j < n; j++) {
            for (int a = 0; a < j; a++)
                System.out.print(" ");
            for (int b = 0; b < 2 * (n - j) - 1; b++)
                System.out.print("*");
            System.out.println();
        }
    }
}
