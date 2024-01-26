package m1157;

import java.util.Scanner;

public class Baek1157_Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("알파벳을 입력하세요: ");
        String input = scanner.nextLine().toUpperCase();

        // 알파벳 등장 횟수를 저장할 배열 초기화
        int[] alphabetCount = new int[26]; // 알파벳 개수는 26개

        // 입력 받은 문자열을 스캔하면서 알파벳 등장 횟수 업데이트
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // 알파벳인 경우에만 처리
            if (currentChar >= 'A' && currentChar <= 'Z') {
            //현재 문자가 A로부터 몇번째 위치에 있나 A면 0 B면 1
                alphabetCount[currentChar - 'A']++;
            }
        }

        // 가장 많이 등장한 알파벳 찾기
        char maxCountChar = '?';
        int maxCount = 0;
        boolean isUnique = true;

        //A부터 Z까지 알파벳을 순회하는 for문 루프
        //순회를 돌면서 A - 알파벳 해서 A로부터 얼마나 거리가 떨어져있나로 측정.
        for (char c = 'A'; c <= 'Z'; c++) {
            if (alphabetCount[c - 'A'] > maxCount) {
                maxCount = alphabetCount[c - 'A']; //등장횟수 업데이트
                maxCountChar = c; //현재 알파벳 저장
                isUnique = true;
            } else if (alphabetCount[c - 'A'] == maxCount) {
                // 최댓값과 같은 등장 횟수를 가진 알파벳이 또 있다면
                isUnique = false;
            }
        }

        // 결과 출력
        if (isUnique) {
            System.out.println("가장 많이 등장한 알파벳: " + maxCountChar);
        } else {
            System.out.println("가장 많이 등장한 알파벳이 여러 개입니다: ?");
        }
    }
}
