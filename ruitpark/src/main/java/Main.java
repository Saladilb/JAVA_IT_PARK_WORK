import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Student3 on 22.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Collection<People> people = new ArrayList<People>() ;
        people.add(new People( "Petya" ));
        people.add(new People( "Petya" ));
        people.add(new People( "Lena" ));

        Iterator<People> iterator= people.iterator();

        while (iterator.hasNext()) {
            People item = iterator.next();
            System.out.println(item.getName);
        }
    }
}
