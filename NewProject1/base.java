import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

public class base extends Actor
{
    /*public arrow( Vector vector){
    this.vector = vector;
    }*/
    private GreenfootImage img;
    int bombHitCount;
    int superBombHitCount;
    //private Vector newVector;

    /*public arrow(Vector newVector)
    {
    this.newVector = newVector;
    }*/

    public base() 
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
            Actor bb = getOneIntersectingObject(bomb.class);
            Actor Superbb = getOneIntersectingObject(Superbomb.class);
            if (hit != null){
                hitBalloon();
                getWorld().removeObject(hit);
            }
            if (bb != null){
                hitbomb();
                bombHitCount++;
                if(bombHitCount == 5){
                    Greenfoot.stop();
                    //showText("Game Over!!", 300, 200);
                    System.out.println("GAME OVER");
                }
                getWorld().removeObject(bb);
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

    public void hitbomb(){
        MyWorld sky = (MyWorld) getWorld();
        Counter counter = sky.getCounter();
        counter.hitCount(-5);

    }
    /*public void hitSuperbomb(){
        MyWorld sky = (MyWorld) getWorld();
        Counter counter = sky.getCounter();
        counter.hitCount(-50);

    }*/
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
    /*     if(Superbb != null){
                hitSuperbomb();
                superBombHitCount++;
                if(superBombHitCount ==2){
                    /*Greenfoot.stop();
                    int a = Greenfoot.getRandomNumber(100);
                    int b = Greenfoot.getRandomNumber(100);
                    int c = a +b;
                    int input1 = Integer.parseInt(JOptionPane.showInputDialog( a  + "+" + b ));
                    if( input1 == c){
                        superBombHitCount = 0;
                    }*/
                    
                        //System.out.println("GAME OVER");
                   
                
            }
