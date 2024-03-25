import java.util.Scanner;

public class VowelOrConsonantRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();

        // Check if input is a single character
        if (input.length() != 1) {
            System.out.println("Error: Please enter only a single character.");
            return;
        }

        char ch = input.charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Error: Please enter a letter.");
            return;
        }

        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        VowelOrConsonant vowelOrConsonant1 = new VowelOrConsonant('l');

        boolean vowelConsonant = vowelOrConsonant.isVowel(ch);
        if(vowelConsonant) {
            System.out.println(ch + " is a Vowel");
        }else{
            System.out.println(ch + " is a Consonant");
        }
    }
}
