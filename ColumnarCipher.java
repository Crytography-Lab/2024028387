import java.util.*;

public class ColumnarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().replace(" ", "").toUpperCase();

        int[] key = {3, 1, 4, 2};   // Column order
        int cols = key.length;
        int rows = (int) Math.ceil((double) text.length() / cols);

        char[][] mat = new char[rows][cols];
        int k = 0;

        // Fill matrix row-wise
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (k < text.length()) ? text.charAt(k++) : 'X';

        // Encryption
        String enc = "";
        for (int n = 1; n <= cols; n++)
            for (int j = 0; j < cols; j++)
                if (key[j] == n)
                    for (int i = 0; i < rows; i++)
                        enc += mat[i][j];

        System.out.println("Encrypted: " + enc);

        // Decryption
        char[][] decMat = new char[rows][cols];
        k = 0;
        for (int n = 1; n <= cols; n++)
            for (int j = 0; j < cols; j++)
                if (key[j] == n)
                    for (int i = 0; i < rows; i++)
                        decMat[i][j] = enc.charAt(k++);

        String dec = "";
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                dec += decMat[i][j];

        System.out.println("Decrypted: " + dec);
    }
}