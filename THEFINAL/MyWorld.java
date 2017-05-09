import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addTarget();
        addJake();
    }
    public void addTarget(){
        addObject(new target(), 550 , Greenfoot.getRandomNumber(400));
    }
    public void addJake(){
        addObject(new Jake(), 50,  Greenfoot.getRandomNumber(400));
    }
    public void addWall(){
        
    }
    public void addEnemy(){
        
    }
}
