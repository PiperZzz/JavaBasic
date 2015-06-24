package roman;

/**
 *
 * @author pzhao
 */
public class RomanNumeralsConvertor {

    public static final RomanNumerals[] ROMANNUM = {new RomanNumerals("M", 1000), new RomanNumerals("CM", 900), 
        new RomanNumerals("D", 500), new RomanNumerals("CD", 400), new RomanNumerals("C", 100), new RomanNumerals("XC", 90), 
        new RomanNumerals("L", 50), new RomanNumerals("XL", 40), new RomanNumerals("X", 10), new RomanNumerals("IX", 9), 
        new RomanNumerals("V", 5), new RomanNumerals("IV", 4), new RomanNumerals("I", 1)};

    public static Integer toInteger(String romanNum) {
        int result = 0;
        String curRomanNum = romanNum;
        for (RomanNumerals romamNum : ROMANNUM) {
            while (curRomanNum.indexOf(romamNum.letter) == 0) {
                result += romamNum.value;
                curRomanNum = curRomanNum.substring(romamNum.letter.length());
            }
        }
        return result;
    }
}
