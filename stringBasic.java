public class stringBasic {
    public static void main(String[] args) {
       String str = "mohit" ;
       char ch = str.charAt(0);
       System.out.println(ch);



       String str1 = "mohit kumar singh";
       int idx =str1.indexOf("a");
       System.out.println(idx);
       String str2 = "mohit";
       String str3 = "rohit";
       int cpm = str2.compareTo(str3);
       System.out.println(cpm);
       String str4 = "physics";
       System.out.println(str4.startsWith("ph"));
       String s4 = str1.concat(str4);
       System.out.println(s4);
       str4 = str4+"sonu";
       System.out.println(str4);
    //    int sut = 10+String(a);
       System.out.println(10+20+"absc");
       System.out.println("absc"+10+20);


    //    subString 
    String st = "abcde";
    System.out.println(st.substring(0));
    }
    // indexOf() and compareTo()

    
}
