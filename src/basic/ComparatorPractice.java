package basic;

import java.util.Comparator;

/**
 *
 * @author pzhao
 */
public class ComparatorPractice implements Comparator<ComparablePractice> {

    @Override
    public int compare(ComparablePractice cp1, ComparablePractice cp2) {
        if (cp1.i < cp2.i) {
            return 1; //this is reversed. by default, it should retrun -1
        } else if (cp1.i > cp2.i) {
            return -1;
        } else {
            return 0;
        }
    }
}

//The ordering imposed by a Comparator should be consistent with equals() method. 
//which means for example:
//if compare(cp1,cp2) == 0 then cp1.equals(cp2) should be true.
//if compare(cp1,cp2) != 0 then cp1.equals(cp2) should be false.
