package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author pzhao
 */
public class MapTraverse {

    static public Map<Integer, String> myHashMap = new HashMap<>();

    static public void print () {
        myHashMap.put(1, "A");
        myHashMap.put(2, "B");
        myHashMap.put(3, "C");        
        myHashMap.put(null, "D");
        myHashMap.put(null, "F");
        
        //For-Each KeySet Traverse
        System.out.println("For-Each KeySet Traverse");
        for (Integer i : myHashMap.keySet()) {
            System.out.println("Key: " + i + " Value: " + myHashMap.get(i));
        }
        System.out.println();
       
        //For-Each EntrySet Traverse
        System.out.println("For-Each EntrySet Traverse");
        for (Map.Entry<Integer, String> entry : myHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println();
        
        //Iterator KeySet Traverse
        System.out.println("Iterator KeySet Traverse");
        Iterator<Integer> itSet = myHashMap.keySet().iterator();
        while(itSet.hasNext()) {
            Integer key = itSet.next();
            System.out.println("Key: " + key + " Value: " + myHashMap.get(key));
        }
        System.out.println();
        
        //Iterator EntrySet Traverse
        System.out.println("Iterator EntrySet Traverse");
        Iterator<Map.Entry<Integer, String>> itEntry = myHashMap.entrySet().iterator();
        while(itEntry.hasNext()) {
            Map.Entry<Integer, String> entry = itEntry.next();
            System.out.println("Key: " + entry.getKey() + " value " + entry.getValue());
        }
        System.out.println();
    }
}
