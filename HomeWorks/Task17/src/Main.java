import java.util.Random;


public class Main {
    private Humans humans [];

    private void start() {
        createArrayWithHumans();
        sortArrayOfPeople();  //by bubble
        output();
    }

    private void createArrayWithHumans() {
        getRandomLenghtArrayHumans();
        humans = new Humans[getRandomLenghtArrayHumans()];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = (Humans) new Human();
        }
    }

    private void sortArrayOfPeople() {
        for (int i = humans.length - 1; i > 0; i --) {
            for (int j = 0; j < i; j ++) {
                if (humans[i].getAge() < humans[j].getAge()) {
                    Human human = (Human) humans[j];
                    humans[j] = humans[i];
                    humans[i] = human;
                }
            }
        }
    }

    private int getRandomLenghtArrayHumans() {
        Random random = new Random();
        int lenght = random.nextInt(10);
        if (lenght < 3)
            lenght = getRandomLenghtArrayHumans();
        return lenght;
    }

    private void output() {
        for (int i = 0; i < humans.length; i ++) {
            System.out.println(humans[i]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
