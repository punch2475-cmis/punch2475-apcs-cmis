import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
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
    public GreenfootImage getImg(){
        return img;
    }
    public int getCountDown(){
        return countDown;
    }
    public void setImg( GreenfootImage newImg){
        img = newImg;
    }
    public void setCountDown( int newCountDown){
        countDown = newCountDown;
    }
    public enemy getEnergy(int range){
        enemy target = null;
        int Range = 50;
        //List<enemy> enemies = getObjectsInRange(200, energy.class);
    }
    
    }

