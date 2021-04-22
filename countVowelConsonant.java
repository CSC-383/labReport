// question no 11
package labreport;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class countVowelConsonant {

    public static void main(String[] args) {

        String userInput = "testing12345";
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        int numOfVowels = 0, numOfConsonants = 0, numOfDigits = 0;
        double perOfVowel = 0, perOfConsonant = 0, perOfDigit = 0;
        for (int i = 0; i < userInput.length(); ++i) {
            char ch = userInput.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++numOfVowels;
                perOfVowel = ((double) numOfVowels * 100) / userInput.length();
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++numOfConsonants;
                perOfConsonant = ((double) numOfConsonants * 100) / userInput.length();

            } else if (ch >= '0' && ch <= '9') {
                ++numOfDigits;
                perOfDigit = ((double) numOfDigits * 100) / userInput.length();

            }

        }

        System.out.println("Vowels: " + numOfVowels + "(" + df.format(perOfVowel) + "%" + ")");
        System.out.println("Consonants: " + numOfConsonants + "(" + df.format(perOfConsonant) + "%" + ")");
        System.out.println("Digits: " + numOfDigits + "(" + df.format(perOfDigit) + "%" + ")");

    }
}
