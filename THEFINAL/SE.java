import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SE extends energy
{
    /**
     * Act - do whatever the SE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int power;
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Jake.class)){
            power = 100;
        }
        power--;
        appear();
    }   
      public void appear(){
        while( power <= 10){
             MyWorld w = (MyWorld)getWorld();
             //w.removeObject(this);
        }
        
    }
}
