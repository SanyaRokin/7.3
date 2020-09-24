import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
   private Random random;
   private IntegerIterator integerIterator;

    public Randoms(int min, int max) {
        this.random = new Random();
        integerIterator = new IntegerIterator(random, min, max);
    }

    public Iterator<Integer> iterator() {
        return this.integerIterator;
    }



}
