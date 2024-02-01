package saya61.Example9237;

import java.io.*;
import java.util.Arrays;

/**
 * 9237번 문제
 * '이윤동' Code
 * Start : 2024/01/31 PM 5:00
 * End : 2024/01/31 PM 5:40
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int date = 0;
        int sameDate = 1;

        int N = Integer.parseInt(br.readLine());
        String[] trees = br.readLine().split(" ");
        int[] tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(trees[i]);
        }

        Arrays.sort(tree);

        if (tree.length == 1) {
            date = tree[0] + 1;
        } else {
            for (int i = 1; i < tree.length; i++) {
                if (tree[i] == tree[i - 1]) {
                    sameDate++;
                }
                date = tree[N-1] + 1 + sameDate;
            }
        }
        bw.write(Integer.toString(date));

        br.close();
        bw.flush();
        bw.close();
    }
}
