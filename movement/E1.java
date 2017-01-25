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
    Actor Target;
    public E1(Actor Target){
        this.Target = Target;
    }
    public void act() 
    {
        // Add your action code here.
        move();
        follow();
    }  

    public void move(){
        /*int r = Greenfoot.getRandomNumber(4);
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
        }*/
    }
        public void follow(){
        int targetX = Target.getX();
        int targetY = Target.getY();
        
        turnTowards(targetX  , targetY);
        move(1);
    }
}

