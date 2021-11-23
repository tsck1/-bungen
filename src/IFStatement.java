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

        int count=1;
       // int end =11;

        /*while (count<end){
            System.out.println("bin in der Schleife");
            if(count%2==0){
                System.out.println("ich bin gerade: "+count);
            }
            count++;*/
        while (count<4){
            System.out.println("hier bin ich in der Schleife");
            count++;
            count =count+1;
            count +=1;
        }
        System.out.println("aus der Schleife ausgebrochen");

        for (int i =1;i<11;i++){
            System.out.println("Durchlauf Nr.:"+i);
        }
        for(int i =10; i>0;i--){
            System.out.println("Durchlauf Nr.:"+i);
        }
        for (int k=20;k<=90;k+=5){
            System.out.println("5er-Durchlauf Nr.:"+k);
        }




    }

}
