import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon extends Actor
{
    /**
     * Act - do whatever the balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int positionX =getX();
        int positionY= getY()+1;
       if(isAtEdge() == true){
            getWorld().removeObject(this);
        }
        else{
            setLocation(positionX, positionY);
        }
        /*if(Greenfoot.getRandomNumber(1000) > 2){
            positionX = ;
            positionY = Greenfoot.getRandomNumber(400);
            if(positionX > 0 && positionY > 120){
                setLocation(positionX, positionY);
            }
        }*/
        //positionX >= getWorld().getWidth() || positionY >= getWorld().getWidth()
    }    
}
