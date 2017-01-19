import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TypeA extends Actor
{
    /**
     * Act - do whatever the T1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        turn();
    }

    public void move(){
        if(Greenfoot.isKeyDown("a")){
            move(1);
        }
        if(Greenfoot.isKeyDown("b")){
            move(-1);
        }
    }

    public void turn(){
        if(Greenfoot.isKeyDown("l")){
            ;
        }
    }
}
