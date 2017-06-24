
public class OneThread extends Thread {
    private int min, max;
    private int result;

    public OneThread(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void run() {
        for (int i = min; i < max; i++) {
            result += Data.getArr()[i];
            System.out.println(currentThread().getName());
        }
        Data.setResult(Data.getResult() + result);
    }
}
