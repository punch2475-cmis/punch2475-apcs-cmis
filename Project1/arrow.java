import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class arrow extends Actor
{
    /*public arrow( Vector vector){
    this.vector = vector;
    }*/
    private GreenfootImage img,cir ,alt;
    public arrow() 
    {
        // Add your action code here.
        img = new GreenfootImage(5,70);
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
                getWorld().removeObject(this);
            }
        }
        else{
            getWorld().removeObject(this);
        }
    }

    public void hitBalloon(){
        MyWorld sky = (MyWorld) getWorld();
        Counter counter = sky.getCounter();
        counter.hitCount(5);
    }

}
