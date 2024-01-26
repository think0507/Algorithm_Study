import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] intarr = new int[str.length()];
        int[] result = new int[26];
        Arrays.fill(result, 0);
        int i = 0;
        int max = 0;
        int tmp = 0;

        for (i = 0; i < str.length(); i++) {
            intarr[i] = (int) str.charAt(i);
        }

        for (i = 0; i < str.length(); i++) {
            if (intarr[i] >= 65 && intarr[i] <= 90) {
                result[intarr[i] - 65]++;
                if (result[intarr[i] - 65] > max) {
                    max = result[intarr[i] - 65];
                    tmp = intarr[i] - 65;
                }
            } else if (intarr[i] >= 97 && intarr[i] <= 122) {
                result[intarr[i] - 97]++;
                if (result[intarr[i] - 97] > max) {
                    max = result[intarr[i] - 97];
                    tmp = intarr[i] - 97;
                }
            }
        }
        int max2 = 0;
        int isTwo = 0;

        for (i = 0; i < 26; i++) {
            if (result[i] > max2) {
                max2 = result[i];
            }
        }
        for (i = 0; i < 26; i++) {
            if (result[i] == max2) {
                isTwo++;
            }
        }

        if (isTwo == 1) {
            System.out.println((char) (tmp + 65));
        } else {
            System.out.println("?");
        }
    }
}