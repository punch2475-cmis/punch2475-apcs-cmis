public class PhoneApp{
    public static void main(String [] arg)
    {
        Phone p1 = new Phone("Samsung",52,1.8);
        //System.out.println(p1);
        //System.out.println(p1.brand);
        //System.out.println(p1.storage);
        //System.out.println(p1.camera);
        
        Phone p2 = new Phone(9);
        System.out.println(p2);
        //System.out.println(p2.brand);
        //System.out.println(p2.storage);
        //System.out.println(p2.camera);
        //System.out.println(p2.getStorageleft());
        System.out.println(p2.getTries());
        System.out.println(p2.equals(p2));
    }//end main
}// end class
