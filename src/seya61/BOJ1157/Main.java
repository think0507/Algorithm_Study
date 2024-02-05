package seya61.BOJ1157;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 백준 단계 6
 * 1157번 문제
 * '이윤동' Code
 * Start : 2024/01/26 PM 4:50
 * End : 2024/01/26 PM 5:20
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner 대신 Buffer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 대소문자 상관없이 입력받는 문자열 선언
        String inputWords = br.readLine().toLowerCase();
        Map<Character, Integer> wordsMap = new HashMap<>();     // Key 값은 Character 타입, Value 값은 Integer 타입

        // Character 타입의 입력 값을 inputWords 에 소문자로 넣음.
        // 넣는 방법 : Key 값에는 입력 문자열의 소문자 값, Values 값은 0에서 추가로 들어올때마다 +1
        for (char c : inputWords.toCharArray()) {
            if (Character.isLetter(c)) {
                wordsMap.put(c, wordsMap.getOrDefault(c, 0) +1);
            }
        }

        char FrequentlyChar = getFrequentlyChar(wordsMap);
        bw.write(Character.toUpperCase(FrequentlyChar));
        bw.flush();

        br.close();
        bw.close();
    }

    private static char getFrequentlyChar(Map<Character, Integer> wordsMap) {
        char FrequentlyChar = '?';      // 가장 많이 나온 알파벳이 곂칠 경우를 대비한 Char 형 변수
        int maxNum = 0;                   // 각 알파벳이 얼만큼 나왔는지 체크하는 Int 형 변수

        for (Map.Entry<Character, Integer> entry : wordsMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentNum = entry.getValue();

            // 만약 entry.getKey 의 값인 알파벳의 개수가 그 전의 가장 많은 알파벳보다 개수보다 많을때
            // 가장 많은 알파벳을 현재 Map 의 key 값으로 바꾸고, maxNum 도 바꿈.
            if (currentNum > maxNum) {
                FrequentlyChar = currentChar;
                maxNum = currentNum;
            }

            // 만약 같은 개수 일 경우 ? 출력
            else if (currentNum == maxNum) {
                FrequentlyChar = '?';
            }
        }
        return FrequentlyChar;
    }
}
