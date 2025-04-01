class mobile{
    String Brand;
    int Price;
    String Name;
    public void  show(){
        System.out.println(Brand+"  "+Price+"  "+Name);

    }
}
public class lec_3 {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.Brand ="samsung";
        obj1.Price =14000;
        obj1.Name = "samsung galexy";
        obj1.show();
    }
    
}
