public class PatternSearch {

    public static void search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

       
        for (int i = 0; i <= N - M; i++) {
            int j;

           
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

          
            if (j == M) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        String txt1 = "AABAACAADAABAABA";
        String pat1 = "AABA";
        System.out.println("Example 1:");
        search(pat1, txt1);

        // Example 2
        String txt2 = "agd";
        String pat2 = "g";
        System.out.println("\nExample 2:");
        search(pat2, txt2);
    }
}
