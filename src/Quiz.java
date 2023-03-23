import java.util.ArrayList;
import java.util.Locale;

public class Quiz {

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/

    public static int numberOfVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

    public static int notDivisibleBy235(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
                count = count + 1;
            }
        }
        return count;
    }

    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    public static String camelCaseMe(String string) {
        char char1 = string.charAt(0);
        if (Character.isAlphabetic(char1)) {
            if (Character.isUpperCase(char1)) {
                string = string.substring(0, 1).toUpperCase() + string.substring(1);
            }
            else {
                string = string.substring(0, 1).toLowerCase() + string.substring(1);
            }
        }
        else {
            string = string.substring(1, 2).toUpperCase() + string.substring(2);
        }

        StringBuilder builder = new StringBuilder(string);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_' || builder.charAt(i) == '-') {
                if (i + 1 < builder.length()) {
                    builder.deleteCharAt(i);
                    builder.replace(i, i + 1, String.valueOf(Character.toUpperCase(builder.charAt(i))));
                }
            }
        }
        System.out.print(builder.toString());
        return builder.toString();
    }
}