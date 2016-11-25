public class APP
{
    public static void main (String [] args){
        /*Vehicle v = new Vehicle("a", "b");
        System.out.println(v);
         */
        Vehicle[] vehicles = new Vehicle [10];
        /*for (int i =0; i < vehicles.length; i++){
            if ( i <3){
                vehicles[i] = new Motorbike ("a","b",(int)(Math.random() *10),"c");
            }
            else if (i > 3 && i < 7){
                vehicles[i] = new Car("a","b", "white");
            }
            else{
                if (i % 2 ==0){
                    vehicles[i] = new Car("c", "d" , "blue");
                }
                else{
                    vehicles[i] = new Motorbike("d","b",(int)(Math.random() *10),"c");
                }
            }
            System.out.println(vehicles[i]);
        }*/
        for (int i = 0; i < vehicles.length; i++){
            if ( i* Math.random() % 2 ==0){
                vehicles[i] = new Motorbike ("a","b",(int)(Math.random() *10),"c");
                Vehicle v = (Motorbike) vehicles[i];
            }
            else{
                vehicles[i] = new Car("c", "d" , "blue");
                Vehicle c = (Car) vehicles[i];
            }
        }
        for (int i =0; i < vehicles.length; i++){
            if (vehicles[i] instanceof Motorbike){
                Motorbike m = (Motorbike) vehicles[i];
            }
            else if (vehicles[i] instanceof Car){
                Car t = (Car) vehicles[i];
                 t.last(2500);
                
            }
            System.out.println(vehicles[i]);
        }
    }
}
