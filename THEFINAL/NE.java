import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class NE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NE extends energy
{
    /**
     * Act - do whatever the NE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld w = (MyWorld)getWorld();
    public NE(){

    }

    public void act() 
    {
        /*// Add your action code here.
        diamond drop = getClose(200);

        if(drop == null){
        w.addObject(new NE(), Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(400));;
        }
        else{
        Actor JK = (Actor)getWorld().getObjects(Jake.class);
        w.addObject(new NE(), JK.getX() +30, JK.getY()-25);
        }
        }    

        public diamond getClose(int range){
        diamond target = null;
        List<diamond> Diamond = getObjectsInRange(range, diamond.class);
        if( Diamond.size() == 0){
        target = null;
        }
        else if( Diamond.size() >= 1){
        if( Diamond.size() >1){
        target = getClose(range -1);
        }
        else if(Diamond.size() == 1){
        target = Diamond.get(0);
        }

        }
        return target;*/
        /*Jake jake = (Jake)getOneIntersectingObject(Jake.class);

        MyWorld w = (MyWorld)getWorld();

        if(isTouching(Jake.class)){
            //Question();

            w.removeObject(this);

        }*/
    }

    public void appear(){

    }

}
