
public class Problem1{
    public static void main (String [] arg)
    {
       int [] array = new int [1000000];

       for (int index = 0; index < 1; index++){
        array [index] = (int)(array.length*Math.random());
       if (index % 3 == 0 && index %5 == 0 && index%7 == 0 && index%11==0)
       {
           System.out.println(array[index]);
        }
       
        else
        {
            System.out.println("...");
        }
        
    }
}
}

