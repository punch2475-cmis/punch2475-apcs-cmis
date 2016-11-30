
/**
 * Write a description of class APP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class APP
{
    public static void main (String [] args){
        System.out.println("TVs in the store");
        Television t = new Television("HD Bronze" , 59.99);
        Television a = new Television("DLP Silver" , 99.99);
        Television b = new Television("LCD Gold" , 199.99);
        Television c = new Television("LED Platium" , 399.99);
        Television d = new Television("Plasma Sapphire" , 499.99);
        System.out.println(t);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
