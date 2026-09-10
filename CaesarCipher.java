import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift: ");
        int shift = sc.nextInt();

        String encrypt = "";
        String decrypt = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
            else if (ch >= 'a' && ch <= 'z')
                ch = (char) ((ch - 'a' + shift) % 26 + 'a');

            encrypt += ch;
        }

        // Decryption
        for (int i = 0; i < encrypt.length(); i++) {
            char ch = encrypt.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch = (char) ((ch - 'A' - shift + 26) % 26 + 'A');
            else if (ch >= 'a' && ch <= 'z')
                ch = (char) ((ch - 'a' - shift + 26) % 26 + 'a');

            decrypt += ch;
        }

        System.out.println("Encrypted: " + encrypt);
        System.out.println("Decrypted: " + decrypt);

        sc.close();
    }
}