import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter  extends Actor
{
    private int totalCount = 0;

    public Counter()
    {
        setImage(new GreenfootImage("0", 20, Color.WHITE, Color.BLUE));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void hitCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("" + totalCount, 20, Color.WHITE, Color.BLUE));
    }
}