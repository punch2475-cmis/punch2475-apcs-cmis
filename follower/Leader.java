import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leader extends Actor
{
    /**
     * Act - do whatever the Leader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        /*move(5);
        if(isAtEdge() == true){
            turn(4);
        }*/
        if(Greenfoot.getRandomNumber(4) == 0){
            move(5);
            turn(3);
        }
    }    
}
