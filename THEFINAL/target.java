import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class target extends Actor
{
    public target(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/27, img.getHeight()/27);
    }

    public void act() 
    {
        Jake jake = (Jake)getOneIntersectingObject(Jake.class);

        if(isTouching(Jake.class)){
           /* if(isTouching(wall.class)){

                if(getObjects(wall.class).size() == 3){
                    intLevel(level++);
                }
            }

        }    */
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