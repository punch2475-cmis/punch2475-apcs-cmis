import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Actor Target;
    public ant(Actor Target){
        this.Target = Target;
    }
    public void act() 
    {
        // Add your action code here.
        follow();
    } 
     public void follow(){
        int targetX = Target.getX();
        int targetY = Target.getY();
        
        turnTowards(targetX  , targetY);
        if(targetX == getX() && targetY == getY()){
            move(0);
        }
        else{
            move(2);
        }
    }
}
