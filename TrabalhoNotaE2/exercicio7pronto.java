
/**
 * Escreva uma descrição da classe exercicio7 aqui.
 * 
 * @author (Vitor Rafael - 22111296) 
 * @version (18/10/2022)
 */
import java.util.Scanner;
public class exercicio7pronto
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Esse programa vai transformar um texto em letras maiúsculas e outro em letras minúsculas.");
        System.out.print("Escreva o texto em letras maiúsculas: ");
        String pal = ler.nextLine();
        pal = pal.toLowerCase(); //outro código simples, só precisei arrumar as variáveis com o "toLowerCase()"
        System.out.println("Em letras minúsculas fica: "+pal);
        System.out.print("Escreva o texto em letras minúsculas: ");
        pal = ler.nextLine();
        pal = pal.toUpperCase(); //e mudar aqui para "toUpperCase()"
        System.out.println("Em letras maiúsculas fica: "+pal);
    }
}
