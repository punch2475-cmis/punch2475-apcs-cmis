import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
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
                    System.out.println("Game Over \n Please restart the game");
                }
                getWorld().removeObject(bb);
            }
            if(Superbb != null){
                hitSuperbomb();
                superBombHitCount++;
                if(superBombHitCount ==2){
                    Greenfoot.stop();
                    int a = Greenfoot.getRandomNumber(100);
                    int b = Greenfoot.getRandomNumber(100);
                    int c = a +b;
                    String input1 = JOptionPane.showInputDialog( a  + "+" + b );
                }
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
    public void hitSuperbomb(){
        MyWorld sky = (MyWorld) getWorld();
        Counter counter = sky.getCounter();
        counter.hitCount(-50);

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