import Figures.CreatingShapes;

/**
 * Created by Student3 on 08.04.2017.
 */
public class Main {

    private void start() {
        CreatingShapes creatintShapes = new CreatingShapes();
        creatintShapes.run(50);  //указать количество рандомных фигур в инт
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

}
