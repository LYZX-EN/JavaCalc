public class stayornot {
    public static void stayornot () {
        System.out.print("Stay : ");

        Variables.stayVar = Variables.scnStay.nextLine();

        if (Variables.stayVar.equals("yes")) {
            Variables.stay = true;
            main.main();
        } else {
            Variables.stay = false;
        }
    }
}