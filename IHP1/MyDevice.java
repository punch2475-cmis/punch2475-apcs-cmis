public class MyDevice
{
    // instance variables - replace the example below with your own
    private int memory;
    private String color;
    private boolean earphoneJack;
    private int price;

    public MyDevice(int memory, String color, boolean earphoneJack, int price)
    {
        this.memory = memory;
        this.color = color;
        this.earphoneJack = earphoneJack;
        this.price = price;
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int newMemory){
        memory = newMemory;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public boolean getEarphoneJack(){
        return earphoneJack;
    }
    public void setEarphoneJack(boolean newEarphoneJack){
        earphoneJack = newEarphoneJack;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }    
    
    public String toString(){
        return String.format( "The device's memory : %s \n The device's color: %s \n The device has an earphone Jack: %s \n The price of the device is: %s ", memory, color, earphoneJack, price);  
    }
}

