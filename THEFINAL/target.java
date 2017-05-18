import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class target extends Actor
{
    private int c;
    public target(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/27, img.getHeight()/27);
    }
    /*public void GETNUMfromWorld(){
        MyWorld w = (MyWorld)getWorld();
        c = w.getLevel();
        if(isTouching(Jake.class)){
            System.out.println(c);
        }
        
    }*/
    public void act() 
    {
        Jake jake = (Jake)getOneIntersectingObject(Jake.class);
        MyWorld w = (MyWorld)getWorld();
        int k = w.getLevel();
       if(isTouching(Jake.class)){
            
            if(w.getObjects(diamond.class).size() == 0){
              //w.intLevel(k)++; ASK NEXT TIME
            }
 
        }
    
        }
    }

/*
 * WHAT TO DO
 * create array for diamond
 * if touch 1 then ++ 
 * else nth 
 * 
 * EACH LEVEL the enemy speed up 
 * add more
 *  diamonds and enemy
 * 
 */