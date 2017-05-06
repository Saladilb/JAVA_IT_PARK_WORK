/**
 * Created by Student3 on 03.05.2017.
 */
public class Box<T> {
    private T value ;

    public boolean hasValue() {
        return value != null ;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
