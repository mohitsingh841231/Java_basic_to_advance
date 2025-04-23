public class math {
    public static void main(String[] args) {
        int a =12;
        int b =13;
        // System.out.println(Math.min(a, b));
        // System.out.println(Math.sqrt(a));
        // System.out.println((int)Math.pow(a,b));
    //    System.out.println( rdm(12,4));
    System.out.println(Math.round(5.9));
    System.out.println(Math.abs(-3));
    System.out.println(Math.ceil(5.3));
    }
    static int rdm(int a,int b){
        // return (int)(Math.random()*6)+1;
        return (int)(Math.random()*(b-a+1)+a);
    }
}
