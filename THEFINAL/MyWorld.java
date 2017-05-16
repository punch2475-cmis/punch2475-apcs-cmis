import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class MyWorld extends World
{
   private int level = 1;
   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addTarget();
        addJake();
        addEnemy();
        addWall();
    }

    public void addTarget(){
        addObject(new target(), 550 , Greenfoot.getRandomNumber(400));
    }

    public void addJake(){
        addObject(new Jake(), 50,  Greenfoot.getRandomNumber(400));
    }

    public void addWall(){
        addObject(new wall(), Greenfoot.getRandomNumber(300)+150, Greenfoot.getRandomNumber(150));
        addObject(new wall(), Greenfoot.getRandomNumber(400)+150, Greenfoot.getRandomNumber(250));
        addObject(new wall(), Greenfoot.getRandomNumber(550)+200, Greenfoot.getRandomNumber(375));
    }

    public void addEnemy(){
        addObject(new EA(),300,200);
        addObject(new EB(),300,100);
    }

    public void dd(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();
    }
    
    public void ilv(int level){
        //List< Actor> actors = getObject(null);
        
    }
}
