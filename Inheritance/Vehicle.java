public class Vehicle 
{
    private String name;
    private String brand;

    public Vehicle(String name,String brand){
        this.name = name;
        this.brand = brand;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
        public String getBrand(){
        return brand;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    public String toString(){
        return String.format(" Car %s (%s)", name, brand);
    }
}
