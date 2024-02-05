package Example2563;

import java.util.Scanner;

/**
 * 2563번 문제
 * '이윤동' Code
 * Start : 2024/01/31 PM 4:33
 * End : 2024/01/31 PM 5:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean[][] paper = new boolean[100][100];

        int result = 0;

        for (int k = 0; k < N; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (!paper[i][j]) {
                        paper[i][j] = true; // 색종이 영역 표시
                        result++; // 영역의 넓이 증가
                    }
                }
            }
        }
        System.out.println(result);
    }
}
