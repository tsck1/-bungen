public class ZinsDemo {

    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 2.5;

       // double zinsertrag = kontostand/100 *zinsen;

       // System.out.println(zinsertrag);
       // printZinsen(kontostand,zinsen,zinsertrag);

        zinsen =3.5;
        kontostand=4000;
        printZinsen(kontostand,zinsen,berechneZinsen(kontostand,zinsen));


    }

    public static void printZinsen(double kontostand,double zinsen,double zinsertrag){

        System.out.println("Kontostand = "+kontostand+", Zinsen: "+ zinsen+ " , Zinsertrag =" +zinsertrag);

    }

    public static double berechneZinsen(double kontostand,double zinsen){

        double zinsertrag = kontostand*zinsen/100;
      return zinsertrag;
    }
}


