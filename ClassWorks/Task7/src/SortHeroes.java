
public class SortHeroes {

    private SuperHero temp;

    public void sortingByNumberOfEnemies(SuperHero[] a) {
        for(int i = a.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(a[j].numberOfEnemies > a[j + 1].numberOfEnemies) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
