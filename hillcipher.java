import java.util.*;

public class hillcipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Key matrix
        int[][] key = {{3, 3}, {2, 5}};
        int[][] inv = {{15, 17}, {20, 9}}; // Inverse key

        System.out.print("Enter 2-letter text: ");
        String text = sc.nextLine().toUpperCase();

        int a = text.charAt(0) - 'A';
        int b = text.charAt(1) - 'A';

        // Encryption
        int e1 = (key[0][0]*a + key[0][1]*b) % 26;
        int e2 = (key[1][0]*a + key[1][1]*b) % 26;

        String enc = "" + (char)(e1+'A') + (char)(e2+'A');

        // Decryption
        int d1 = (inv[0][0]*e1 + inv[0][1]*e2) % 26;
        int d2 = (inv[1][0]*e1 + inv[1][1]*e2) % 26;

        String dec = "" + (char)(d1+'A') + (char)(d2+'A');

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}