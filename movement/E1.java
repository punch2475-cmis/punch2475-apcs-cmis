import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class E1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E1 extends Actor
{
    /**
     * Act - do whatever the E1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
    }  

    public void move(){
        int r = Greenfoot.getRandomNumber(4);
        if(r == 0){
            setLocation(getX(),getY() -10 );
            move(1);
        }
        else if (r == 1){
            setLocation(getX()-10,getY());
            move(1);
        }
        else if (r == 2){
            setLocation(getX(),getY() +10 );
            move(1);        
        }
        else{
            setLocation(getX()+10,getY());
            move(1);
        }
    }
}

