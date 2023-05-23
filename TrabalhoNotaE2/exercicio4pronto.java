
/**
 * Escreva uma descrição da classe exercicio4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class exercicio4pronto
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String pal, palaux="", palchar;
        char charpal;
        int aux, auxchar;
        
        System.out.println("Esse programa verifica se um texto é um palíndromo (mesma coisa se invertido).");
        System.out.print("Escreva um texto: ");
        pal = ler.nextLine();
        aux = pal.length()-1; //precisava de um auxiliar com a largura da palavra, e como os char começam do zero, precisava tirar 1
        while (palaux.length()!=pal.length()){
            charpal = pal.charAt(aux);
            palchar = String.valueOf(charpal);
            palaux = palaux+palchar;
            aux=aux-1; //esse código, basicamente escreve a palavra de trás para frente, caractere por caractere, até ambas tiverem o mesmo tamanho
        }
        System.out.println("O texto escrito é: " + pal);
        System.out.println("O texto ao contrário fica: "+ palaux);
        if (pal.equalsIgnoreCase(palaux)){
            System.out.println("O texto: "+pal+" é um palíndromo."); //simples uso de "equalsIgnoreCase"
        }
    }
}
