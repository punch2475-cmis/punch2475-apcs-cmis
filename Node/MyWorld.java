import greenfoot.*;  
import java.util.ArrayList;

public class MyWorld extends World
{
    private Node node, first,next, last;
    /*Actor[] Arr;
     Arr = new int [node]; */
    public MyWorld()
    {
        super(600, 400, 1); 

        node = new Node(null);
        first = node;
        //next become first when first get remove
        //use arraylist to find the second one
        addObject(node, 300, 200);
        System.out.println("here");
        for (int j = 1; j < 10; j++){
            node = new Node(node);
            addObject(node, 300, 200);
            last = node;           
        }
        
    }

    public void act(){
        String key = Greenfoot.getKey();
        if (key != null){
            if ( key.equals("n")){
                addNode();
            }

            if ( key.equals("r")){
                removeNode();
            }
        }
        nextNode();
    }

    public int[] getNewLocation(){
        int[] location;
        if(getObjects(null).contains(first)){
            location = new int[]{first.getX(), first.getY()};
        }else{
            location = new int[]{Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight())};
        }
        return location;
    }

    public void addNode(){
        node = new Node(last);
        if(first == null){
            first = node;
        }
        int[] loc = getNewLocation();
        last = node;
        addObject(node, loc[0], loc[1]);
    }
    
    public void removeNode(){
        if ( last != null ){
            removeObject(last);
            last = last.getTarget();
            //next = next.getTarget();
            first = last == null ? null : first;
        }
    }
    public void nextNode(){
        for(int k = 0; k < 10; k++){
            if( k == 2 && Greenfoot.isKeyDown("l")){

                removeObject(first);
                next = first;
            }
        }
    }
}