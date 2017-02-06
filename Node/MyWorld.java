import greenfoot.*;  
import java.util.ArrayList;

public class MyWorld extends World
{
    private Node node, first,next, last;
    ArrayList<Node> nodes = new ArrayList<Node>();
    public MyWorld()
    {
        super(600, 400, 1); 

        node = new Node(null);
        //;
        first = node;

        addObject(node, 300, 200);
        System.out.println("here");
        for (int j = 1; j < 10; j++){
            node = new Node(node);
            nodes.add(node);
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
            if( Greenfoot.isKeyDown("l")){
                for(int k = 0; k < nodes.size(); k++){
                    first = nodes.get(0);
                    removeObject(nodes.get(0));
                    first = nodes.get(1);
                }
            }
        }
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

}