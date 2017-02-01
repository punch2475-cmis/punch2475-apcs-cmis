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
            run();
            edge();
            //follow();
        }
        else if (leader == false){
            follow();
        }

    }

    public void run(){
        if(Greenfoot.getRandomNumber(4) == 0){
            turn(5);
        }
        else if (Greenfoot.getRandomNumber(4) == 1){
            turn(-5);
        }

        else if   (Greenfoot.getRandomNumber(4) == 0){
            move(10);
        }
        else{
            move(-5);
        }
    }

    public void edge(){
        if (isAtEdge() == true){
            move(-4);
        }
    }

    public void follow(){
        int targetX = Target.getX();
        int targetY = Target.getY();

        /*turnTowards((targetX-5) , (targetY-5));
        move(1);

        /*if(targetX  == getX() && targetY ==getY()){
        //move(0);
        }
        else{
        move(2);
        }*/
        turnTowards(targetX ,targetY);
        if(Target.getX() > getX() -30  ){
            /*turnTowards(targetX ,targetY);
            move(1);*/
            move(0);
        }
        /*else if (Target.getX() < getX() -20){
             turnTowards(targetX ,targetY);
            move(1);
        }
        /*else if (getX() == Target.getX()){
            setLocation( targetX -10 , targetY);
            
        }*/
        else{
            turnTowards(targetX ,targetY);
            move(1);
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
/*if (getX() < 10){
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
}*/
