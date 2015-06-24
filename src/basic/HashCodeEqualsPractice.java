package basic;

/**
 *
 * @author pzhao
 */
public class HashCodeEqualsPractice {

    String str1;
    String str2;

    public HashCodeEqualsPractice(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public int hashCode() {
        return str1.hashCode() + str1.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HashCodeEqualsPractice)) {
            return false;
        } else {
            HashCodeEqualsPractice hashCEP = (HashCodeEqualsPractice) obj;
            return this.equals(hashCEP);
        }
    }
}

//If a class overrides the equals() method, it must implement the hashCode() method as well.
//if you have two objects that are equal then they must have the same hashCode,
//however the reverse is not true 
//if two objects have the samehashCode does not mean that they are equal. 
//So, If a field is not used in equals(), then it must not be used in hashCode() method.
