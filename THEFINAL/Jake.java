import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jake extends Actor
{
    /**
     * Act - do whatever the Jake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("Up")){
            move(2);
        }
        if(Greenfoot.isKeyDown("Right")){
            turn(-2);
        }
        if(Greenfoot.isKeyDown("Left")){
            turn(2);
        }
        if(Greenfoot.isKeyDown("Down")){
            move(-2);
        } 
    }   

    public Jake(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/4, img.getHeight()/4);
    }
    
    public void die(){
        if(isTouching(enemy.class)){
            MyWorld w = (MyWorld)getWorld();
            
        }
    }
}
