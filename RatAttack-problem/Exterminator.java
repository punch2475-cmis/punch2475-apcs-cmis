import greenfoot.*;
import java.util.*;
public class Exterminator extends Actor
{
    private int cheeseCount;
    private int delay;
    private boolean haveTrap;
    public Exterminator(){
        haveTrap = true; // check if there is trap
        cheeseCount = 5; // you can use up to 5 cheese
        delay = 0;
        getImage().mirrorVertically(); // set the image vertically
        turn(180);
    }

    public void act() 
    {
        die();
        if(Greenfoot.isKeyDown("Up")){
            move(1);
        }
        if(Greenfoot.isKeyDown("Right")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("Left")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("j") && delay-- <= 0){
            dropCheese();
            delay = 25;
        } 
    }    

    public void dropCheese(){
        if(cheeseCount > 0){// if the exterminator dodnt use 5 cheese yet, he can drop more cheese
            MyWorld w = (MyWorld)getWorld();
            w.addCheese(getX(), getY());
            cheeseCount--;
        }
    }

    public void die(){
        if(isTouching(Rat.class)){
            MyWorld w = (MyWorld)getWorld();
            w.lose();// if the exterminator go near the rats, the game will be over
        }
    }
    
}
