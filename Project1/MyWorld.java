import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter theCounter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Vector(),300,330);
        theCounter = new Counter();
        addObject(new Counter(),100,350);
        //addObject(new arrow(),295,280);
        
    }
    public Counter getCounter(){
        return theCounter;
    }
    public void act(){
        if(Greenfoot.getRandomNumber(1000 ) < 2){
            addObject(new balloon(),0, 20 );
        }
    }
}
