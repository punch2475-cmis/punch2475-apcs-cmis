import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyPod pod = new MyPod( 32, "Black" );
      MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
      MyCar car = new MyCar(45);
      ArrayList<Connectable> inventory = new ArrayList<Connectable>(); 
      inventory.add( pod );
      inventory.add( phone );
      inventory.add( car );
      for( Connectable device : inventory ) 
         {
         device.connectToBluetooth();              
         } // end for each
      ArrayList <Discountable> discount = new ArrayList<Discountable>();
      discount.add(pod);
      discount.add(car);
      for( Discountable device : discount ){
          device.applyDiscount();
          
        }
      } // end method main
   } // end class MyDevicesDriver
   