
/**
 * Escreva uma descrição da classe exercicio2 aqui.
 * 
 * @author (Vitor Rafael - 22111296) 
 * @version (17/10/22)
 */
import java.util.Scanner;
public class exercicio2take1


{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase, palavra, frauxs, palauxs;
        int num=0, num2=0, cont=0, aux=0, aux2=0, aux3=0;
        char fraux, palaux;
        
        /**
         * tentei fazer um programa
         * mas ficou complicado demais,
         * decidi abandonar ele
         * mas quis manter para estudar o que eu criei
         */
        
        System.out.println("Este programa irá ler uma frase e uma palavra, \n e dirá quantas vezes essa palavra aparece na frase.");
        System.out.print("Digite uma palavra: ");
        palavra = ler.nextLine();
        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();
        num2 = palavra.length();
        while (aux   < frase.length()){
            aux3 = 0;
            fraux = frase.charAt(aux);
            palaux = palavra.charAt(aux3);
            frauxs = String.valueOf(fraux);
            palauxs = String.valueOf(palaux);
            if (frauxs.equalsIgnoreCase(palauxs)){ 
                aux2 = aux;
            do {
                if (frauxs.equalsIgnoreCase(palauxs)){
                    cont++;
                }
                aux2 = aux2 + 1;
                aux3 = aux3 + 1;
                fraux = frase.charAt(aux2);
                palaux = palavra.charAt(aux3);
                frauxs = String.valueOf(fraux);
                palauxs = String.valueOf(palaux);
            } while (frauxs.equalsIgnoreCase(palauxs));
        }
            if (cont < num2-1){
                num = num + 1;
            }
            cont = 0;
            aux = aux + 1;
        }

        System.out.print("A frase '" + frase + "' contém a palavra '" + palavra + "' " + num + " vez(es).");
    }
}
