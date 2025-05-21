import java.util.Scanner;

public class gcdlcm {
  // public static int main(String[] args) {
//     int x =45;
//     int y = 12;
//     while(x%y !=0){
//         int rem = x%y;
//         x=y;
//         y= rem;
//         System.out.println(y);

//     }
//     return y;
//    } 
static int isGcd(int x,int y){
  while(x%y !=0){
    int rem = x%y;
    x =y;
    y = rem;
  }
  return y;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(isGcd(x,y));
}


}
