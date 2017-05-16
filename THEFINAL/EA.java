import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class EA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EA extends enemy
{
    /**
     * Act - do whatever the EA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int randomMove;
    public EA(){
        GreenfootImage imgEA = getImg();
        int countDown1 = getCountDown();
    }
   
    public void act() 
    {
        // Add your action code here.
        movement();
        }

    public void movement(){
        if(Math.random() > 0.95){
            randomMove = Greenfoot.getRandomNumber(4);
        }
        int X = 0;
        int Y = 0;
        if ( randomMove == 0 ){
            Y = -1; // down
        } else if ( randomMove == 1 ){
            Y = 1; // up 
        } else if ( randomMove == 2 ){
            X = -1; // left
        } else if ( randomMove == 3 ){
            X = 1; // right
        }
             setLocation(getX() + X, getY() + Y);
        }
        public void touching(){
            if(isTouching(Jake.class)){
                System.out.println("TRY AGAIN");
            }
        }
    }

