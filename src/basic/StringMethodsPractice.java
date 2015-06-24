package basic;

/**
 *
 * @author pzhao
 */
public class StringMethodsPractice {

    public static String str = "abcbebfbg";

    public static String removeSubString(String str1, String str2) {
        String str3 = str1.replaceAll(str2, "");
        if (str3.contains(str2)) {
            str3 = removeSubString(str3, str2);
        }
        return str3;
    }

    public static void print() {
        System.out.println(str);
        System.out.println(str.charAt(1));
        for (String str1 : str.split("b", 3)) {
            System.out.print(str1);
        }
        System.out.println();
        for (String str1 : str.split("b", 0)) {
            System.out.print(str1);
            //figure out why output is "acefg1"?
        }
        System.out.println(str.indexOf("b"));
        System.out.println(str.equalsIgnoreCase("Abcbebfbg"));
    }

}
