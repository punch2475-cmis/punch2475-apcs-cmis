 
import javax.swing.JOptionPane;
public class Phone{
    private String brand = "samsung";
    private int storage= 50; 
    private double camera = 10.9; 
    private int battery = 5000;
    private boolean onoff1 = true; 
    private int app = 10; 
    private int appStorage; 
    private int left;
    private int Storageleft; 
    private String passFail;
    public static final String Password = "123456789";
    public static final int APP = 12; 
    public static final int STORAGE = 128; 
    public Phone(String brand, int storage, double camera){
        this.brand = brand;
        this.storage= storage;
        this.camera = camera;
    }
    
    public Phone(int app){
        this.brand = "Apple";
        this.camera = (double)(Math.random()*12);
        this.storage = app *12;
        while(app >0){
            if (app > 1){
                System.out.println(" You have " + app + " applications.");
                app--;
            }
            else {
                System.out.println ("You have zero application.");
                app--;
            }
        }//end while loop
    }//end Phone
    
    public String getBrand(){
        return brand;
    }
    
    public void setbrand(String newBrand){
        brand = newBrand;
    }
    
    public int getStorage(){
        return storage;
    }
    
    public void setStorage(int newStorage)
    {
        storage = newStorage;
    }
    
    public double getCamera(){
        return camera;
    }
    
    public void setCamera(double newCamera){
        camera = newCamera;
    }
    
    public int getBattery(){
        return battery;
    }
    
    public void setBattery(int newBattery)
    {
        battery = newBattery;
    }
    
    public String getonOff(){
        String onOff;
        if (onoff1)
        {
            onOff = "On";
        }
        else
        {
            onOff = "Off";
        }
        return onOff; 
    }
    public int getStorageleft(){
        int left;
        if (storage > 0){
            left = storage-(app * 2);
            //System.out.println("There are " + left + " GB left in your phone.");
        }
        else{
            left = 0;
            //System.out.println("There are no more space left");
        }
        return left;
    }
    public String getTries(){
        int tries =0;
         
        String input1 = JOptionPane.showInputDialog( "Type a number: " );
        for ( tries = 0; tries < 5; tries++){
        if (input1 == Password){
            passFail = "PASS";
        }
        else{
             passFail = "FAIL TRY AGAIN";
        }
      }
      return passFail; 
    }
    /*public String getNewBrand(){
        String NewBrand;
        if (brand.length 
    }
    /*public static void main(String [] arg)
    {
        Phone p1 = new Phone("Samsung",52,1.8);
        System.out.println(p1);
        //System.out.println(p1.brand);
        //System.out.println(p1.storage);
        //System.out.println(p1.camera);
        
        Phone p2 = new Phone(9);
        System.out.println(p2);
    }*/
    
        public String toString(){
        String output ="Brand: " +  brand + "\nPhone on/off " +getonOff() +"\nStorage: " + storage +" GB" + "\nCamera: " + camera + " mega-pixel" + "\nThere are " + getStorageleft() + " GB in your phone.";
        return output;
        }//end toString
    
    /*public String getGenderWord(){
        if (gender = true)
        {
            return "Female";
        }
        else{
            return "Male";
        }*/

    
    
        /* storage left 
         * (# of app *2) - storage    
        */
}//end class
