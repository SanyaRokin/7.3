import java.util.Iterator;
import java.util.Random;

public class IntegerIterator implements Iterator<Integer> {
    private Random random;
    private int min;
    private int max;

    public IntegerIterator(Random random, int min, int max) {
        this.random = random;
        this.min = min;
        this.max = max;
    }


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min +1) + min;
    }
}
