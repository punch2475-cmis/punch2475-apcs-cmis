public class FriedEggMan extends SuperHero
{
    String color; 
    boolean cape;
    public FriedEggMan()
    {
        super();
        int random1 = 6;
        if( random1 > 5){
            color = "Yellow";
            cape = true;
            super.setCape(cape);
            super.setSuitColor(color);
        }
        else {
           color = "Black";
           cape = false;
           super.setCape(cape);
           super.setSuitColor(color);
        }
    }
    public String motto(){
        return "EGG ";
    }
    public String toString(){
        return String.format("FriedEggMan \t %s \t %s \t %s ", color, cape, motto());
    }
}
