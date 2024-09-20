import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;;

        int tentativasMax = 10;
        int tentativasUsadas = 0;
        
        boolean acertou = false;


        while (tentativasUsadas < tentativasMax && !acertou){
            System.out.println("\nTentativas: "+ tentativasUsadas + "/10");
            System.out.println("Digite um número: ");
            int chute = lerTeclado.nextInt();
            tentativasUsadas += 1;

            if (chute > num){
                System.out.println("\nMENOR");
            }
            else if (chute < num){
                System.out.println("\nMAIOR");
            }
            else if (chute == num){
                System.out.println("\nIGUAL");
                System.out.println("\n===============PARABÉNS!===============\nVocê acertou o número em " + tentativasUsadas + " tentativas!!");
                acertou = true;
            }
            }
        
        if (tentativasMax == tentativasUsadas) {
                System.out.println("\n==========GAME OVER!=========\n  Suas tentativas acabaram.\n   O número correto era "+ num + ".");
        }
        
        lerTeclado.close();
    }
}