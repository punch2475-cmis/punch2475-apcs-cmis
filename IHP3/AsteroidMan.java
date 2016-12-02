public class AsteroidMan extends SuperHero
{
    String color; 
    boolean cape;
    public AsteroidMan()
    {
        super();
        int random1 = (int)Math.random()*10;
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
        return "ASTEROIDDDDDDDDDD";
    }
    public String toString(){
        return String.format("AsteroidMan \t %s  \t   %s \t %s ", color, cape, motto());
    }
}
