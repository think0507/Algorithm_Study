package Dyumell.BOJ1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayIndicatingAlphabetOrder = new int[26];
        char theMostAlphabet;
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.next();

        Main main1 = new Main();
        main1.countAlphabetFromInputString(arrayIndicatingAlphabetOrder, inputStr);

        theMostAlphabet = main1.findOutTheMostAlphabet(arrayIndicatingAlphabetOrder);

        System.out.print(theMostAlphabet);
    }

    public void countAlphabetFromInputString(int[] arrayIndicatingAlphabetOrder, String inputStr) {
        for (int i = 0; i < inputStr.length(); i++) {
            char selectedAlphabet = inputStr.charAt(i);
            this.accumulateCountedAlphabet(arrayIndicatingAlphabetOrder, selectedAlphabet);
        }
    }

    public char findOutTheMostAlphabet(int[] arrayIndicatingAlphabetOrder) {
        int indexOfTheMostAlphabet = 0;
        int CountOfTheMostAlphabet = 0;
        for (int i = 0; i < arrayIndicatingAlphabetOrder.length; i++) {
            if (CountOfTheMostAlphabet < arrayIndicatingAlphabetOrder[i]) {
                CountOfTheMostAlphabet = arrayIndicatingAlphabetOrder[i];
                indexOfTheMostAlphabet = i;
            } else {
                if (CountOfTheMostAlphabet == arrayIndicatingAlphabetOrder[i])
                    indexOfTheMostAlphabet = -2; // 만약 -2 하게되면, 반환값은 63이 되는데 ASCII 코드 : ? 이다
            }
        }
        return (char) (65 + indexOfTheMostAlphabet); // ASCII 알파벳 대문자 값을 반환 65 : A ~ 90 : Z

    }


    public void accumulateCountedAlphabet(int[] arrayIndicatingAlphabetOrder, char character) {
        switch (character) {
            case 'A', 'a':
                arrayIndicatingAlphabetOrder[0]++;
                break;
            case 'B', 'b':
                arrayIndicatingAlphabetOrder[1]++;
                break;
            case 'C', 'c':
                arrayIndicatingAlphabetOrder[2]++;
                break;
            case 'D', 'd':
                arrayIndicatingAlphabetOrder[3]++;
                break;
            case 'E', 'e':
                arrayIndicatingAlphabetOrder[4]++;
                break;
            case 'F', 'f':
                arrayIndicatingAlphabetOrder[5]++;
                break;
            case 'G', 'g':
                arrayIndicatingAlphabetOrder[6]++;
                break;
            case 'H', 'h':
                arrayIndicatingAlphabetOrder[7]++;
                break;
            case 'I', 'i':
                arrayIndicatingAlphabetOrder[8]++;
                break;
            case 'J', 'j':
                arrayIndicatingAlphabetOrder[9]++;
                break;
            case 'K', 'k':
                arrayIndicatingAlphabetOrder[10]++;
                break;
            case 'L', 'l':
                arrayIndicatingAlphabetOrder[11]++;
                break;
            case 'M', 'm':
                arrayIndicatingAlphabetOrder[12]++;
                break;
            case 'N', 'n':
                arrayIndicatingAlphabetOrder[13]++;
                break;
            case 'O', 'o':
                arrayIndicatingAlphabetOrder[14]++;
                break;
            case 'P', 'p':
                arrayIndicatingAlphabetOrder[15]++;
                break;
            case 'Q', 'q':
                arrayIndicatingAlphabetOrder[16]++;
                break;
            case 'R', 'r':
                arrayIndicatingAlphabetOrder[17]++;
                break;
            case 'S', 's':
                arrayIndicatingAlphabetOrder[18]++;
                break;
            case 'T', 't':
                arrayIndicatingAlphabetOrder[19]++;
                break;
            case 'U', 'u':
                arrayIndicatingAlphabetOrder[20]++;
                break;
            case 'V', 'v':
                arrayIndicatingAlphabetOrder[21]++;
                break;
            case 'W', 'w':
                arrayIndicatingAlphabetOrder[22]++;
                break;
            case 'X', 'x':
                arrayIndicatingAlphabetOrder[23]++;
                break;
            case 'Y', 'y':
                arrayIndicatingAlphabetOrder[24]++;
                break;
            case 'Z', 'z':
                arrayIndicatingAlphabetOrder[25]++;
                break;
        }
    }
}
