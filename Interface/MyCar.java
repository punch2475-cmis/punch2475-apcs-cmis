public class MyCar implements Connectable , Discountable
{
    private int kpm;

    public MyCar( int KMperMeters){
        this.kpm = KMperMeters;
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
    }

    public void applyDiscount()
    {
        System.out.println( "Discount for MyCar is 10%" );    
    }
}
