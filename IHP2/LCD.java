public class LCD extends Television
{
    public LCD(String model , double price) 
    { 
        super(model, price);
    } // end zero-arg constructor Television 

    public void setModel(String newModel)
    {
        super.setModel(newModel);
    }

    public String getModel(){
        return super.getModel();
    }

    public void setPrice(double newPrice)
    {
        super.setPrice(newPrice);
    }

    public double getPrice(){
        return super.getPrice();
    }
    /*public LCD(){
       super.getModel = "HD";
       price = 89.69;
    }*/
}
