import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector  extends Actor
{
    /**
     * Act - do whatever the p1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        shot();
    }    

    public Vector(){

        GreenfootImage vector = getImage();

        vector.scale(vector.getWidth()-45, vector.getHeight()-15); 
        vector.rotate(-90); 
    }

    public void move(){
        if(Greenfoot.isKeyDown("Right")){
            move(2);
        }
        if(Greenfoot.isKeyDown("Left")){
            move(-2);
        }
    }

    public void shot(){
        if(Greenfoot.isKeyDown("Space")){
            getWorld().addObject(new arrow(), getX(), getY());
        }
    }
}
