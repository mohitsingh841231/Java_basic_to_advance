public class numberPrintByRecursion {
    public static int rec(int n) {
        if (n == 1) return 1;
        System.out.println(rec(n));
        return n * rec(n - 1);
    }

    public static void main(String[] args) {
        // rec(5);
        // System.out.print(1);
        System.out.println(rec(5));
    }
}

