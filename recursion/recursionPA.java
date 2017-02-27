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
        else{
            return powA(x, y-1)*x;
        }
    }
    
}
