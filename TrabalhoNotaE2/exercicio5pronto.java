
/**
 * Escreva uma descrição da classe exercicio5 aqui.
 * 
 * @author (Vitor Rafael - 22111296)
 * @version (18/10/2022)
 */
import java.util.Scanner;
public class exercicio5pronto
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Este programa irá dizer o comprimento do texto escrito.");
        System.out.print("Escreva um texto: ");
        String pal = ler.nextLine();
        int aux = pal.length(); //esse código foi simples, mas ele contabiliza os espaços, pois espaços, tecnicamente, são caracteres.
        System.out.println("O texto: '"+pal+"' possui " +aux+ " caracteres, contando espaços se houver.");
    }
}
