package d_ryeol.BOJ2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[100][100];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int x = a; x < a + 10; x++) {
                for (int y = b; y < b + 10; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int count = 0;
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if (arr[j][k] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}