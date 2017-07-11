package chapter1;

import java.util.Random;

/**
 * Created by Jonas on 11/07/2017.
 */
public class Zoo {

    //  main() makes Zoo executable for the JVM
    //  public -> needs to be accessed from outside
    //  static -> can not create an object of main, because it is called from jvm
    public static void main(String[] args) {
        //By default, args is empty
        if (args.length > 0) {
            System.out.println(args.length + " args found:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  " + i + " - " + args[i]);
            }
        } else {
            System.out.println("no args found");
        }

        System.out.println("it works");
        Random r = new Random();
        System.out.println("IMPORT TEST : " + r.nextInt(20));
        System.out.println("IMPORT TEST : " + r.nextInt(20));
        System.out.println("IMPORT TEST : " + r.nextInt(20));

        Chick chick = new Chick();
    }

    {
        System.out.println("outside");
    }
}

