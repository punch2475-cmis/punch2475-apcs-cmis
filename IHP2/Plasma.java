
public class Plasma extends Television
{
        public Plasma(String model , double price) 
    { 
        super("Plasma" + model, price);
    } // end zero-arg constructor Television 
    public String toString(){
        String output = super.toString();
        return output;
    }
}
