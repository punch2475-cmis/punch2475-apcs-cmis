public class recursionPA
{
    public static void main (String [] arg){
        System.out.println(powA(4,5));
    }
    
   public static int powA(int x, int y)
    {
        if(y ==0){
            return 1;
        }
        else if(y == 1){
            return x;
        }
        else{

            return x+=x;
        }
    }
    
}
