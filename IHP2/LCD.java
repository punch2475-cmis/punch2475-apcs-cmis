public class LCD extends Television
{
    public LCD(String model , double price) 
    { 
        super("LCD" + model, price);
    } // end zero-arg constructor Television 
    public String toString(){
        String output = super.toString();
        return output;
    }
    
}
