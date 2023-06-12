//VigenereCipher
public class KriptografiKlasik2 {
    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                char keyChar = key.charAt(i % keyLength);
                int keyOffset = Character.toUpperCase(keyChar) - 'A';
                char shiftedCh = (char) (((Character.toUpperCase(ch) - 'A') + keyOffset) % 26 + 'A');
                ciphertext.append(shiftedCh);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "HELLO";
        String key = "KEY";
        String ciphertext = encrypt(plaintext, key);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
