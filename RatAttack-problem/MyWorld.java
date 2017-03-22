import greenfoot.*; 
import java.util.*;
public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private long ConTime;
    private int level = 1;
    private int score = 0;
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
        addCheeseBomb();
        addRat();
    }

    public void init(int level){
        List<Actor> actors = getObjects(null);// Array List of rats
        for(Actor a: actors){
            removeObject(a);// remove rats 
        }
        for(int i=0; i<level; i++){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));// add new rats into the world
        }
        addObject(new Exterminator(), 520, 200);// 1 exterminator in the world
        addObject(new Trap(), 550, 200);// 1 trap in the world
        startTime = System.currentTimeMillis();// timer 
       
    }
    
    public void act(){
        runningTime = System.currentTimeMillis() - startTime;// count down time
        ConTime = System.currentTimeMillis() - startTime;
        if(getObjects(Rat.class).size() == 0){
            init(level++);// when rats == 0 the level will go up by 1 (if in level 2 if i rats die level will go to level 3)
        }
        showText(score+"  "+(int)(15 -(runningTime/1000.0)), 50, 50);// show score
        
    }
    
    public void addRat(){
         if(ConTime -15 == runningTime){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
        }//number 1
    }

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);// add cheese 
    }

    public void addCheeseBomb(){
        int timer = 1000;
        if(timer > 0){
            timer--;
            int randomCheese = Greenfoot.getRandomNumber(4);
            if(randomCheese == 1){
                addObject(new CheeseBomb(),0 + Greenfoot.getRandomNumber(200), 0 - Greenfoot.getRandomNumber(100));
                
            }
            else if(randomCheese == 2){
                addObject(new CheeseBomb(),600 - Greenfoot.getRandomNumber(200), 0 -Greenfoot.getRandomNumber(100));
                
            }
            else if(randomCheese == 3){
                addObject(new CheeseBomb(),0 + Greenfoot.getRandomNumber(200), 400 - Greenfoot.getRandomNumber(100));
               
            }
            else if(randomCheese == 4){
                addObject(new CheeseBomb(),600 - Greenfoot.getRandomNumber(200), 400 - Greenfoot.getRandomNumber(100));
                
            }

        }//number3
    }

    public void score(){
        score++;// score goes up 
    }

    public void lose(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();// when the exterminator go near the rats the game will stop
    }
}
