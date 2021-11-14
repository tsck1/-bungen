public class ZinsDemo {

    public static void main(String[] args) {
        double kontostand = 9000;
        double zinsen = 2;
        double berechneteZinsen =0;

        double erhalteneZinsen = kontostand*zinsen/100;
        System.out.println("Zinsen =" +zinsen+ " % " + kontostand +" = " +erhalteneZinsen);

        kontostand = 5000;
        zinsen = 4;
        erhalteneZinsen = kontostand*zinsen/100;
        //berechneZinsen = 0;

        System.out.println(erhalteneZinsen);


        printZinsen(kontostand, zinsen, erhalteneZinsen);
        System.out.println(berechneZinsen(kontostand,zinsen,erhalteneZinsen));

    }
    public static double berechneZinsen(double kontostand, double zinsen, double erhalteneZinsen){
        zinsen =2.5;
       erhalteneZinsen = kontostand * zinsen/100;
        return erhalteneZinsen;

       // return kontostand * zinsen / 100;
    }
    public static void printZinsen(double kontostand, double zinsen, double erhalteneZinsen) {
        System.out.println("Zinsen = " + zinsen + " %von " + kontostand + " = " + erhalteneZinsen);
    }
}
