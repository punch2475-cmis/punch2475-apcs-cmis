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
        up();
        down();
    }

    public void move(){
        if(Greenfoot.isKeyDown("Right")){
            move(1);
        }
        if(Greenfoot.isKeyDown("Left")){
            move(-1);
        }
    }

    public void up(){
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(),getY() -1 );
        }
    }
    public void down(){
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(),getY()+1);
        }
    }
}
