package vars;

import java.util.Scanner;

public class Variables {
    public static Scanner scn = new Scanner(System.in);
    public static Scanner scnStay = new Scanner(System.in);
    public static boolean stay = true;
    public static String stayVar;
    public static final String ResTxt = "Result : ";

    public static Scanner varscn () {
        return scn;
    }

    public static Scanner varscnStay () {
        return scnStay;
    }

    public static boolean varstay () {
        return stay;
    }

    public static String varstayVar () {
        return stayVar;
    }

    public static String varResTxt () {
        return ResTxt;
    }
}