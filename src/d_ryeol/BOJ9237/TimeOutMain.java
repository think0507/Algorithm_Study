package d_ryeol.BOJ9237;

import java.util.Scanner;


public class TimeOutMain {
    static Scanner sc = new Scanner(System.in);
    public static int N = sc.nextInt();
    public static int[] arr = new int[N];


    public static void main(String[] args) {
        for(int i = 0; i <N; i++){
            arr[i]=sc.nextInt();
        }
        sortByBubbleSort(arr);
        addOneToArray(arr);
        int result = biggestNumber(arr);

        //다음날 보는것임 +1
        System.out.println(result+1);
    }

    // 정렬하는 메서드 + 숫자 더하는 메서드
    public static void sortByBubbleSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    //크기정렬된 각 배열에 숫자 하나씩 키워가면서 추가
    public static void addOneToArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i]+=i+1;
        }
    }


    // 가장 큰수 찾는 메서드
    public static int biggestNumber(int[] arr){
        int bigNum=0;
        for (int j : arr) {
            if (j > bigNum) {
                bigNum = j;
            }
        }
        return bigNum;
    }

}
