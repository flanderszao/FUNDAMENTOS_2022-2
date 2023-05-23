
/**
 * Escreva uma descrição da classe CopyOfexercicio7 aqui.
 * 
 * @author (Vitor Rafael - 22111296) 
 * @version (18/10/202)
 */
public class exercicio8pronto
{
    public static void main(String[] args){
        String java = "Java";
        int aux=java.length(), baux=aux, dont=0, font=0;
        
        for (int cont=0; cont<1; cont++){
            while (dont<3){
                System.out.println(java.substring(baux-baux, baux-3));
                baux=baux+1;
                dont++; //acho que esse código foi feito de maneira meio irresponsável
            } //acho que ele também é muito frágil, e tem funções que talvez sejam desnecessárias
            while (dont>-1){
                System.out.println(java.substring(baux-baux, baux-3));
                baux=baux-1; //imagino que ele não necessite do primerio "for" mas quis testar, mas não soube usar ele bem
                dont--; //mas ele cumpre seu objetivo, usando o método substrings
            }
        }
    }
}
