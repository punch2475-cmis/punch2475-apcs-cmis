import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        moveAround();
        eat();
    }    

    public void moveAround(){
        move(5);
        if(Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth()-5){
            turn(180);
        }
        if(getY() <= 5 || getY() >= getWorld().getWidth()-5){
            turn(180);
        }
    }

    public void eat(){
        Actor crab;
        Actor worm;
        crab = getOneObjectAtOffset(0,0,Crab.class);
        worm = getOneObjectAtOffset(0,0,Worm.class);
        if(crab != null){
            World world;
            world = getWorld();
            world.removeObject(crab);
            //Greenfoot.playSound("eating.mov");
        }
         if(worm != null){
            World world;
            world = getWorld();
            world.removeObject(crab);
            //Greenfoot.playSound("eating.mov");
        }
    }// Add your action code here.

}
