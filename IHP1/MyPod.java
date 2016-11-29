public class MyPod extends MyDevice
{
    private int NumberOfSong;
    private boolean touchScreen;

    public MyPod(int memory, String color, boolean earphoneJack, int price, int NumberOfSong, boolean touchScreen)
    {
        super(memory,color, earphoneJack, price);
        this.NumberOfSong = NumberOfSong;
        this.touchScreen = touchScreen;
    }

    public int getNumberOfSong(){
        return NumberOfSong;
    }

    public void setNumberOfSong(int newNumberOfSong){
        NumberOfSong = newNumberOfSong;
    } 
    public boolean gettouchScreen(){
        return touchScreen;
    }

    public void settouchScreen(boolean newtouchScreen){
        touchScreen = newtouchScreen;
    }
    public String toString(){
        return String.format("%s \n The pod has: %s songs \n The pod has touch screen: %s", super.toString(), NumberOfSong, touchScreen);
    }
}
