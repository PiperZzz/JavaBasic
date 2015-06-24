package basic;

/**
 *
 * @author pzhao
 */
public class StringPoolPractice {

    public static void print() {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\"; String str2 = \"abc\"; str1 == str2 is " + (str1 == str2));
        System.out.println("String str1 = \"abc\"; String str2 = \"abc\"; str1.equals(str2) is " + str1.equals(str2));
        
        String str3 = new String ("abc");
        System.out.println("String str1 = \"abc\"; String str3 = new String (\"abc\"); str1 == str3 is " + (str1 == str3));
        System.out.println("String str1 = \"abc\"; String str3 = new String (\"abc\"); str1.equals(str3) is " + str1.equals(str3));
        System.out.println("String str1 = \"abc\"; String str3 = new String (\"abc\"); str1.intern().equals(str3.intern()) is " + str1.intern().equals(str3.intern()));
        System.out.println("String str1 = \"abc\"; String str3 = new String (\"abc\"); str1.intern() == str3.intern() is " + (str1.intern() == str3.intern()));
        
        String str4 = "a" + "bc";
        String str5 = "a" + new String("bc");
        System.out.println("String str4 = \"a\" + \"bc\"; String str5 = \"a\" + new String(\"bc\"); str4 == str5 is " + (str4 == str5));
        System.out.println("String str4 = \"a\" + \"bc\"; String str5 = \"a\" + new String(\"bc\"); str4.equals(str5) is " + str4.equals(str5));
        System.out.println("String str4 = \"a\" + \"bc\"; String str5 = \"a\" + new String(\"bc\"); str4.intern().equals(str5,intern()) is " + str4.intern().equals(str5.intern()));
        System.out.println("String str4 = \"a\" + \"bc\"; String str5 = \"a\" + new String(\"bc\"); str4.intern() == str5,intern() is " + (str4.intern() == str5.intern()));
        
        String str6 = "a";
        String str7 = "bc";
        String str8 = str6 + str7;
        System.out.println("String str1 = \"abc\"; String str6 = \"a\"; String str7 = \"bc\"; String str8 = str6 + str7; str1 == str8 is " + (str1 == str8));
        
        String str9 = str1.substring(1, 2);
        String str10 = str2.substring(1, 2);
        String str11 = str3.substring(1, 2);
        String str12 = "abc".substring(1, 2);
        System.out.println("String str9 = str1.substring(1, 2); String str10 = str2.substring(1, 2); str9 == str10 is " + (str9 == str10));
        System.out.println("String str9 = str1.substring(1, 2); String str11 = str3.substring(1, 2); str9 == str11 is " + (str9 == str11));
        System.out.println("\"abc\".substring(1, 2) == \"abc\".substring(1, 2); is " + ("abc".substring(1, 2) == "abc".substring(1, 2)));
        
        System.out.println("To be continue... ");
    }
}
