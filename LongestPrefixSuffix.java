import java.util.Scanner;

public class LongestPrefixSuffix {

    public static int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0; // length of the previous longest prefix suffix
        int i = 1;

        lps[0] = 0; // first element is always 0

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // backtrack
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to compute LPS: ");
        String pattern = scanner.nextLine();

        int[] lps = computeLPS(pattern);

        System.out.println("LPS Array:");
        for (int i = 0; i < lps.length; i++) {
            System.out.println("lps[" + i + "] = " + lps[i]);
        }

        scanner.close();
    }
}
