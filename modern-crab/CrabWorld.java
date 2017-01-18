import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,259,288);
        Crab crab2 = new Crab();
        addObject(crab2,287,204);
        lobster lobster = new lobster();
        addObject(lobster,235,406);
        lobster lobster2 = new lobster();
        addObject(lobster2,377,226);
        lobster lobster3 = new lobster();
        addObject(lobster3,216,123);
        lobster lobster4 = new lobster();
        addObject(lobster4,53,225);
        lobster lobster5 = new lobster();
        addObject(lobster5,101,388);
        lobster lobster6 = new lobster();
        addObject(lobster6,369,393);
        Worm worm = new Worm();
        addObject(worm,447,317);
        Worm worm2 = new Worm();
        addObject(worm2,189,317);
        Worm worm3 = new Worm();
        addObject(worm3,201,227);
        Worm worm4 = new Worm();
        addObject(worm4,370,252);
        Worm worm5 = new Worm();
        addObject(worm5,393,321);
        Worm worm6 = new Worm();
        addObject(worm6,325,346);
    }
}
