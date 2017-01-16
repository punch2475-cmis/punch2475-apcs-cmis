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
        System.out.println("\n");
        for(TV x : tv){
            x.setTVOn(true);
            System.out.println(x.tvType() + " ...Am I on? " + x.getTVOn());
        }
        System.out.println(bwtv.rotateRabbitEars());
        System.out.println(hdtv.connectHDMI());
    }
}
