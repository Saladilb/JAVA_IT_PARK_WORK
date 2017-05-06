import java.lang.reflect.Method;

/**
 * Created by Student3 on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Class<Sample> clazz = Sample.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }


    }
}
