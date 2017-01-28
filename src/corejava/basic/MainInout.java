package corejava.basic;

/**
 * Created by sabya on 28/1/17.
 */
public class MainInout {
    public static void main (String arg[]) {

        /**
         * Take Lines from Standard Input stream and display on standard output stream
         */
        InOut In = new InOut();
        //System.out.println("What is your Name?");
        //System.out.println(In.takeLine());
        //System.out.println("Enter your first, last name");
        //In.takeWords();
        In.takeInput();
        In.showRecord();

    }
}
