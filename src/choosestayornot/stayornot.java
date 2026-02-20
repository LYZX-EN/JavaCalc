package choosestayornot;

import vars.Variables;
import MAINFILE.main;

public class stayornot {
    public static void stayornot () {
        System.out.print("Stay : ");

        Variables.stayVar = Variables.scnStay.nextLine();

        if (Variables.stayVar.charAt(0) == 'y') {
            Variables.stay = true;
            main.main();
        } else {
            Variables.stay = false;
        }
    }
}