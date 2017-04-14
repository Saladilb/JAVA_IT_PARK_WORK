import java.util.Random;

public class SuperHero {
    private Random random = new Random();
    String name;
    int numberOfEnemies;

    SuperHero (String name) {
        setName(name);
        setNumberOfEnemies();
    }

    private void setNumberOfEnemies() {
        numberOfEnemies = random.nextInt(500);
    }

    public void setName(String name) {
        this.name = name;
    }

}
