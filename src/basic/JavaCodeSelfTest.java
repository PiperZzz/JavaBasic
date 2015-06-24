package basic;

import roman.RomanNumeralsConvertor;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fight_000
 */
public class JavaCodeSelfTest {

    public static void main(String[] args) {

        /* Test "=" vs. ".clone()" */
        System.out.println("\"=\" vs. \".clone()\" method");
        ArrayList<String> myArrayList = new ArrayList<>();
        ArrayList<String> myArrayList2 = new ArrayList<>();
        ArrayList<String> myArrayList3 = new ArrayList<>();

        myArrayList.add("ABC");

        myArrayList2 = (ArrayList) myArrayList.clone();
        myArrayList3 = myArrayList;

        System.out.println("Before myArrayList.set(0, \"AAA\"), myArrayList2.get(0) == myArrayList3.get(0) is " + (myArrayList2.get(0) == myArrayList3.get(0)));

        myArrayList.set(0, "AAA");
        System.out.println("After myArrayList.set(0, \"AAA\"), myArrayList2.get(0) == myArrayList3.get(0) is " + (myArrayList2.get(0) == myArrayList3.get(0)));
        System.out.println("myArrayList2 : " + myArrayList2);
        System.out.println("myArrayList3 : " + myArrayList3);

        System.out.println();
        System.out.println("MySingleton");
        MySingletonLazy mySingleton = MySingletonLazy.getInstance();
        System.out.println(mySingleton.toString());
        MySingletonLazy mySingleton2 = MySingletonLazy.getInstance();
        System.out.println(mySingleton2.toString());

        System.out.println();
        System.out.println("StringPoolPractice:");
        StringPoolPractice.print();

        System.out.println();
        System.out.println("MapTraverse:");
        MapTraverse.print();

        System.out.println("ComparablePractice:");
        ArrayList<ComparablePractice> arrayCP1 = new ArrayList<>();
        arrayCP1.add(new ComparablePractice(2));
        arrayCP1.add(new ComparablePractice(3));
        arrayCP1.add(new ComparablePractice(1));
        ArrayList<ComparablePractice> arrayCP2 = (ArrayList) arrayCP1.clone();
        System.out.print("Original Array: ");
        for (ComparablePractice cp : arrayCP1) {
            System.out.print(cp.i);
        }
        System.out.println();
        System.out.print("Sortted Array by implementing Comparable: ");
        Collections.sort(arrayCP1);
        for (ComparablePractice cp : arrayCP1) {
            System.out.print(cp.i);
        }
        System.out.println();
        System.out.print("Sortted Array by implementing Comparator (Reversed Order): ");
        Collections.sort(arrayCP2, new ComparatorPractice());
        for (ComparablePractice cp : arrayCP2) {
            System.out.print(cp.i);
        }

        System.out.println();
        System.out.println("SwitchPractice: ");
        System.out.println("SwitchPractice int: " + SwitchPractice.print(2));
        System.out.println("SwitchPractice enum: " + SwitchPractice.print(SwitchPractice.Day.TUESDAY));
        System.out.println("SwitchPractice String: " + SwitchPractice.print("Tuesday"));
//        System.out.println("SwitchPractice invalid input: " + SwitchPractice.print("something wrong"));

        System.out.println();
        System.out.println("StringMethodsPractice");
        String str1 = "Helllloo world!";
        String str2 = "llo";
        System.out.println(StringMethodsPractice.removeSubString(str1, str2));
        StringMethodsPractice.print();
        
        System.out.println(RomanNumeralsConvertor.toInteger("CMXCXIV"));

    }
}
