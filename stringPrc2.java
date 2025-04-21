public class stringPrc2 {
   public static void main(String[] args) {
       
            String s1 = "hello";
            String s3 = new String("hello");
            String s4 = new String("hello");
            String s5 = new String("hello");
            // System.out.println(s3 == s4==s5); 
            StringBuilder sc = new StringBuilder("hello");
            System.out.println(sc);
            sc.setCharAt(0, 'p');
            System.out.println(sc);
            sc.append(10 );
            System.out.println(sc);
            sc.reverse();
            System.out.println(sc);

   }
    
}
