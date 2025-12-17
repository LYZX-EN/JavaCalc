import java.util.Scanner;

public class main {
    public static void main () {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("1.Num : ");
            int inpNum1 = scn.nextInt();

            scn.nextLine();

            System.out.print("(+, -, *, /) : ");
            String inpOp = scn.nextLine();

            System.out.print("2.Num : ");
            int inpNum2 = scn.nextInt();

            switch (inpOp) {
                case "+":
                    Plus.Plus (inpNum1, inpNum2);
                    break;

                case "-":
                    Minus.Minus (inpNum1, inpNum2);
                    break;

                case "*":
                    Times.Times (inpNum1, inpNum2);
                    break;

                case "/":
                    Divide.Divide (inpNum1, inpNum2);
                    break;
            }
        } while (stay);
    }

    static Scanner scnStay = new Scanner(System.in);
    static boolean stay = true;
    static String stayVar;
    public static final String ResTxt = "Result : ";
}