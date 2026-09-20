import java.util.Scanner;
public class OppgaveO3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv et heltall: ");
        int n = in.nextInt();
        int out = 1;
        if (n <=0){
            System.out.println("Ugyldig verdi");

        }else{
            for (int i = 2; i<=n;i++){
                out *= i;
            }
            System.out.println(out);
        }

        in.close();
    }
}
