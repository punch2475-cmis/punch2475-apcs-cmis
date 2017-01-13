public abstract class TV
{
    private boolean tvON;
    public TV(){
        this.tvON = false;
    }

    public boolean getTVOn(){
        return tvON;
    }

    public void setTVOn(boolean newTVOn){
        tvON = newTVOn;
       }

    public abstract String tvType();
}
