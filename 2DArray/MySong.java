public class MySong
{
    public String name;
    public int rating;
    
    public MySong (String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public String getName(){
        return name;
    }
    public int getRating(){
        return rating;
    }
        public String toString()
    {
        String output=new String();
        output="Name: "+name+"\tRating: "+rating;
        return output;
    }
    
}