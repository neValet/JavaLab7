package ua.lviv.iot.seventhLab;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your text:");
        String inputText = null;
        StringProcessor stringProcessor = null;

        try {
            inputText = StringProcessor.readInputText();
            stringProcessor = new StringProcessor();
            String result = stringProcessor.removeNonPalindromes(inputText);
            stringProcessor.showResults(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

