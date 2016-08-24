public class FundamentalsP6
{ public static void main (String [] arg)
    {
        int [] array = new int[50];
        int x = array.length; 
        for( int index = 0; index < x; index++)
        {
            array[index] = (int)(Math.random()*100);
            
        }
        for (int index = 0; index < x; index++)
        {
            System.out.println(array[index]);
        }
    }
}

