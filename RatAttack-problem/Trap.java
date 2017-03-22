import greenfoot.*; 
public class Trap extends Actor
{
    private int deviousness;
    private int TrapRat =0;
    public Trap(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/2, img.getHeight()/2);    
    }

    public void act(){
      Rat rat = (Rat)getOneIntersectingObject(Rat.class);
      
        if(isTouching(Rat.class)){
            TrapRat++;
            System.out.println(TrapRat);
        }
        if(TrapRat == 3){
            World w = getWorld();
            Actor ET = (Actor)getWorld().getObjects(Exterminator.class);
            int ETX = ET.getX();
            int ETY = ET.getY();
            w.addObject(new ExtraGuy() , ETX,ETY);
            //TrapRat =0;
        }
    }
}
