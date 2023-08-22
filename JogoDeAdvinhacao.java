import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Scanner informacao = new Scanner(System.in);
        Random numbers = new Random();
        int numeroParaAdvinhar = numbers.nextInt(100);
        int tentativas = 0;

        while (tentativas != 10) {
            System.out.println("Tente advinhar um número de 0 a 100.");
            int numeroComparativo = informacao.nextInt();

            if (numeroParaAdvinhar == numeroComparativo ) {
                System.out.println("Parabéns, você acertou o número!");
                break;
            } else if ( numeroParaAdvinhar > numeroComparativo) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            tentativas++;
        }

        }

    }

