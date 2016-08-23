public class FundamentalsP6
{ public static void main (String [] arg)
    {
        int [] randomNumber = new int[100];
        for( int index = 0; index < randomNumber.length; index++)
        {
            randomNumber[index] = (int)(Math.random()*100);
            
        }
        for (int index = 0; index < randomNumber.length; index++)
        {
            System.out.println(randomNumber[index] + ",");
            index++;
        }
    }
}

