import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeB extends Actor
{
    /**
     * Act - do whatever the TypeB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
    }    

    public void move(){
        if(Greenfoot.isKeyDown("Right")){
            turn(-3);
            move(5);
        }
        if(Greenfoot.isKeyDown("Left")){
            turn(-9);
            move(5);
        }
    }

    /*public void up(){
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(),getY() -1 );
        }
     }

    public void down(){
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(),getY()+1);
        }
    }*/
}
