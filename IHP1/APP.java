public class APP
{
    public static void main (String [] args){
       MyDevice m = new MyDevice(89, "Pink", false, 25000);
       //System.out.println(m); 
       MyPhone p = new MyPhone(28, "Jet Black", false, 30000, 17, 123546, "IOS" , "apple");
       System.out.println(p);
    }
}
