package wookdong.BOJ9237;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baek9237_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //묘목의 개수를 입력받는 n
//        System.out.println("묘목의 개수는"+n);
        Integer [] arr = new Integer[n]; //입력받은 갯수만큼 배열 생성
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr, Collections.reverseOrder());
        int maxResult = Integer.MIN_VALUE; // 최댓값을 저장할 변수를 가장 작은 값으로 초기화합니다.

        for(int i=0; i<n; i++){
            int result=arr[i]-(n-i);
//            System.out.println(result+" ");

            if (result > maxResult) {
                maxResult = result;
            }
        }

        int finalResult = maxResult + n + 2;
        System.out.println(finalResult);



//        for(int tree: arr) {
//            for (int x = n; x < n+1; x--) {
//                System.out.println(tree);
//            }
//        }



    }
}

