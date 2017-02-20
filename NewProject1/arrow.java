import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class arrow extends Actor
{
    /*public arrow( Vector vector){
    this.vector = vector;
    }*/
    private GreenfootImage img;
    //private Vector newVector;

    /*public arrow(Vector newVector)
    {
        this.newVector = newVector;
    }*/

    public arrow() 
    {
        // Add your action code here.
        img = new GreenfootImage(70,20);
        img.setColor(Color.red);
        img.fill();

        setImage(img);
    }

    public void act(){
        int PositionY = getY();
        int PositionX = getX();
        if (PositionY > 0){
            setLocation(PositionX,PositionY);
            Actor hit = getOneIntersectingObject(balloon.class);
            if (hit != null){
                hitBalloon();
                getWorld().removeObject(hit);
            }
        }
        else{
            getWorld().removeObject(this);
        }
        move();
        //shot();
    }

    public void hitBalloon(){
        MyWorld sky = (MyWorld) getWorld();
        Counter counter = sky.getCounter();
        counter.hitCount(5);
    }

   
    public void move(){
        if(Greenfoot.isKeyDown("Right")){
            move(2);
        }
        if(Greenfoot.isKeyDown("Left")){
            move(-2);
        }
    }
    /*public void shot(){
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new arrow(),getX(), getY());

        }
    }*/
}