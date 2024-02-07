package Example9237;

import java.io.*;
import java.util.Arrays;

/**
 * 9237번 문제
 * '이윤동' Code
 * Start : 2024/01/31 PM 5:00
 * End : 2024/01/31 PM 5:40
 */
class DirectorInvitation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] trees = br.readLine().split(" ");
        int[] tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(trees[i]);
        }

        Arrays.sort(tree);
        int minDays = 0;

        for (int i = 0; i < N; i++) {
            minDays = Math.max(minDays, tree[i] + N - i);
        }

        bw.write(Integer.toString(minDays+1));

        br.close();
        bw.flush();
        bw.close();
    }
}