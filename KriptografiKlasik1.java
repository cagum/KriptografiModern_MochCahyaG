//caesar chipher
public class KriptografiKlasik1 {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                char shiftedCh = (char) (((ch - 'A') + shift) % 26 + 'A');
                ciphertext.append(shiftedCh);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "NUSA";
        int shift = 3;
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
