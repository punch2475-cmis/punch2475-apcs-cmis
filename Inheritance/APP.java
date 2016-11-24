public class APP
{
    public static void main (String [] args){
        Vehicle v = new Vehicle("a", "b");
        System.out.println(v);
        
        Vehicle[] vehicles = new Vehicle [10];
        for (int i =0; i < vehicles.length; i++){
            if ( i <3){
               vehicles[i] = new Motorbike ("a","b",(int)(Math.random() *10),"c");
               System.out.println(vehicles[i]);
            }
            else if (i > 3 && i < 7){
                vehicles[i] = new Car("a","b", "white");
            }
            else{
                vehicles[i] = new Car("c", "d" , "blue");
            }
        }
       
    }
}
