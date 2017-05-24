import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class EA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EC extends enemy
{
    /**
     * Act - do whatever the EA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int randomMove;
    public EC(){
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

        MyWorld w = (MyWorld)getWorld();
        if( w.level > 3 && w.level < 5){
            if ( randomMove == 0 ){
                Y = -5; // down
            } else if ( randomMove == 1 ){
                Y = 5; // up 
            } else if ( randomMove == 2 ){
                X = -5; // left
            } else if ( randomMove == 3 ){
                X = 5; // right
            }
            setLocation(getX() + X, getY() + Y);
        }

        if( isAtEdge() == true){
            if( getX() < 10){
                setLocation(600 ,getY());
            }
            else if(getY() < 10){
                setLocation(getX() , 400);
            }
            //setLocation(600,100);
            else if (getX() > 590){
                setLocation(10, getY());
            }
            else {
                setLocation(getX(), 10);
            }
            //turn(5);
            //move(5);
        }
    }

    public void touching(){
        if(isTouching(Jake.class)){
            System.out.println("TRY AGAIN");
        }
    }

    public void speeding(){

    }


}