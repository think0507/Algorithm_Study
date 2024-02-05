package Example7568;

import java.io.*;

/**
 * 7568번 문제
 * '이윤동' Code
 * Start : 2024/02/01 PM 4:30
 * End : 2024/02/01 PM 5:15
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 인원수 입력부
        int humanNumbers = Integer.parseInt(br.readLine());

        // 입력된 인원수 만큼
        // 한사람이 같은 인덱스로 덩치 랭크, 몸무게, 키를 가지는 배열로 선언
        int[] sizeRank = new int[humanNumbers];
        int[] weight = new int[humanNumbers];
        int[] height = new int[humanNumbers];

        // 몸무게, 키 입력부
        for (int i = 0; i < humanNumbers; i++) {
            // 문제의 조건인 몸무게와 키를 한 줄로 받기 위한 형식
            // 몸무게, 키 배열에 입력된 값을 순서대로 저장
            String[] input = br.readLine().split(" ");
            weight[i] = Integer.parseInt(input[0]);
            height[i] = Integer.parseInt(input[1]);
        }

        // 브루트포스 알고리즘
        // 특정 사람이 측정된 모든 사람과 덩치를 비교했을 때 작으면 sizeRank 증가
        // sizeRank 크면 클수록 덩치 순위는 작음(조건)
        for (int i = 0; i < humanNumbers; i++) {
            for (int j = 0; j < humanNumbers; j++) {
                if (i != j && weight[i] < weight[j] && height[i] < height[j]) {
                    sizeRank[i]++;
                }
            }
        }

        // 입력받은 순서대로 sizeRank 출력
        // 가장 덩치 큰 사람이 1위 이므로 +1하고 출력
        for (int i = 0; i < humanNumbers; i++) {
            bw.write((sizeRank[i] + 1) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}