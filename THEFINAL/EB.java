import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class EB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EB extends enemy
{
    /**
     * Act - do whatever the EB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int randomMove;
    public void act() 
    {
        // Add your action code here.
        movement();
    }   
    public EB(){
        super();
        img.setColor(Color.red);
        img.fillOval(0,0,20,20);
        
        setImage(img);
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
              int rn = Greenfoot.getRandomNumber(4);
              if(rn > 2){
                  System.out.println("Still Alive");
                }
                else {
                    System.out.println("Died");
                    
                }
              
            }
        }
}
