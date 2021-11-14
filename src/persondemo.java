public class persondemo {
    public static void main(String[] args) {

        person pers = new person();
        pers.gender = 'm';
        pers.age = 24;
        pers.firstname = "Christoph";
        pers.lastname = "Pontasch";

        person pers2 = new person();
        pers2.gender = 'w';
        pers2.age = 17;
        pers2.firstname = "Karin";
        pers2.lastname = "Pontasch";

       printPerson(pers2);
        pers.personenausgabe();

       pers2.personenausgabe();


    }
public static void printPerson(person p){

    System.out.println(p.firstname + " " + p.lastname +" " + p.age+ " Jahre" );
}

}
