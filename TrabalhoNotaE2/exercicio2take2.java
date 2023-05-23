
/**
 * Escreva uma descrição da classe exercicio2take2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class exercicio2take2
/**
 * O método desse código foi baseado no deste site
 * https://www.geeksforgeeks.org/count-occurrences-of-a-word-in-string/
 * foi baseado demasiadamente até, temo dizer, ouso até dizer plagiado haha,
 * mas o método que eu tentei por mim mesmo está no "exercicio2take1"
 * e é complicado, mas usa métodos parecidos com os do "exercicio1pronto"
 * apesar deles não funcionarem, e serem talvez mal-otimizados.
 */
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String palavra, frase;
        
        System.out.print("Digite uma palavra: ");
        palavra = ler.nextLine();
        System.out.print("Digite uma frase: ");
        frase= ler.nextLine();
        
        String aux[] = frase.split(" ");
        
        int dont = 0;
        for (int cont = 0; cont < aux.length; cont++){
        if (palavra.equals(aux[cont])) //aqui é onde procura as ocorrências na frase
            dont++;
        }
        System.out.print("A palavra '"+palavra+"' foi encontrada "+dont+" vezes na frase '"+frase+"'");
    }
}
