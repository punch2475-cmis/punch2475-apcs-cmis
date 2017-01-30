import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leader extends Actor
{
    /**
     * Act - do whatever the Leader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Actor Target;
    public Leader(){

    }

    public Leader (Actor Target){
        this.Target = Target;
    }

    public void act() 
    {
        // Add your action code here.
        move(5);
        if(isAtEdge() == true){
            turn(1);
        }
        if(Greenfoot.getRandomNumber(4) == 0){
            move(1);
            turn(2);

        }
    }

    public void follow(){
        int targetX = Target.getX();
        int targetY = Target.getY();

        turnTowards((targetX - 10) , (targetY -10));
        if(targetX  == getX() && targetY ==getY()){
            move(0);
        }
        else{
            move(2);
        }
    }
}
