 public class Phone{
    private String brand = "samsung";
    private int storage= 50; 
    private double camera = 10.9; 
    private int battery = 5000;
    
    public Phone(String brand, int storage, double camera){
        this.brand = brand;
        this.storage= storage;
        this.camera = camera;
    }
    public Phone(int app){
        while(app >0){
            if (app > 1){
                System.out.println(" You have" + app + "applications.");
                app--;
            }
            else {
                System.out.println ("You have zero application.");
                app--;
            }
        }
        this.battery = (int)(Math.random() *200);
        this.camera = (double)(Math.random()*12);
        this.storage = app *12000;
    }
    public static void main(String [] arg)
    {
        Phone p1 = new Phone("Samsung",52,1.8);
        System.out.println(p1);
        System.out.println(p1.brand);
        System.out.println(p1.storage);
        System.out.println(p1.camera);
        
        Phone p2 = new Phone(9);
        System.out.println(p2);
        System.out.println(p2.battery);
        System.out.println(p2.camera);
        System.out.println(p2.storage);
    }
}
