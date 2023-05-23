
/**
 * Escreva uma descrição da classe exercicio1 aqui.
 * 
 * @author (Vitor Rafael - 22111296) 
 * @version (17/10/22)
 */
import java.util.Scanner;
public class exercicio1pronto

{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int cont = 0; //Declaração simples de variáveis utilizadas.
        int aux = 0;
        char palaux; 
        String palauxs;
        
        System.out.println("Este programa irá ler uma palavra e dirá quantas vogais há nela.");
        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine(); // Até aqui é só um programa que lê uma palavra
        // Aqui eu usei uma estrutura de repetição para contabilizar as vogais
        while(aux < palavra.length()){
            palaux = palavra.charAt(aux); //Aqui eu tive que pegar um caractere
            palauxs = String.valueOf(palaux); //E aqui eu tive que transformar esse caractere em String, deve haver maneira melhor de fazer
            if (palauxs.equalsIgnoreCase("a")|palauxs.equalsIgnoreCase("e")|palauxs.equalsIgnoreCase("i")|palauxs.equalsIgnoreCase("o")|palauxs.equalsIgnoreCase("u")){
                cont = cont + 1; //Aqui eu fiz algo simples, se o string palauxs fosse uma vogal, simplesmente ia contabilizar ali
            }
            aux = aux + 1;
        }
        System.out.print("A palavra " + palavra + " contém " + cont + " vogais.");
    }
}
