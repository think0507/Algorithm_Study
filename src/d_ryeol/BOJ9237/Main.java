package d_ryeol.BOJ9237;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int N = sc.nextInt();
    public static int[] arr = new int[N];


    public static void main(String[] args) {
        for(int i = 0; i <N; i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        addOneToArray(arr);
        sortArray(arr);

        //다음날 보는것임 +1
        System.out.println(arr[arr.length-1]+1);
    }

    // 정렬하는 메서드 + 숫자 더하는 메서드
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    //크기정렬된 각 배열에 숫자 하나씩 키워가면서 추가
    public static void addOneToArray(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            arr[i]+= arr.length-i;
        }
    }
}

