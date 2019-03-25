package ua.lviv.iot.seventhLab;

import java.io.IOException;
import java.util.Scanner;

public class StringProcessor {

    public static String readInputText() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean isPalindrome(String string) {//зробити брейк, окрему змінну створити, чи вона паліндром
        int i = 0, j = string.length() - 1;

        boolean isPalindrome = true;

        while (i < j) {
            if (string.charAt(i++) != string.charAt(j--)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public String removeNonPalindromes(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] outputString = string.split("\\s+");

        for (int i = 0; i < outputString.length; i++) {
            if (isPalindrome(outputString[i])) {
                stringBuilder.append(outputString[i]).append(" ");
            }
        }
        String text = stringBuilder.toString();
        return text;
    }

    public void showResults(String string) {
        System.out.println(string);
    }
}
