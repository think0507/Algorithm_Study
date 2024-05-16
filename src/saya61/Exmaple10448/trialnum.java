package Exmaple10448;

import java.util.Scanner;

// 유레카 이론
// 자연수가 최대 3개의 삼각수의 합으로 표현 가능
// 삼각수 : n(n+1)/2
public class trialnum {
    public static void main(String[] args) {
        IOMethod();
    }

    // 첫 번째 줄 : 테스트 케이스 수 N
    // K(3<=K<=1000)인 테스트 자연수
    // 만약 K가 유레카 이론 Ok - 1, No - 0 출력

    static void IOMethod() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // 결과를 한번에 출력하기 위한 result 배열
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int K = scanner.nextInt();
            result[i] = solution(K);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }

    static int solution(int k) {
        // 삼각수의 최대 크기 45(K가 1000 이하인 자연수)
        int[] trialNum = new int[45];
        for (int i = 1; i <= 44; i++) {
            // i = 44 일 경우 990
            trialNum[i] = i * (i+1) / 2;
        }
        // 세 개의 삼각수를 합하여 k가 되는지 확인
        for (int i = 1; i <= 44; i++) {
            for (int j = 1; j <= 44; j++) {
                for (int m = 1; m <= 44; m++) {
                    // 유레카를 만족시
                    if (trialNum[i] + trialNum[j] + trialNum[m] == k) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
