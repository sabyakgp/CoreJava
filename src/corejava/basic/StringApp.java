package corejava.basic;

/**
 * Created by sabya on 26/1/17.
 */
public class StringApp {
    String location = "Hello";
    public void stringJoin (String greet) {

        System.out.println(String.join(" ", location, greet)); //join strings using join static method
    }

    /**
     * Test String builder class
     * @param stringArray
     * @return String
     */
    public String stringBuilder (String [] stringArray) {

        System.out.println ("Testing String Builder");
        StringBuilder builder = new StringBuilder();

        for (int i=0; i <stringArray.length; i++) {
            builder.append(stringArray[i]);
        }
        return builder.toString();
    }

    /**
     * Testing String comparison
     */

    public boolean strComp (String str1, String str2)  {
        System.out.println ("Testing String comparison");
        System.out.println(str1.substring(0, 5));
        //if (str1.substring(0) == "World") { //will work if World is the only value in the string
        if (str1.substring(0, 5).equals("World")) { //will always work
        //if (str1.substring(0, 5) == "World") { //will not work if str has something other than World and substring is computed
            return true;
        }
        return false;
        /* if (str1.equals(str2)) {
            return true;
        }
        return false;
        */
    }

    /**
     * Convert Number to String
     */
    public String numToStr (int i) {
        return Integer.toString(i);
    }

    public int strToNum (String str) {
        return Integer.parseInt(str);
    }
}
