import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class muffin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class muffin extends Actor
{
    /**
     * Act - do whatever the muffin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
    } 

    public void move(){
        if(Greenfoot.getRandomNumber(2) == 0){
            turn(5);
        }  
        else if (isAtEdge() == true){
            setLocation(getX()+1,getY()-2);
        }
        else{
            turn(-5);
            move(5);
        }
        if( isAtEdge() == true){
            setLocation(600,0);
            turn(5);
            move(5);
        }
        /*if(getX() == 0){
            setLocation(600,getY());
        }*/
    }
}
