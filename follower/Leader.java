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
    boolean leader;
    public Leader(){
        leader = true;
    }

    public Leader (Actor Target){
        this.Target = Target;
        leader = false;
    }

    public void act() 
    {
        // Add your action code here.
        //move(5);
        
        if(leader == true ){
            //move(1);
            //turn(-45);
            move(2);
            if (isAtEdge() == true){
                if (getX() < 10){
                    setLocation(getX(),getY() -1 );
                }
                else if(getY() < 10){
                    move(2);
                }
                else if (getX() > 590){
                setLocation(getX(),getY()+1);
            }
            else {
                move(-2);
            }
            }
        }
        else if (leader == false){
            follow();
        }
        
        
    }

    public void follow(){
        int targetX = Target.getX();
        int targetY = Target.getY();

        turnTowards((targetX-10 ) , (targetY ));
        if(targetX  == getX() && targetY ==getY()){
            move(0);
        }
        else{
            move(2);
        }
    }
}
/*else if(leader == true&&Greenfoot.getRandomNumber(4) == 1){
            move(-1);
        }
        else if(leader == true && Greenfoot.getRandomNumber(4) == 2){
            setLocation(getX(),getY() -1 );
        }
        else if(leader == true && isAtEdge() == true){
            setLocation(getX(),getY()-100);
            move(-1);
        }
        /*if(Greenfoot.getRandomNumber(4) == 3){
        //turn(25);
        }*/
