import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1160 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat d01 = new DecimalFormat ("0.0");
        
        int T = teclado.nextInt();
        int vet[]= new int[T];

        // se for maior que 100 anos mostrar ""

        //int DiferencaPopulacao = PB-PA;
        //float taxacrescimento = G1-G2;

        for (int i = 1; i <= T; i++) {
            int PA = teclado.nextInt();
            int PB = teclado.nextInt();
            float G1 = teclado.nextInt();
            float G2 = teclado.nextInt();
            int tempo = 0;

                while (PA<PB) {
                    PA = PA + (PA*G1);
                    
                
            }
            vet[i] = tempo;
        }

    }
}
