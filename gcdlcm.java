import java.util.Scanner;

public class gcdlcm {
static int Gcd(int x,int y){
        if(y ==0)return x;
       return Gcd(y, x % y);
}

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
    // System.out.println(isGcd(x,y));
    System.out.println(Gcd(x, y));
}


}
