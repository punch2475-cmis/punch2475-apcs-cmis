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
        //addObject(new Vector(),300,330);
        addObject(new base(),300,330);
        theCounter = new Counter();
        addObject( theCounter,100,350);
        
        
    }
    public Counter getCounter(){
        return theCounter;
    }
    public void act(){
        if(Greenfoot.getRandomNumber(1000 ) < 5){
            addObject(new balloon(),Greenfoot.getRandomNumber(400), 20 );
        }
        if(Greenfoot.getRandomNumber(1000) < 1){
            addObject(new bomb(),Greenfoot.getRandomNumber(400), 20 );
        }
    }
    
}
