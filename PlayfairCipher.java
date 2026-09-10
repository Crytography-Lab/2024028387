import java.util.*;

public class PlayfairCipher {
    static char[][] m = {
        {'M','O','N','A','R'},
        {'C','H','Y','B','D'},
        {'E','F','G','I','K'},
        {'L','P','Q','S','T'},
        {'U','V','W','X','Z'}
    };

    static int[] pos(char c) {
        if (c == 'J') c = 'I';
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (m[i][j] == c) return new int[]{i, j};
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 letters: ");
        String s = sc.next().toUpperCase();

        char a = s.charAt(0), b = s.charAt(1);
        int[] p1 = pos(a), p2 = pos(b);

        // Encrypt
        char e1, e2;
        if (p1[0] == p2[0]) {
            e1 = m[p1[0]][(p1[1]+1)%5];
            e2 = m[p2[0]][(p2[1]+1)%5];
        } else if (p1[1] == p2[1]) {
            e1 = m[(p1[0]+1)%5][p1[1]];
            e2 = m[(p2[0]+1)%5][p2[1]];
        } else {
            e1 = m[p1[0]][p2[1]];
            e2 = m[p2[0]][p1[1]];
        }

        System.out.println("Encrypted: " + e1 + "" + e2);

        // Decrypt
        p1 = pos(e1); p2 = pos(e2);
        char d1, d2;
        if (p1[0] == p2[0]) {
            d1 = m[p1[0]][(p1[1]+4)%5];
            d2 = m[p2[0]][(p2[1]+4)%5];
        } else if (p1[1] == p2[1]) {
            d1 = m[(p1[0]+4)%5][p1[1]];
            d2 = m[(p2[0]+4)%5][p2[1]];
        } else {
            d1 = m[p1[0]][p2[1]];
            d2 = m[p2[0]][p1[1]];
        }

        System.out.println("Decrypted: " + d1 + "" + d2);
    }
}