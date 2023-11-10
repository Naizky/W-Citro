package quesito1esame;
import java.util.Scanner;


public class quesito1esame {
    public static double[] inserisci() {
        int n;
        System.out.println("n= ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        double v[] = new double[n];

        for (int i = 0; i < n; i++) {
            v[i] = in.nextDouble();

        }
        return v;
    }

    public static double calcolaMedia(double[] v) {
        double m = 0;
        int contatore = 0;
        for (int i = 0; i < v.length;) {
            if ((v[i] % 2 == 0) && (v[i] > 0)) {
                contatore++;
                m += v[i];

            }

        }
        if (contatore > 0)
            return (m / contatore);
        else {
            System.out.println(" ");
            return(0);
        }
    }

    public static void main(String[] args) {

        double[] v = inserisci();
        double m = calcolaMedia(v);
        System.out.println(m);

    }
}
