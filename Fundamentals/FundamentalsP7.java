public class FundamentalsP7
{ public static void main (String [] arg)
    {
        int [] array = new int[10];
        int positive =0;
        int negative =0;
        for(int index=0; index< array.length; index++)
        {
            int random = 0;
            random =(int)(Math.random() * 100);
                if (random % 2 ==0)
                { 
                    array[index] = (int)(-1* Math.random()*100);
                    negative++;
                }
                else
                { 
                    array[index]= (int)(Math.random()*100);
                    positive++;
                }//end for loop
        }
        int index = 0;
        while (index < array.length)
        {
            System.out.println( array [index]);
            index++;
        }
        System.out.println("The number of positive integers is;" + positive);
    }
}

