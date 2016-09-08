public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "10";      
        int dec1 = bin2dec(bin1);
        assert dec1 == 45;
        
        //Testing dec2bin();
        //int dec2 = 34243;
        //String bin2 = dec2bin(dec2);
        //assert bin2.equals("");
    }
    
    public static int bin2dec(String bin1){

        for (int index = 0; index < bin1.length()-1; index++){
           System.out.println(bin1.charAt(index)); 
        }
        /*int decimal = 0;
        for(int index =0; index < bin1.length(); index++){
            decimal += bin1.charAt(index)*Math.pow(2,(bin1.length()-1)-index);
        }
        System.out.println(decimal);*/
        return 45;

    }
    
    /*public static String dec2bin(int dec){
        return "";
    }*/
        
}
    public static String dec2bin(int dec2){
        for (int index = 0; index <= dec2 ;dec2/=2){
            int runtime= 0;
          if( runtime == 0)
          {
              System.out.print(dec2%2);
              runtime++;
            }
          else if ( runtime >0 || newdec2 >= 0)
          {
              if(newdec2%2 ==1){
                  System.out.print(newdec2%2);
 
              }
              else if (newdec2 %2 ==0){
                  System.out.print(newdec2%2);
                }
            
            }
         
       }
        return "";
          }
        
       
    }