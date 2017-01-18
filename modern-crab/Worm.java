import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
    }    
    public void eat(){
        Actor crab;
        Actor lobster; 
        lobster =getOneObjectAtOffset(0,0,lobster.class);
        crab = getOneObjectAtOffset(0,0,Crab.class);
        if(crab != null){
            World world;
            world = getWorld();
            world.removeObject(crab);
            //Greenfoot.playSound("eating.mov");
        }
        if(lobster != null){
            World world;
            world = getWorld();
            world.removeObject(lobster);
            //Greenfoot.playSound("eating.mov");
        }
    }
}
