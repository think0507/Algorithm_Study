package Dyumell.BOJ1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber1 = scanner.nextInt();
        int[] inputNumberArray1 = new int[inputNumber1];

        for (int i = 0; i < inputNumberArray1.length; i++) {
            inputNumberArray1[i] = scanner.nextInt();
        }

        Arrays.sort(inputNumberArray1); // 첫 번째 입력 배열 정렬

        int inputNumber2 = scanner.nextInt();
        int[] inputNumberArray2 = new int[inputNumber2];

        for (int i = 0; i < inputNumberArray2.length; i++) {
            inputNumberArray2[i] = scanner.nextInt();
        }

        for (int num : inputNumberArray2) {
            if (binarySearch(inputNumberArray1, num))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    // 이진 탐색 함수
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}
