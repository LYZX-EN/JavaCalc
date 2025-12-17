public class ChooseOp {
    public static void ChooseOp () {
        do {
            System.out.print("1.Num : ");
            int inpNum1 = main.scn.nextInt();

            main.scn.nextLine();

            System.out.print("(+, -, *, /) : ");
            String inpOp = main.scn.nextLine();

            System.out.print("2.Num : ");
            int inpNum2 = main.scn.nextInt();

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
        } while (main.stay);
    }
}
