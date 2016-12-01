import java.util.List;
import java.util.ArrayList;
public class APP
{
    public static void main (String [] args){
        List<MyDevice> inventory = new ArrayList<MyDevice>();
        inventory.add(new MyPhone((int)(Math.random()*50), "PINK", false, 253000, 45, 456321, "IOS" , "Apple"));
        inventory.add(new MyPod((int)(Math.random()*23), "White", true, 25110, 85, true));
        System.out.println(inventory.size()); 
        for( int i = 0; i< inventory.size(); i++)
        {
            System.out.println(inventory.get(i));
        } // end for
        System.out.println(inventory.size());
    }
}
