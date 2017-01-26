import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Leader leader = new Leader();
        addObject(leader,211,251);
        Leader leader1 = new Leader();
        addObject(leader1,211,281);
        Leader leader2 = new Leader();
        addObject(leader2,211,311);
        Leader leader3 = new Leader();
        addObject(leader3,211,341);
        Leader leader4 = new Leader();
        addObject(leader4,211,371);
        //Leader leader5 = new Leader();
        //addObject(leader5,211,401);
        //Leader leader6 = new Leader();
        //addObject(leader6,211,431);
        
    }
}
