import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
     private GreenfootImage img;
    public wall(){
        img = new GreenfootImage(20,200);
        img.setColor(Color.green);
        img.drawRect(0,0,Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(200));
       img.fill();
        /*
         *         img = new GreenfootImage(20, 25);
        img.setColor(Color.green);
        img.drawOval(0,0,20,20);
        img.fillOval(0,0,20,20);
        
        setImage(img);
         */
        setImage(img);
    }
}
