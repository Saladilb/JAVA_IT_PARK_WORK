/**
 * Created by Student3 on 26.04.2017.
 */
public class MFD implements  Printer{
    private boolean available;
    private int inkLevel ;

    public MFD(boolean available, int inkColor){
        if ( inkColor<0);
        throw new

        this.available = available;
        this.inkColor = inkColor;

    }
    public boolean isAvailable(){
        return available && inkColor>0;

    }
    public void outAvailable (boolean available){
        this.available=available;
    }
    public  void print (String data){
        System.out.println("print ");
    }
}

