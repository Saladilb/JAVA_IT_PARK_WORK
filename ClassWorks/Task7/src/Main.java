
public class Main {
        private SuperHero arrayHeroes [];
    private void run () {
        addHero();
    }

    private void addHero() {
        SuperHero batman = new Humans("batman");
        SuperHero daredevil = new Humans("daredevil");
        SuperHero womancat = new Humans("womancat");

        SuperHero superman = new Mutants("superman");
        SuperHero flash = new Mutants("flash");
        SuperHero rosom = new Mutants("rosom");

        arrayHeroes = new SuperHero[]{batman, daredevil, womancat, superman, flash, rosom};
        SortHeroes sort = new SortHeroes();
        sort.sortingByNumberOfEnemies(arrayHeroes);

        for (int i = 0; i < arrayHeroes.length; i ++) {
            System.out.println(arrayHeroes[i].numberOfEnemies);
        }
    }


    public static void main (String [] arg) {
        Main main = new Main();
        main.run();
    }
}
