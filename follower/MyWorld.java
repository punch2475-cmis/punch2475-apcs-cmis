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
        addObject(leader,224,201);
        Leader leader2 = new Leader(leader);
        addObject(leader2,231,241);
        Leader leader3 = new Leader(leader2);
        addObject(leader3,241,241);
        Leader leader4 = new Leader(leader3);
        addObject(leader4,251,261);
        Leader leader5 = new Leader(leader4);
        addObject(leader5,251,271);
        Leader leader6 = new Leader(leader5);
        addObject(leader6,261,291);
        Leader leader7 = new Leader(leader6);
        addObject(leader7,271,301);
        Leader leader8 = new Leader(leader7);
        addObject(leader7,271,301);
        addObject(leader7,271,301);addObject(leader7,271,301);addObject(leader7,271,301);addObject(leader7,271,301);
        addObject(leader7,271,301);addObject(leader7,271,301);
    }
}
