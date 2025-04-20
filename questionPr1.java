public class questionPr1 {
    public static void main(String[] args) {
        String s = "physics";
        for(int i =0;i<s.length();i++){
            System.out.println(s.substring(i));
            // System.out.println(s.length());
            System.out.println();
            System.out.println();
            int l = s.length();
            int iw =0;
            System.out.println("physics");
            while(iw!=l){
                iw++;
                
                System.out.println(s.substring(iw));
            }
        }
    }
}
