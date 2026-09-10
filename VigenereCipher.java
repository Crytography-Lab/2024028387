import java.util.Scanner;

public class VigenereCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().toUpperCase();

        System.out.print("Enter key: ");
        String key = sc.nextLine().toUpperCase();

        String encrypt = "";
        String decrypt = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char p = text.charAt(i);
            int shift = key.charAt(i % key.length()) - 'A';
            encrypt += (char) ((p - 'A' + shift) % 26 + 'A');
        }

        // Decryption
        for (int i = 0; i < encrypt.length(); i++) {
            char c = encrypt.charAt(i);
            int shift = key.charAt(i % key.length()) - 'A';
            decrypt += (char) ((c - 'A' - shift + 26) % 26 + 'A');
        }

        System.out.println("Encrypted: " + encrypt);
        System.out.println("Decrypted: " + decrypt);
    }
}