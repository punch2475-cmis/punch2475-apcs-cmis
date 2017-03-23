import greenfoot.*;
import java.util.*;
public class Rat extends Actor
{
    private int direction;
    private int eaten;
    private int TrapRat =0;
    public Rat(){
        direction = Greenfoot.getRandomNumber(4);// randomly move
        getImage().scale(50,25);// image scale
        eaten = 0;// eat 0 cheese
    }

    public void act() 
    {
        eat();
        Cheese closest = getTargetCheese(200);// check for cheese within range of 200
        if(closest == null){
            wander();// if there is no cheese, the rat will move randomly
        } else{
            moveTowardCheese(closest);// the rats move towards the closet cheese 
        }
        die(); // if the rats touch the trap
    }   

    public void wander(){// randomly move depend on the random numbers
        if(Math.random() > 0.95){// math.random = 0.0-1.0
            direction = Greenfoot.getRandomNumber(4);
        }
        int dx = 0;
        int dy = 0;
        if ( direction == 0 ){
            dy = -1; // down
        } else if ( direction == 1 ){
            dy = 1; // up 
        } else if ( direction == 2 ){
            dx = -1; // left
        } else if ( direction == 3 ){
            dx = 1; // right
        }

        setLocation(getX() + dx, getY() + dy);// the direction will be change
    }

    public void moveTowardCheese(Cheese cheese){
        int dx = 0;
        int dy = 0;
        int cheeseX = cheese.getX();
        int cheeseY = cheese.getY();
        int x = getX();
        int y = getY();
        
        if ( x < cheeseX ){ // if the cheese is  to right move to the location
            dx = 1;
        }else if ( x > cheeseX){ // if cheese is to the left, move left
            dx = -1;
        }
        
        if ( y < cheeseY ){// if cheese is down, move to cheese
            dy = 1;
        }else if ( y > cheeseY ){// if cheese is up, move up
            dy = -1;
        }
        setLocation(x + dx, y + dy);// move
    }
    
    public Cheese getTargetCheese(int range){// find cheese to eat
        Cheese target = null;// no target
        int Range = 200;
        List<Cheese> cheeses = getObjectsInRange(range, Cheese.class);// if cheese within 200 range add to the arraylist
        if (cheeses.size() == 0){
            target = null;
            // no cheese = no target = null
        }else if( cheeses.size() >= 1 ){
            
           if(cheeses.size() > 1){
               target =  getTargetCheese(200);
            }
            else if( cheeses.size() == 1 ){
                target =cheeses.get(0);
            }
            
            //target = cheeses.get(0);
            // there is cheese go eat the first one that in the array
        } //number 5 it works sometime 2 pts
        return target; 
    }
    
    public void eat(){
        Cheese cheese = (Cheese)getOneIntersectingObject(Cheese.class);
        if( cheese != null){
            World w = getWorld();
            w.removeObject(cheese);
            eaten++; // if the rats eat cheese, remove cheese and #of eaten go up
        }
        if (eaten == 3){
            World w = getWorld();
            w.addObject(new Rat() ,getX() , getY());
            eaten = 0;
        }//number2 it works 2pts
    }
    

    public void die(){
        if(isTouching(Trap.class)){
            
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
            //TrapRat++;
            w.score(); // if the rats didn't eat but go to the trap = die
            
            //System.out.println(TrapRat);
        }
       /*if(TrapRat == 3){
            World w = getWorld();
            Actor ET = (Actor)getWorld().getObjects(Exterminator.class);
            int ETX = ET.getX();
            int ETY = ET.getY();
            w.addObject(new ExtraGuy() , ETX,ETY);
            TrapRat =0;
        }//number6*/ // it doesn't work 2pts 
    }
}
