
/**
 * Escreva uma descrição da classe exercicio6 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class exercicio6pronto
{
    public static void main(String[] args){
       String java = "Java";
       char javaux;
       int aux=java.length()-1,dont=0,font=0;
       for(int cont=0; cont<=4; cont++){
           if (font<=3) dont=0;
           for(font=0; font<cont&&cont<=4; font++) {
               System.out.print(java.charAt(font));
            } //usei estruturas de repetição similares àquelas do Dojo
            System.out.println();
        }
       for (int cont=3; cont>-1; cont--){
           for(font=0; font<cont; font++){
               System.out.print(java.charAt(font));
           } //para imprimir usando apenas o método charAt
           System.out.println();
       }
     
       }
}
