
public class Car extends Vehicle
{
    private String color; 
    private int o;
    public Car(String name,String brand, String color){
        super(name, brand);
        this.color = color;
        this.o = o;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public int getO(){
        return o;
    }
    public void setO(int newO){
        o = newO;
    }    
    public void setName(String newName)
    {
        super.setName(newName);
    }
    public String toString(){
        return String.format("%s : color %s", super.toString(), color);
    }
}
