import java.util.List;
import java.util.ArrayList;
public class APP
{
    public static void main (String [] args){
        MyDevice m = new MyDevice(89, "Pink", false, 25000);
        //System.out.println(m); 
        MyPhone k = new MyPhone(28, "Jet Black", false, 30000, 17, 123546, "IOS" , "apple");
        System.out.println(k);
        List<MyDevice> inventory = new ArrayList<MyDevice>();
        System.out.println(inventory.size()); 
        for( int i = 0; i< 10; i++)
        {
            MyDevice p = new MyDevice((int)(Math.random() *100), "Pink", true , 12000);
            inventory.add(p);
            System.out.println(p);
        } // end for
        System.out.println(inventory.size());
    }
}
