import java.util.Scanner;

/**
 * Created by MattG on 3/20/2017.
 */
public abstract class Creature {
    String name;

    //constructor
    public Creature(String myName)
    {
        name = myName;
    }
    //default constructor
    public Creature()
    {
        name = this.toString();
    }

    public void nameMe()
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Hi, I'm a " + this.getClass() + ". What do you name me?" );

        String n = scnr.nextLine();
        name = n;
    }

}
