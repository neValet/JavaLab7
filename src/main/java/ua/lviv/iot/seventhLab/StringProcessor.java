package ua.lviv.iot.seventhLab;

import java.io.IOException;
import java.util.Scanner;

public class StringProcessor {

    public static String readInputText() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean isPalindrome(String string) {
        int i = 0, j = string.length() - 1;

        while (i < j) {
            if (string.charAt(i++) != string.charAt(j--))
                return false;
        }
        return true;
    }

    public String removeNonPalindromes(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] outputString = string.split("\\s+");

        for (int i = 0; i < outputString.length; i++) {
            if (isPalindrome(outputString[i])) {
                stringBuilder.append(outputString[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public String showResults(final StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }


}
