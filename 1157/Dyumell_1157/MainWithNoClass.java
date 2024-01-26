package Dyumell_1157;

import java.util.Scanner;

public class MainWithNoClass {
    public static void main(String[] args) {
        int[] arrayIndicatingAlphabetOrder = new int[26];
        char theMostAlphabet;
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.next();

        for (int i = 0; i < inputStr.length(); i++) {
            char selectedAlphabet = inputStr.charAt(i);
            switch (selectedAlphabet) {
                case 'a':
                    arrayIndicatingAlphabetOrder[0]++;
                    break;
                case 'b':
                    arrayIndicatingAlphabetOrder[1]++;
                    break;
                case 'c':
                    arrayIndicatingAlphabetOrder[2]++;
                    break;
                case 'd':
                    arrayIndicatingAlphabetOrder[3]++;
                    break;
                case 'e':
                    arrayIndicatingAlphabetOrder[4]++;
                    break;
                case 'f':
                    arrayIndicatingAlphabetOrder[5]++;
                    break;
                case 'g':
                    arrayIndicatingAlphabetOrder[6]++;
                    break;
                case 'h':
                    arrayIndicatingAlphabetOrder[7]++;
                    break;
                case 'i':
                    arrayIndicatingAlphabetOrder[8]++;
                    break;
                case 'j':
                    arrayIndicatingAlphabetOrder[9]++;
                    break;
                case 'k':
                    arrayIndicatingAlphabetOrder[10]++;
                    break;
                case 'l':
                    arrayIndicatingAlphabetOrder[11]++;
                    break;
                case 'm':
                    arrayIndicatingAlphabetOrder[12]++;
                    break;
                case 'n':
                    arrayIndicatingAlphabetOrder[13]++;
                    break;
                case 'o':
                    arrayIndicatingAlphabetOrder[14]++;
                    break;
                case 'p':
                    arrayIndicatingAlphabetOrder[15]++;
                    break;
                case 'q':
                    arrayIndicatingAlphabetOrder[16]++;
                    break;
                case 'r':
                    arrayIndicatingAlphabetOrder[17]++;
                    break;
                case 's':
                    arrayIndicatingAlphabetOrder[18]++;
                    break;
                case 't':
                    arrayIndicatingAlphabetOrder[19]++;
                    break;
                case 'u':
                    arrayIndicatingAlphabetOrder[20]++;
                    break;
                case 'v':
                    arrayIndicatingAlphabetOrder[21]++;
                    break;
                case 'w':
                    arrayIndicatingAlphabetOrder[22]++;
                    break;
                case 'x':
                    arrayIndicatingAlphabetOrder[23]++;
                    break;
                case 'y':
                    arrayIndicatingAlphabetOrder[24]++;
                    break;
                case 'z':
                    arrayIndicatingAlphabetOrder[25]++;
                    break;
                case 'A':
                    arrayIndicatingAlphabetOrder[0]++;
                    break;
                case 'B':
                    arrayIndicatingAlphabetOrder[1]++;
                    break;
                case 'C':
                    arrayIndicatingAlphabetOrder[2]++;
                    break;
                case 'D':
                    arrayIndicatingAlphabetOrder[3]++;
                    break;
                case 'E':
                    arrayIndicatingAlphabetOrder[4]++;
                    break;
                case 'F':
                    arrayIndicatingAlphabetOrder[5]++;
                    break;
                case 'G':
                    arrayIndicatingAlphabetOrder[6]++;
                    break;
                case 'H':
                    arrayIndicatingAlphabetOrder[7]++;
                    break;
                case 'I':
                    arrayIndicatingAlphabetOrder[8]++;
                    break;
                case 'J':
                    arrayIndicatingAlphabetOrder[9]++;
                    break;
                case 'K':
                    arrayIndicatingAlphabetOrder[10]++;
                    break;
                case 'L':
                    arrayIndicatingAlphabetOrder[11]++;
                    break;
                case 'M':
                    arrayIndicatingAlphabetOrder[12]++;
                    break;
                case 'N':
                    arrayIndicatingAlphabetOrder[13]++;
                    break;
                case 'O':
                    arrayIndicatingAlphabetOrder[14]++;
                    break;
                case 'P':
                    arrayIndicatingAlphabetOrder[15]++;
                    break;
                case 'Q':
                    arrayIndicatingAlphabetOrder[16]++;
                    break;
                case 'R':
                    arrayIndicatingAlphabetOrder[17]++;
                    break;
                case 'S':
                    arrayIndicatingAlphabetOrder[18]++;
                    break;
                case 'T':
                    arrayIndicatingAlphabetOrder[19]++;
                    break;
                case 'U':
                    arrayIndicatingAlphabetOrder[20]++;
                    break;
                case 'V':
                    arrayIndicatingAlphabetOrder[21]++;
                    break;
                case 'W':
                    arrayIndicatingAlphabetOrder[22]++;
                    break;
                case 'X':
                    arrayIndicatingAlphabetOrder[23]++;
                    break;
                case 'Y':
                    arrayIndicatingAlphabetOrder[24]++;
                    break;
                case 'Z':
                    arrayIndicatingAlphabetOrder[25]++;
                    break;
            }
        }

        int indexOfTheMostAlphabet = 0;
        int countOfTheMostAlphabet = 0;
        for (int i = 0; i < arrayIndicatingAlphabetOrder.length; i++) {
            if (countOfTheMostAlphabet < arrayIndicatingAlphabetOrder[i]) {
                countOfTheMostAlphabet = arrayIndicatingAlphabetOrder[i];
                indexOfTheMostAlphabet = i;
            } else {
                if (countOfTheMostAlphabet == arrayIndicatingAlphabetOrder[i])
                    indexOfTheMostAlphabet = -2;
            }
        }
        theMostAlphabet = (char) (65 + indexOfTheMostAlphabet);

        System.out.print(theMostAlphabet);
    }
}
