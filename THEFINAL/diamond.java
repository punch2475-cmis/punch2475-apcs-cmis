import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diamond extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int playerpick;
    private int ai;
      MyWorld w = (MyWorld)getWorld();
    /*private long startTime = System.currentTimeMillis();
    private int durationSec;
    private long currentTime = System.currentTimeMillis();
    private int duarationMilisec;*/
    public void timer(){
        /*long currentTime = System.currentTimeMillis();
        int duraionMilisec = (int)(currentTime - startTime);
        int durationSec = duraionMilisec/1000;
        //System.out.println(durationSec);
      
        
        /*if(durationSec >= 5){
            w.removeObject(this);

            w.addObject(new diamond(), Greenfoot.getRandomNumber(300)+150, Greenfoot.getRandomNumber(150));
            w.addObject(new diamond(), Greenfoot.getRandomNumber(400)+150, Greenfoot.getRandomNumber(250));
            w.addObject(new diamond(), Greenfoot.getRandomNumber(550)+200, Greenfoot.getRandomNumber(375));

            
        }*/
    }

    public void act()  
    {
        Jake jake = (Jake)getOneIntersectingObject(Jake.class);
        
        timer();
        MyWorld w = (MyWorld)getWorld();
        
        if(isTouching(Jake.class)){
            //Question();

            w.removeObject(this);

        }
        
    }    
    //private GreenfootImage img;
    public diamond(){
        /*img = new GreenfootImage(20,200);
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
        //setImage(img);

        GreenfootImage img = getImage();
        img.scale(img.getWidth()/8, img.getHeight()/8);
    }
    public static void main (String[] arg){
        String diamond1 = "eaten";
       
       /* if(w.Diamond() == 0){
            System.out.println(diamond1);
        }*/
    }
}
/*public void Question(){
String [] q = new String [] { "4+5" , "log10", "5+6-3+2+6+9+5-15", "5*6*9"};
int [] a = new int []  {9 , 1, 15 , 270};
int ai = Greenfoot.getRandomNumber(4);
for(int i =0; i < q.length; i++){
if( ai == i){
String input1 = JOptionPane.showInputDialog(q[i]);
int dec = Integer.parseInt(input1);
int ans = a[i];
if(dec == ans){
System.out.println("1pts");

}
}
i = q.length;
}
}*/

