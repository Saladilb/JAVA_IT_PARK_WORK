/**
 * Created by Student3 on 26.04.2017.
 */
public class VirtualPrinter implements Printer {
    public void setAvailable(boolean available) {
        this.available = available;
    }

    private boolean available;

    @Override
    public boolean inAvailable() {
        return false;
    }

    @Override
    public void print(String data) {
        System.out.println("Print data to PDF file");

    }
}
