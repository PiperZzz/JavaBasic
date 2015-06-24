package basic;

/**
 *
 * @author pzhao
 */
public class ComparablePractice implements Comparable<ComparablePractice> {
    int i;
    
    ComparablePractice (int i) {
        this.i = i;
    }
    
    @Override
    public int compareTo (ComparablePractice cp) {
        if (i < cp.i) {
            return -1;
        } else if (i > cp.i) {
            return 1;
        } else return 0;
    }
}
