public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "101101";
        int dec1 = bin2dec(binary);
        assert dec1 == 45;
        
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("1000010110111010");
    }
    
    public static int bin2dec(String bin1){
        for (int index = 0; index < binary.length(); index++){
            binary[index] = intbin1;
        }
        int decimal = 0;
        for(int index =0; index < binary.length(); index++){
            decimal += binary[index]*Math.pow(2,(bin.length-1)-index);
        }
        System.out.println(decimal);

    }
    
    public static String dec2bin(int dec){
        return "";
    }
        
}
