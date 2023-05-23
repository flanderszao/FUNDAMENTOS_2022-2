
/**
 * Esse programa irá pedir 3 números (neste caso inteiros)
 * e retornar o maior deles.
 * 
 * @author (Vitor Rafael) 
 * @version (08-09-22)
 */
import java.util.Scanner;
public class maior3números
{
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Esse programa vai comparar 3 números inteiros e retornar o maior deles.");
    System.out.println("");
    
    System.out.printf("Dê o primeiro número: ");
    int a = ler.nextInt();
    
    System.out.printf("Dê o segundo número: ");
    int b = ler.nextInt();
    
    System.out.printf("Dê o terceiro número: ");
    int c = ler.nextInt();
    if (a >= b && a >= c){
            System.out.printf("O maior número é: " + a);
        }
    if (b >= c && b >= a){
            System.out.printf("O maior número é: " + b);
        }
    if (c >= a && c >= b){
            System.out.printf("O maior número é: " + c);
        }
    }
}

