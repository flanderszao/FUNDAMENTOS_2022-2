
/**
 * Escreva uma descrição da classe exercicio3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class exercicio3pronto
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String verbo, veraux;
        int aux;
        
        System.out.println("Este programa irá conjugar verbos terminados em 'ar': ");
        System.out.print("Escreva um verbo terminado em 'ar': ");
        verbo = ler.nextLine(); // Até aqui só lia uma variável
        aux=verbo.length(); // Aqui necessitava o valor da variável pros próximos cálculos
        if (verbo.endsWith("ar")){
            veraux = verbo.substring(aux-aux, aux-2); //aqui uma variável auxiliar de String, pra guardar a palavra sem as duas últimas letras
            System.out.println("Eu "+veraux+"o");
            System.out.println("Tu "+veraux+"as");
            System.out.println("Ele "+veraux+"a");
            System.out.println("Nós "+veraux+"amos");
            System.out.println("Vós "+veraux+"ais");
            System.out.println("Eles "+veraux+"am"); //E as últimas linhas conjugavam o verbo terminado em "ar"
        }
    }
}
