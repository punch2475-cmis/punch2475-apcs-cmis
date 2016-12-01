import java.util.List;
import java.util.ArrayList;
public class APP
{
    public static void main (String [] args){
        List<Television> tv = new ArrayList<Television>();
        tv.add(new Television("HD Bronze" , 13.99));
        tv.add(new DLP("Silver" , 99.99));
        tv.add(new LCD("Gold" , 199.99));
        tv.add(new LED("Platinum" , 399.99));
        tv.add(new Plasma("Sapphire" , 499.99));

        for (int i = 0; i < tv.size(); i++){
            System.out.println(tv.get(i));
        }
    }
}
