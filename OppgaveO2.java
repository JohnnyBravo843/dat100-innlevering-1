import java.util.Scanner;

public class OppgaveO2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<10;i++) {
            System.out.print("Skriv poengkarakteren din: ");
            int karakter = in.nextInt();


            if (karakter > 100 || karakter < 0) {
                System.out.println("Ugyldig verdi, prøv på nytt");
                i--;
            } else if (karakter >= 90) {
                System.out.println("A");
            } else if (karakter >= 80) {
                System.out.println("B");
            } else if (karakter >= 60) {
                System.out.println("C");
            } else if (karakter >= 50) {
                System.out.println("D");
            } else if (karakter >= 40) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }


        }
        in.close();
    }
}
