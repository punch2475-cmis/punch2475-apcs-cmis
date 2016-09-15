import javax.swing.JOptionPane;
public class Bigproblem1
{
    public static void main(String []arg)
    {
        String input = JOptionPane.showInputDialog( "Type a number: " );
        int b = Integer.parseInt(input);
        int [] randomnumbers = new int [b];
        int sum = 0;
        int big =0; 
        int small =0;
        int total = 0;
        int [] num = new int [100];
        int index =0;
        int frequency =0;
        int count =0;
        for (int i = 0; i < num.length; i++)
        {
            num[total]++;
            System.out.print(i + ": ");
            int hashes = num[i];
            while (hashes > 0)
            {
                System.out.print ("#");
                hashes --;
            }
            
        }//it work 
        for (int i =0; i < num.length; i++)
        {
            System.out.print(i + ": ");
            int hashes = num[i];
            while (hashes > 0)
            {
                System.out.print ("#");
                hashes --;
            }
        }
        for (index =0; index< randomnumbers.length; index++)
        {
            randomnumbers[index] =(int) ( Math.random()*100);
            System.out.println( randomnumbers[index]);
            sum += randomnumbers[index];
            int newran = randomnumbers[index];
            if (index ==1)
            {
                small = randomnumbers[index];
            }
            else{
                if (small > newran){
                    small= randomnumbers[index];
                }
            }
            if (index ==1 )
            {
                big = randomnumbers[index];
            }
            else{
                if (big < newran)
                {
                    big = randomnumbers[index];
                }
            }
        }
        double avg = (double) sum/b;
        System.out.println("Sum =" + sum);
        System.out.println("Avg =" +avg);
        System.out.println("Smallest num = " + small);
        System.out.println("Biggest num = " + big);
        System.out.println("MODE =" );
        
        //sum += randomnumbers 
        
            
        }
    }
    

/*
 * //ask user to type number
 * //random number 0-99 
 * //print 1-99
 * print histogram
 * //print minimum 
 * //print max
 * //print sum
 * print mode
 * //print avg
*/