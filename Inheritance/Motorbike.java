public class Motorbike extends Vehicle
{
    private int maxSpeed;
    private String type;
    
    public Motorbike(String name,String brand,int maxSpeed,String type){
        super(name, brand);
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    
    public int getMaxspeed(){
        return maxSpeed;
    }
    public void setMaxspeed(int newMaxspeed){
        maxSpeed = newMaxspeed;
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    public void setName(String newName){
        super.setName(newName);
    }
    public String toString(){
        return String.format("Motorbike %s (%s)", maxSpeed, type);
    }
}

