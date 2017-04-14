import java.util.Random;

public class Human extends Humans{
    String names[] = {"Sara", "Regina", "Mike", "Antonio", "Sergio", "Bazil", "Clara", "Rada", "Alina", "Chainy"};
    Random random = new Random();

    public Human() {
        setName();
        setAge();
        setGrowth();
    }

    private void setName() {
        name = names[random.nextInt(names.length - 1)];
    }

    private void setAge() {
        int numerator = random.nextInt(1000);
        int denominator = random.nextInt(50);
        if (numerator > denominator && denominator > 10)
            age = numerator / denominator;
        if (age < 10 || age > 120)
            setAge();
    }

    private void setGrowth() {
        while (growth < 150)
            growth = random.nextInt(200);
    }

}
