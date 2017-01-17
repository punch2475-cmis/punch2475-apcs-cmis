import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }    
    public void moveAndTurn(){
        move(5);

        if(Greenfoot.isKeyDown("Left")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("Right")){
            turn(3);
        }
    }

    public void eat(){
        Actor worm;
        Actor lobster; 
        lobster =getOneObjectAtOffset(0,0,lobster.class);
        worm = getOneObjectAtOffset(0,0,Worm.class);
        if(worm != null){
            World world;
            world = getWorld();
            world.removeObject(worm);
            //Greenfoot.playSound("eating.mov");
        }
        if(lobster != null){
            World world;
            world = getWorld();
            world.removeObject(lobster);
            //Greenfoot.playSound("eating.mov");
        }
    }
}
