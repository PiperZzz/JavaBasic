package basic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pzhao
 */
public final class ImmutableClass {
    private final ArrayList myArrayList;

    public ImmutableClass(ArrayList arrayList) {
        this.myArrayList = (ArrayList) arrayList.clone(); //defensive copy
        
        // Collections.unmodifiableList(arrayList); 
        // second way
    }
    
    public ArrayList getImmutableClass () {
        return myArrayList;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //StringBuilder is not synchronized against StringBuffer
        for (Object obj : myArrayList) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString();
    }
}

//Declare the class as final so it can't be extended.
//Make all fields private so that direct access is not allowed.
//Do not provide any methods that can change the state of the immutable object in any way 
//(not just setter methods, but any methods which can change the state)
//Make all mutable fields final so that it's value can be assigned only once, use defensive copy constructor to initialize them


