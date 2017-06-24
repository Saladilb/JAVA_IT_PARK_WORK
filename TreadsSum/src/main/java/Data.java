
abstract public class Data {
    private static int arr[];
    private static int result;

    public static void setArr(int count) {
        Data.arr = new int[count];
    }

    public synchronized static void setResult(int result) {
        Data.result = result;
    }

    public synchronized static int[] getArr() {return arr;}

    public synchronized static int getResult() {return result;}
}
