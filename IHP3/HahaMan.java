public class HahaMan extends SuperHero
{
    String color; 
    boolean cape;
    public HahaMan(){
        super();
        int random1 = 9;
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
        return "LAUGH";
    }

    public String toString(){
        return String.format("HahaMan \t %s \t %s \t %s ", color, cape, motto());
    }
}
