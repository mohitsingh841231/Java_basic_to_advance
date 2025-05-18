import java.util.Scanner;

public class stringPrac4 {
    public static void main(String[] args) {
        // char arr[]  = {'m','o','h','i','t'};
        // for(int i =0 ;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        char arr[]  =  new char[12];
        Scanner sc = new Scanner(System.in);
        // char array = sc.next(null);
        String input = sc.nextLine();
        for(int i = 0;i<input.length() &&i<arr.length;i++){
            arr[i] = input.charAt(i);
        }
        for(int i = 0;i<input.length() && i<arr.length;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
