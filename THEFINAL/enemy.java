import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public abstract class enemy extends Actor implements move
{
    public abstract void movement();
    public abstract void touching();
    public GreenfootImage img;
    public int countDown;
    public enemy(){
        img = new GreenfootImage(20, 25);
        img.setColor(Color.green);
        img.drawOval(0,0,20,20);
        img.fillOval(0,0,20,20);
        
        setImage(img);
    }
    public enemy( GreenfootImage img, int countDown){
        countDown = 500 + Greenfoot.getRandomNumber(500);
    }


    }

