public class LED extends Television
{
    public LED(String model , double price) 
    { 
        super("LE" + model, price);
    } // end zero-arg constructor Television 
    public String toString(){
        String output = super.toString();
        return output;
    }
}
