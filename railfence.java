import java.util.Scanner;

public class railfence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().replace(" ", "").toUpperCase();

        String rail1 = "", rail2 = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0)
                rail1 += text.charAt(i);
            else
                rail2 += text.charAt(i);
        }

        String enc = rail1 + rail2;
        System.out.println("Encrypted: " + enc);

        // Decryption
        int mid = (text.length() + 1) / 2;
        String r1 = enc.substring(0, mid);
        String r2 = enc.substring(mid);

        String dec = "";
        int i = 0, j = 0;

        while (i < r1.length() || j < r2.length()) {
            if (i < r1.length()) dec += r1.charAt(i++);
            if (j < r2.length()) dec += r2.charAt(j++);
        }

        System.out.println("Decrypted: " + dec);
    }
}