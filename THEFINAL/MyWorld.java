import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class MyWorld extends World
{
    private int level = 1;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        intLevel(level);
    }

    public void intLevel(int level){
        List<Actor> actors = getObjects(null);
        for(Actor a: actors){
            removeObject(a);
        }
        for(int i = 0; i < level; i++){
            addObject(new Jake(), 50,  Greenfoot.getRandomNumber(400));
        }
        addTarget();
        addEnemy();
        adddiamond();

    }

    public void act(){
        showText( "Level" + " " + level ,50,50);
        if(getObjects(Jake.class).size() == 0){
            dd();
        }
        /*if(isTouching(diamond.class)){

            if(getObjects(diamond.class).size() == 3){
                intLevel(level++);
            }
        }*/
    }

    public void addTarget(){
        addObject(new target(), 550 , Greenfoot.getRandomNumber(400));
    }

    public void adddiamond(){
        addObject(new diamond(), Greenfoot.getRandomNumber(300)+150, Greenfoot.getRandomNumber(150));
        addObject(new diamond(), Greenfoot.getRandomNumber(400)+150, Greenfoot.getRandomNumber(250));
        addObject(new diamond(), Greenfoot.getRandomNumber(550)+200, Greenfoot.getRandomNumber(375));
    }

    public void addEnemy(){
        addObject(new EA(),300,200);
        addObject(new EB(),300,100);
    }

    public void dd(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();
    }

    
}
