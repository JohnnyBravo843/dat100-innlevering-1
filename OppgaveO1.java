import java.util.Scanner;
import static java.lang.Math.*;

public class OppgaveO1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn bruttolønn: ");
        double income = in.nextDouble();
        double skatt = 0;

        if (income > 226100){
            skatt += 0.017 * (min(income,318300)-226100);
        }
        if (income > 318300){
            skatt += 0.04 * (min(income,725050)-318300);
        }
        if (income > 725050){
            skatt += 0.137*(min(income,980100)-725051);
        }
        if (income > 980100){
            skatt += 0.168*(min(income,1467200)-980101);
        }
        if (income > 1467201){
            skatt += 0.178*(income-1467201);
        }

        System.out.println("skatt som må betales: " + skatt);

        in.close();
    }
}
