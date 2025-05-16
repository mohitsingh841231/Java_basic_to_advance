public class stringSub {
    public static void main(String[] args) {
        String s2 ="abcd";
        
        for(int i = 0 ;i<4;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(s2.substring(i,j)+" ");
            }
        }
    }
}
