package operators;

import choosestayornot.stayornot;
import vars.Variables;

public class Plus {
    public static void Plus (int a, int b) {
        System.out.println(Variables.ResTxt + (a + b));
        stayornot.stayornot();
    }
}