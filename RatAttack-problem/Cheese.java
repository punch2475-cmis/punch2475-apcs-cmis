import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Cheese extends Actor
{
    private int freshness;
    private GreenfootImage img;
    public Cheese(){
        img = new GreenfootImage(20, 20);
        img.setColor(Color.yellow);
        img.fill();
        freshness = 500 + Greenfoot.getRandomNumber(500);
        setImage(img);
    }

    public void act(){
        int Nfreshness = freshness;
        int randomRot = Greenfoot.getRandomNumber(4);
        if (randomRot > 2){
            Nfreshness = freshness/2;
            img.setColor(Color.green);
            img.fill();
            randomRot = Greenfoot.getRandomNumber(4); 
            if( randomRot < 2){
                Nfreshness = freshness/3;
                img.setColor(new Color(0x00, 0xC0, 0x00));
                img.fill();
                randomRot = Greenfoot.getRandomNumber(4); 
                if(randomRot > 3){
                    Nfreshness = (int)(freshness/0.23);
                    img.setColor(Color.black);
                    img.fill();
                    Nfreshness =0;
                    if(Nfreshness == 0){
                        MyWorld w = (MyWorld)getWorld();
                        w.removeObject(this);
                    }
                }
            }

        }
    }

    public boolean isRotten(){
        return freshness < 0;
    }

}
