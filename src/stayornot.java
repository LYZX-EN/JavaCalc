public class stayornot {
    public static void stayornot () {
        System.out.print("Stay : ");

        main.stayVar = main.scnStay.nextLine();

        if (main.stayVar.equals("yes")) {
            main.stay = true;
            main.main();
        } else {
            main.stay = false;
        }
    }
}