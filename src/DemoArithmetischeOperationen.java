public class DemoArithmetischeOperationen {

    public static void main(String[] args) {
        int number = 34;
        double pi = 3.1415;
        int perfectNumber = 49;

        int erg;
        erg=number+perfectNumber;
        System.out.println("erg:"+erg);

        erg = erg*8;
        System.out.println("erg:"+erg);

        erg = 27%10;
        System.out.println(erg);

        printInteger(129);

        printInvoiceAmount(2.4);

        String Tom1= new String("Thomas");
        String Tom2= new String("Thomas");

       // boolean sameName = Tom1 == Tom2;
       // System.out.println("same Object? " +sameName);
        boolean sameName = Tom1.equals(Tom2);
        System.out.println("same Object? " +sameName);

        boolean iAmBig= false;
        if(iAmBig){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        String tag ="Samstag";
        String zeit= "Nacht";

        //if((tag.equals("Sonntag")||tag.equals("Samstag"))&& zeit.equals("Nacht")){
        //    System.out.println("Wochenendtarif"); // Sonntag  und Abend oder Samstag und Abend = Wochendtarif
       // }

        if(tag.equals("Sonntag")||tag.equals("Sonntag")&& zeit.equals("Nacht")){
            System.out.println("Wochenendtarif"); // Sonntag  und Abend oder Samstag und Abend = Wochendtarif
        }



    }
    // Methode => Unterprogramm, Prozedur, Function, "sub"
    // public static => ist fix, wenn wir direkt in der main-Anwendung programmieren
    // Rückgabewert => nichts => void, spezieller Datentyp (int, double, ...)
    // Namen => Naming Convention => camelCase
    // Parameterliste => Die Variablen, welche die Methode (ich)
    //      benötigt, um die Aufgabe zu erfüllen
    public static void printInteger(int number) {
        System.out.println("printInteger: " + number);
        printInvoiceAmount(number);
        System.out.println("printInteger ist nun fertig!");
    }

    public static void printInvoiceAmount(double amount){
        System.out.println("Nettowert: -----" + amount + " EUR");
        double tax = calculateSalesTax(amount);
        System.out.println("Mwst:  -----" + tax + " EUR");
        System.out.println("Gesamtbetrag:  -----" + (amount + tax) + " EUR");
    }

    // retourniert einen Double
    // alle Methoden mit Rückgabewert, benötigen ein return
    public static double calculateSalesTax(double amount) {
        double tax;
        tax = amount / 100 * 20;
        return tax;
    }

    // wichtig für die Eindeutigkeit einer Methode => name + parameter
    public static double calculateSalesTax(double amount, int tax) {
        double erg = amount / 100 * tax;
        return erg;
    }

    public static double calculateSalesTax2(double amount, int tax) {
        return amount / 100 * tax; // return + berechnung in einer Zeile
    }

    // calculateSalesTax, calculateSalesTax2, calculateSalesTax3 machen das Gleiche!
    public static double calculateSalesTax3(double amount, int tax) { return amount / 100 * tax;  }



}