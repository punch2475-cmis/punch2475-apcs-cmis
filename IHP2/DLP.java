public class DLP extends Television
{
    public DLP(String model , double price) 
    { 
        super("DLP" + model, price);
    } // end zero-arg constructor Television 
    public String toString(){
        String output = super.toString();
        return output;
    }
}
