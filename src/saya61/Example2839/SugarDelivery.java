package Example2839;

import java.util.Scanner;
/**
 * 2839번 문제
 * '이윤동' Code
 * Start : 2024/02/06 PM 4:05
 * End : 2024/02/06 PM 4:10
 * 과거 C로 풀었던 문제.
 */
class SugarDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();

        System.out.println(solution(sugar));
    }

    public static int solution(int sugar) {
        // 설탕이 5kg 박스로만 포장이 가능할 때
        if (sugar % 5 == 0) {
            return sugar / 5;
        }
        // 설탕이 5kg 박스를 최대한 쓴 후 남은 설탕을 3kg 박스로 포장이 가능할 때
        else {
            for (int i = sugar / 5; i >= 0; i--) {
                int box = sugar - (5 * i);

                if (box % 3 == 0) {
                    return i + (box / 3);
                }
            }
        }
        return -1;
    }
}