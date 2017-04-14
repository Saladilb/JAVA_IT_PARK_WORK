
abstract class Humans {
    String name;
    int age;
    int growth;

    public int getAge() {
        return age;
    }

    public String toString() {
        return ("Человек: имя = " + name + ",  рост = " + growth + ", возраст = " + age);
    }
}
