import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Thing extends Actor
{
    private GreenfootImage newImg, img,alt;
    
    public Thing(){
        img = new GreenfootImage(50,250);
        img.setColor(Color.red);
        img.fill();
        alt = new GreenfootImage(img);
        img.setColor(Color.cyan);
        //img.fillRect(12,12,25,25);
        //img.fillRect(25, 0, 1, 50);
        //img.fillRect( 0,25,50,1 );
        int r = Greenfoot.getRandomNumber(255);
        int g = Greenfoot.getRandomNumber(255);
        int b = Greenfoot.getRandomNumber(255);
        Color myColor = new Color(r,g,b);
        //img.setColor(myColor);
        //ccnnnimg.fillOval(12,12,25,25);
        
        //alt.setColor(Color.yellow);
        //alt.drawRect(10,10, 29,29);
        
        newImg = new GreenfootImage(200,360);
        newImg.setColor(Color.blue);
        newImg.fill();
        
        
        setImage(img);
    }

    public void act() 
    {
        changeImage();
    }    
    
    public void changeImage(){
        String key = Greenfoot.getKey();
        int r = Greenfoot.getRandomNumber(255);
        int g = Greenfoot.getRandomNumber(255);
        int b = Greenfoot.getRandomNumber(255);
        if(key != null){
            if( key.equals("c")){
                setImage(getImage() == img ? alt : img);
            }
            if (key.equals("n")){
                Color newColor = new Color(r,g,b);
                img.setColor(newColor);
                img.fillRect(10,15,40,40);
            }
            if(key.equals("d")){
                img.drawOval(25,36,45,60);
                Color newColorOval = new Color(r,g,b,r);
                img.setColor(newColorOval);
                img.fillOval(25,36,45,60);
            }
            if(key.equals("e")){
                img.drawLine(10,45,89,78);
                
            }
        }
    }
}