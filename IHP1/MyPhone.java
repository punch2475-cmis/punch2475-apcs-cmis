public class MyPhone extends MyDevice
{
    // instance variables - replace the example below with your own
    private int CameraPixel;
    private int phoneSerialNumber; 
    private String OperatingSystem;
    private String brand;

    public MyPhone(int memory, String color, boolean earphoneJack, int price, int CameraPixel, int phoneSerialNumber, String OperatingSystem,String brand)
    {
        super(memory,color, earphoneJack, price);
        this.CameraPixel = CameraPixel;
        this.phoneSerialNumber = phoneSerialNumber;
        this.OperatingSystem = OperatingSystem;
        this.brand = brand;
    }

    public int getCameraPixel(){
        return CameraPixel;
    }

    public void setCameraPixel(int newCameraPixel){
        CameraPixel = newCameraPixel;
    }

    public int getphoneSerialNumber(){
        return phoneSerialNumber;
    }

    public void setphoneSerialNumber(int newphoneSerialNumber){
        phoneSerialNumber = newphoneSerialNumber;
    }

    public String getOperatingSystem(){
        return OperatingSystem;
    }

    public void setOpearatingSystem(String newOperatingSystem){
        OperatingSystem = newOperatingSystem;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public String toString(){
        return String.format("%s \n The phone's brand: %s \n The phone's operating sytem: %s \n The phone's serial number: %s \n The phone's camera: %s  pixel",super.toString(), brand, OperatingSystem, phoneSerialNumber,CameraPixel );
    }
}
