import java.util.Scanner;

public class MonoalphabeticCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key   = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter text: ");
        String text = sc.nextLine().toUpperCase();

        String encrypt = "";
        String decrypt = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int index = plain.indexOf(ch);

            if (index != -1)
                encrypt += key.charAt(index);
            else
                encrypt += ch;
        }

        // Decryption
        for (int i = 0; i < encrypt.length(); i++) {
            char ch = encrypt.charAt(i);
            int index = key.indexOf(ch);

            if (index != -1)
                decrypt += plain.charAt(index);
            else
                decrypt += ch;
        }

        System.out.println("Encrypted: " + encrypt);
        System.out.println("Decrypted: " + decrypt);
    }
}