 class Music {
    public void  Music(){
        System.out.println("music ON");
    }
    public String Pen(int cost){
        if(cost>=10)
        return "pen";
        else
        return "Nothing";
    }

}
public class lec_2 {
    public static void main(String[] args) {
        Music obj = new Music();
        obj.Music();
        String str = obj.Pen(2);
        System.out.println(str);
        
    }
    
}
