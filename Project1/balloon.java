import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon extends Actor
{
    /**
     * Act - do whatever the balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int positionX = getX()+1;
        int positionY = getY() +1;
        if(positionX >= getWorld().getWidth() || positionY >= getWorld().getWidth()){
            getWorld().removeObject(this);
        }
        else{
            setLocation(positionX, positionY);
        }
    }    
}
