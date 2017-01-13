import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main (String [] args){
        BWTV bwtv = new BWTV();
        HDTV hdtv = new HDTV();
        ArrayList<TV> tv = new ArrayList<TV>();
        tv.add(bwtv);
        tv.add(hdtv);
        for(TV e : tv){
            System.out.println(e.tvType() + " ...Am I on? " + e.getTVOn());
        }
        for(TV x : tv){
            System.out.println(x.tvType() + " ...Am I on? " + x.setTVOn(true));
        }
        
    }
}
