import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(101);
        Scanner tentativa = new Scanner(System.in);
        System.out.println("O número secreto é:" + numeroSecreto);
        System.out.println("Olá, guardo um número MUITO poderoso em minha memória... \nUm número ao qual, aquele que tem acesso, detém o poder.\n");
        System.out.println("Acerte o número especial (0-100), e descubra o verdadeiro poder!\n");
        System.out.println(" *** Vamos lá forasteiro, qual seu paplpite? ***");

        boolean acertou = false;
//System.out.println(numeroSecreto);

        for (int i = 0; i < 7; i++) {
            int palpite = tentativa.nextInt();


            if (palpite == numeroSecreto) {
                System.out.println("TRRRRRRRRRRUMMMMMMMMM, A TERRA TREME COM A DESCOBERTA DO NÚMERO DO PODER!!!");
                System.out.print(" Comemore, os céus agitam por sua sabedoria!\n Desfrute desde poder IMENSURÁVEL!! ");

                acertou = true;

                break;
            } else {
                int chance = 6 - i;
                if (chance > 0) {
                    String palavra;
                    if (chance == 1) {
                        palavra = "chance";
                    } else
                        palavra = "chances";

                    if (palpite > numeroSecreto + 10 || palpite < numeroSecreto - 10)
                        System.out.println("Seu palpite está frio... A diferença entre seu chute e o número do poder é maior que 10... \nVocê ainda possui " + chance + " " + palavra);

                    else {
                        System.out.println("Seu palpite está quente... A diferença entre seu chute e o número do poder é menor que 10... \nVocê ainda possui " + chance + " " + palavra);
                    }

                }
                if (chance == 0) {
                    System.out.println("Você falhou, suas chances terminaram, Diga adeus ao verdadeiro poder! \nO número do poder era " + numeroSecreto);
                }

            }

        }
    }
}



