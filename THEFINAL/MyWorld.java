import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class MyWorld extends World
{
    public int level = 1;

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
            if(getObjects(Jake.class).size() == 0){
                addObject(new Jake(), 50,  200);
            }
        }

        addTarget();
        addEnemy();
        adddiamond();

    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int newlevel){
        level = newlevel;
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
        /* if(getObjects(diamond.class).size() == 0 && getObjects(target.class).size() == 0){
        intLevel(level++);
        }*/

    }
    public void addTarget(){
        addObject(new target(), 550 , Greenfoot.getRandomNumber(400));
        //addObject(new target(),200,200);
    }

    public void adddiamond(){
        addObject(new diamond(), Greenfoot.getRandomNumber(300)+150, Greenfoot.getRandomNumber(150));
        addObject(new diamond(), Greenfoot.getRandomNumber(400)+150, Greenfoot.getRandomNumber(250));
        addObject(new diamond(), Greenfoot.getRandomNumber(550)+200, Greenfoot.getRandomNumber(375));
        /*addObject(new diamond(), 150,200);
        addObject(new diamond(), 200,200);
        addObject(new diamond(), 250,200);*/
        for(int i =0; i < level; i++){
            if(level > 2){
                addObject(new diamond(), Greenfoot.getRandomNumber(400)+150, Greenfoot.getRandomNumber(250));
            }
        }
    }

    public void addEnemy(){
        addObject(new EA(),300,200);
        addObject(new EB(),300,100);
        addObject(new EC(), 300, 150);
    }

    public void dd(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();
    }

    public void stillAlive(){
        /*if(Jake.eatEnergy() == 1){
            
        }*/
    
    }
}
