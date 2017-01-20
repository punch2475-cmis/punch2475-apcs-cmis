import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class E2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E2 extends Actor
{
    /**
     * Act - do whatever the E2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        
        if(Greenfoot.getRandomNumber(2) == 0){

            turn(5);
        }   
        else{
            turn(-5);
        }
    }
    }
