package corejava.basic;

import java.util.Scanner;

/**
 * Created by sabya on 28/1/17.
 */
public class InOut {
    Scanner In = new Scanner(System.in);
    int[] age = new int[100];
    String[] fname = new String[100];
    String[] lname = new String[100];
    Double[] sal = new Double[100];
    //Take lines
    public String takeLine () {
        String name = In.nextLine();
        return "You entered: " + name;
    }

    //Take words
    public void takeWords () {
         System.out.print("Enter your first name: ");
         String firstname = In.next();
         System.out.print("Enter your last name: ");
         String lastname = In.next();
         System.out.print("Enter your Age: ");
         int i = In.nextInt();
         System.out.print("Your first name: ");
         System.out.println(firstname);
         System.out.print("You Last Name: ");
         System.out.println(lastname);
         System.out.print("You Age: ");
         System.out.println(i);

        //System.out.print("How old are you? ");
    }

    /**
     * Scan through a line and parse the words into different variables
     */
    public void takeInput() {
        char iteration = 'Y';
        int subscript = 0;
        do {
            System.out.print("Enter your details: ");
            fname[subscript] = In.next();
            lname[subscript] = In.next();
            age[subscript] = In.nextInt();
            sal[subscript] = In.nextDouble();
            System.out.print("Want to enter another record?: ");
            iteration = In.next().charAt(0); //This will extarct the first byte of the string
            subscript = subscript +1;
        } while (iteration == 'Y');
    }

    public void showRecord() {
        int i =0;
        while (fname[i] != null) {
            System.out.printf("First name: %s", fname[i]);
            //System.out.println(fname[i]);
            System.out.printf(" Last Name: %s", lname[i]); //Use formatted string instead
            //System.out.println(lname[i]);
            System.out.printf(" Age: %d", age[i]);
            //System.out.println(age[i]);
            System.out.printf(" Salary: %,8.2f", sal[i]); //Use formatted string instead - 8 digit scale and 2 digit precision
            //System.out.println(sal[i]);
            i++;
        }
    }
}
