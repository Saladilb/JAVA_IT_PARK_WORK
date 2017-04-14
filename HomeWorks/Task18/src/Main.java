import java.util.Random;

public class Main {
    private Humans humans [];
    private int [] ages;
    private final int maxRandomNumberGeneratedPeople = 100;
    private final int minRandomNumberGeneratedPeople = 15;

    private void start() {
        createArrayWithHumans();
        sortArrayOfPeople();  //by bubble
        recordOfNumberOfAges();
        outHumans();
        outAgesOfHumans();
    }

    private void createArrayWithHumans() {
        getRandomLenghtArrayHumans();
        humans = new Humans[getRandomLenghtArrayHumans()];
        for (int i = 0; i < humans.length; i++)
            humans[i] = (Humans) new Human();
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
        int lenght = random.nextInt(maxRandomNumberGeneratedPeople);
        if (lenght < minRandomNumberGeneratedPeople)
            lenght = getRandomLenghtArrayHumans();
        return lenght;
    }

    private void recordOfNumberOfAges() {
        int maxAge = getMaxAgeInArrayHumans();
        ages = new int [maxAge + 1];
        for (int i = 0; i <= maxAge; i ++) {
            int counterThisAge = 0;
            for (int j = 0; j < humans.length; j ++)
                if (humans[j].age == i)
                    counterThisAge += 1;
            ages[i] = counterThisAge;
        }
    }

    private int getMaxAgeInArrayHumans() {
        int max = humans[0].age;
        for (int i = 1; i < humans.length; i ++) {
            if (max < humans[i].age)
                max = humans[i].age;
        }
        return max;
    }

    private void outHumans() {
        for (int i = 0; i < humans.length; i ++)
            System.out.println(humans[i]);
    }

    private void outAgesOfHumans() {
        for (int i = 0; i < ages.length; i ++) {
            if (ages[i] != 0)
                System.out.println("В возрасте " + i + " всего " + ages[i] + " человек");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
