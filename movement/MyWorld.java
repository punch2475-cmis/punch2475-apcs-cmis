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
        TypeB typeb = new TypeB();
        addObject(typeb,350,248);
        TypeA typea = new TypeA();
        addObject(typea,415,260);
        E2 e2 = new E2();
        addObject(e2,567,345);
        E1 e1 = new E1();
        addObject(e1,456,123);
    }
}
