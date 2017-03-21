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
       freshness--;
        if( freshness < 500 )
        {
            img.setColor(Color.green);
            img.fill();
            setImage(img);
            if( freshness < 230 )
            {
                img.setColor(new Color(0x00, 0xC0, 0x00));
                img.fill();
                setImage(img);
                if( freshness < 125 )
                {
                    img.setColor(Color.black);
                    img.fill();
                    setImage(img);
                }
            }
        } 
        if( isRotten() )
        {
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
        }
    }//number4

    public boolean isRotten(){
        return freshness < 0;
    }

}

