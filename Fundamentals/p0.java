public class p0
{
    public static void main(String[] args){
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("");
    }

    public static String dec2bin(int dec2){
        for (int index = 0; index <= dec2 ;dec2/=2)
        {
            if( dec2 > 0)
            {
                System.out.print(dec2%2);
            }

        
        }
        return "";
    }
}
/*
 * if runtime = 0, then 
 * if ((int)dec2 %2 == 0)
{
int newdec= dec2/2;
System.out.println(dec2%2);
}
else if(dec2 %2 ==1)
{
int newdec = dec2/2;
System.out.println(dec2%2);
}
 * 
 * 
 * if runtime = 1, then
 * 
 * 
 */
/*if ((int)dec2 %2 == 0)
{
int newdec= dec2/2;
System.out.println(dec2%2);
}
else if(dec2 %2 ==1)
{
int newdec = dec2/2;
System.out.println(dec2%2);
}
int newdec = dec2/2;*/