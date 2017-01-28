package corejava.basic;

/**
 * Created by sabya on 26/1/17.
 */
public class Main {
    public static void main (String arg[]) {
        String location = "Java";
        //String str1 = "World Music";
        String str1 = "World";
        String str2 = "World";
        StringApp strApp = new StringApp();
        String strnull = null;
        if (strnull != null) {
            System.out.println(strnull.length()); //this will cause null pointer exception as null string != empty string
        }
        strApp.stringJoin(location);

        /**
         * Testing String Builder
         */
        String temp = "Peter, John, Sabysachi";
        String[] names = temp.split(","); //to split a string into array
        System.out.println(strApp.stringBuilder(names));

        /**
         * Testing String comparison
         */

        System.out.println(strApp.strComp(str1, str2));

        /**
         * Convert number to string & String to Number
         */

        System.out.println("Convert number to string & String to Number");
        int i = 1;
        System.out.println(strApp.numToStr(i).substring(0, 1)); //it's a string now!

        //String number = "10g"; //This will gibe NumberFormatException
        String number = "10";
        System.out.print(strApp.strToNum(number) + 10); //it's a number now!!

        /**
         * Display code points of a unicode string
         */

        String name = "SAbyasachi";
        int[] codepoints = name.codePoints().toArray();
        for (i=0; i< codepoints.length; i++) {
            System.out.println(codepoints[i]);
        }
    }
}

