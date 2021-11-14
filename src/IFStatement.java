public class IFStatement {

    public static void main(String[] args) {

        int a = 10;

        if (a<10){
            System.out.println("ich bin kleiner");

        }
        else {
            System.out.println("ich bin grösser");
        }

        if (a<10){
            System.out.println("ich bin kleiner");
        }
        else if (a==10){
            System.out.println("ich bin gleich groß");
        }
        else {
            System.out.println("ich bin größer");
        }

        int x = 5;
        int t = 6;

        if (x ==1 && t == 6){
            System.out.println("Und Operation");
            System.out.println("beide Variablen gleich");
        }
        else {
            System.out.println("ungleich");
        }
        if (x==1 || t ==6){
            System.out.println("oder Operation");
            System.out.println("mindestens eine Variable ist ungleich");
        }
    }

}
