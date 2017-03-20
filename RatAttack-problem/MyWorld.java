import greenfoot.*; 
import java.util.*;
public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private int level = 1;
    private int score = 0;
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
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
        if(startTime -15 == runningTime){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
        }
    }
    
    public void act(){
        runningTime = System.currentTimeMillis() - startTime;// count down time

        if(getObjects(Rat.class).size() == 0){
            init(level++);// when rats == 0 the level will go up by 1 (if in level 2 if i rats die level will go to level 3)
        }
        showText(score+"  "+(int)(15 -(runningTime/1000.0)), 50, 50);// show score

    }
    

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);// add cheese 
    }



    public void score(){
        score++;// score goes up 
    }

    public void lose(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();// when the exterminator go near the rats the game will stop
    }
}
