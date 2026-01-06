package operators;

import choosestayornot.stayornot;
import vars.Variables;

public class Minus {
    public static void Minus (int a, int b) {
        System.out.println(Variables.ResTxt + (a - b));
        stayornot.stayornot();
    }
}