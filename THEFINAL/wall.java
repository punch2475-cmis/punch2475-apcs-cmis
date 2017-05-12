import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int playerpick;
    private int ai;
    public void act()  
    {
                Jake jake = (Jake)getOneIntersectingObject(Jake.class);
        
        if(isTouching(Jake.class)){
             playerpick = Integer.parseInt(JOptionPane.showInputDialog(" random num 1-4"));
             Question();
        }
    }    
     private GreenfootImage img;
    public wall(){
        img = new GreenfootImage(20,200);
        img.setColor(Color.green);
        img.drawRect(0,0,Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(200));
       img.fill();
        /*
         *         img = new GreenfootImage(20, 25);
        img.setColor(Color.green);
        img.drawOval(0,0,20,20);
        img.fillOval(0,0,20,20);
        
        setImage(img);
         */
        setImage(img);
    }
    public void Question(){
        String [] q = new String [] { "4+5" , "log10", "5+6-3+2+6+9+5-15", "5*6*9"};
        String [] a = new String []  {"9" , "1", "15" , "270"};
        int ai = Greenfoot.getRandomNumber(4);
        for(int i =0; i < q.length; i++){
            if( ai == playerpick){
                  String input1 = JOptionPane.showInputDialog(q[i]);
                  if(input1 == a[i]){
                      System.out.println("1pts");
                    }
            }
        }
        
    }
}
