import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         int positionX =getX();
        int positionY= getY()+1;
       if(isAtEdge() == true){
            getWorld().removeObject(this);
        }
        else{
            setLocation(positionX, positionY);
        }
    }    
}
