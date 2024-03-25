public class VowelOrConsonant {
    public char character;

    public VowelOrConsonant(char character) {
        this.character = character;
    }
    public VowelOrConsonant() {
        character = 'a';
    }

    public boolean isVowel(char character){
        char ch = character;
        // Convert input to lowercase for easier comparison
        ch = Character.toLowerCase(ch);
        // Check if the character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
