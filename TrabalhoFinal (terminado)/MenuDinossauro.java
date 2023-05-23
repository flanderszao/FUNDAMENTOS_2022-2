
/**
 * Aqui é o menu para fazer funcionar os métodos
 * como foi requirido pelo trabalho final.
 * 
 * Foi feito trocando informações com a
 * Patrícia, e pesquisando similares na
 * internet
 * 
 * @author (Vitor Rafael) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class MenuDinossauro
{
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        CadastroDinossauro cadino = new CadastroDinossauro();
        Dinossauro codino = null;
        
        boolean part1=true, part2=false;
        int escolha=0, aux=0, auxs=0, auxz=0;
        
        System.out.println("Bem vindo ao sistema do Jurassic Zoo.");
        do {
            do {
                System.out.println();
                System.out.println("Menu:");
                System.out.println("(1) Relatório: Quantos animais de cada categoria.");
                System.out.println("(2) Relatório: Qual o dinossauro mais pesado?");
                System.out.println("(3) Relatório: Quantos kg de carne são necessárias esse mês?");
                System.out.println("(4) Relatório: É possível fugir de um dinossauro?");
                System.out.println("(5) Relatório: Zonas mais perigosas do parque.");
                System.out.println("(6) Relatório: Dinossauros com mais vogais no nome.");
                System.out.println();
                System.out.println("(0) Próxima Página");
                System.out.println();
                System.out.print("Sua escolha: ");
                escolha = ler.nextInt();
                // menu usando switch
                switch (escolha){
                    case 1: //atividade 1
                        System.out.println(); //chamar o método das categorias do dinossauros
                        cadino.DinossauroCategorias();
                        break;
                    
                    case 2: //atividade 2
                        System.out.println(); //para chamar o método de qual peso
                        System.out.println("Qual o tipo do dinossauro? (1)Carnívoro (2)Herbíovoro ");
                        aux = ler.nextInt();
                        System.out.println ("Qual a categoria do dinossauro? (1)Pequeno Porte (2)Médio Porte (3)Grande Porte");
                        auxs = ler.nextInt();
                        cadino.DinossauroPesoPesado(aux, auxs);
                        break;
                    
                    case 3: //atividade 3
                        System.out.println(); //chamar o método de quantos kg de carne por mês
                        cadino.DinossauroCarne();
                        break;
                    
                    case 4:  //atividade 4
                        double ddist, dspd, pdist;
                        System.out.println(); //para chamar o método do tempo de fuga, pedindo informações para o usuário
                        System.out.print("Qual a distância do dinossauro do bunker?");
                        ddist = ler.nextDouble();
                        System.out.print("Qual a distância da pessoa do bunker?");
                        pdist = ler.nextDouble();
                        System.out.print("Qual a velocidade do dinossauro?");
                        dspd = ler.nextDouble();
                        boolean fuga = cadino.DinossauroTempo(ddist, pdist, dspd);
                            if (fuga == true) System.out.println("É possível fugir.");
                            if (fuga == false) System.out.println("Não é possível fugir para este bunker, procure se abrigar.");
                        break;
                        
                    case 5: //atividade 5
                        System.out.println("Distribuição de Dinossauros: (1)De forma Ordenada (2)De forma aleatória ");
                        System.out.println("(Método 1 contém bugs, mas está ativo para documentação)");
                        System.out.print("(Método 2 funciona de maneira consistente) ");
                        aux = ler.nextInt(); // a recomendação é usar o 2, pois ele funciona de maneira consistente
                        cadino.DinossauroZonaPerigo(aux);
                        break;
                        
                    case 6: //atividade 6
                        System.out.println(); //chamar o método de quantas vogais dos dinossaurs
                        cadino.DinossauroVogal();
                        break;
                     
                    case 0: //para ir para a próxima página 
                        part1=false;
                        part2=true;
                        break;
                }
            
            } while (part1 == true);
            do {
                System.out.println();
                System.out.println("Menu:");
                System.out.println("(1) Adicionar Dinossauro");
                System.out.println("(2) Pesquisar Dinossauro");
                System.out.println("(3) Remover Dinossauro");
                System.out.println("(4) Imprimir Todos os Dinossauros");
                System.out.println("(5) Espaços Livres Para Armazenamento");
                System.out.println();
                System.out.println("(8) Carregar Banco de Dados para Testes");
                System.out.println();
                System.out.println("(9) Página anterior");
                System.out.println("(0) Sair");
                System.out.println();
                System.out.print("Sua escolha: ");
                escolha = ler.nextInt();
                //menu usando switch
                switch (escolha){
                    case 1: //para adicionar um dinossauro manualmente
                        int cat, tip, id;
                        double pes;
                        boolean sucesso=false;
                        System.out.println();
                        System.out.print("Qual o ID do Dinossauro? ");
                        id = ler.nextInt();
                        System.out.print("Qual o nome da raça do dinossauro? ");
                        ler.nextLine();
                        String nome = ler.nextLine();
                        System.out.print("Qual o tipo do dinossauro? (1)Carnívoro (2)Herbívoro ");
                        tip = ler.nextInt();
                        System.out.print("Qual a categoria do dinossauro? (1)Pequeno Porte (2)Médio Porte (3)Grande Porte ");
                        cat = ler.nextInt();
                        System.out.print("Qual o peso do dinossauro? ");
                        pes = ler.nextDouble();
                        Dinossauro dino = new Dinossauro(id, nome, tip, cat, pes);
                        sucesso = cadino.adicionarDinossauro(dino);
                        if (sucesso == true) {System.out.println("Dinossauro foi cadastrado com sucesso!"); part2=true;}
                        if (sucesso == false) System.out.println("Falha no cadastro de Dinossauro!");
                        break;
                        
                    case 2: //para pesquisar e imprimir um dinossauro usando ID
                        System.out.println();
                        System.out.print("Qual o ID do Dinossauro? ");
                        aux = ler.nextInt();
                        Dinossauro dinoaux = cadino.pesquisarDinossauro(aux);
                        System.out.println();
                        if (dinoaux == null) System.out.println("Não existe dinossauro com este ID.");
                        else{
                            cadino.DinossauroImprimir(dinoaux);
                        }
                        break;
                        
                    case 3: //para apagar um dinossauro usando ID
                        System.out.println();
                        System.out.print("Qual o ID do Dinossauro? ");
                        aux = ler.nextInt();
                        sucesso = cadino.removerDinossauro(aux);
                        System.out.println("Feito!");
                        part2=true; //resolução de um bug que fazia o laço fechar por algum motivo que ainda não descobri
                        break;
                        
                    case 4: //para imprimir todos os dinossauros
                        cadino.DinoImprimirTudo();
                        break;
                        
                    case 5: //para dizer quantos espaços estão livres
                        aux = cadino.DinoVetoresLivres();
                        System.out.println("Existem "+aux+" espaços livres para novos dinossauros.");
                        break;
                        
                    case 8: // informações criadas para teste
                        Dinossauro dino1 = new Dinossauro(1, "Tiranossauro", 1, 3, 9000);
                        cadino.adicionarDinossauro(dino1); //3 dummys carnívoros
                        Dinossauro dino2 = new Dinossauro(2, "Pterodátilo", 1, 2, 200);
                        cadino.adicionarDinossauro(dino2);
                        Dinossauro dino3 = new Dinossauro(3, "Velociraptor", 1, 1, 50);
                        cadino.adicionarDinossauro(dino3);
                        Dinossauro dino4 = new Dinossauro(4, "Braquiossauro", 2, 3, 50000);
                        cadino.adicionarDinossauro(dino4); //3 dummys herbívoros
                        Dinossauro dino5 = new Dinossauro(5, "Estegossauro", 2, 2, 1200);
                        cadino.adicionarDinossauro(dino5);
                        Dinossauro dino6 = new Dinossauro(6, "Protoceratops", 2, 1, 200);
                        cadino.adicionarDinossauro(dino6);
                        System.out.println("Adicionados com sucesso!");
                        part2=true; //um bug que fazia o laço fechar
                        break;
                        
                    case 9:
                        part1=true;
                        part2=false; //para voltar para a outra página
                        break;
                        
                    case 0:
                        part1=false;
                        part2=false; //para fechar o laço definitivamente
                        break;  
                }
                
            } while (part2 == true);
        } while (part1 == true|part2 == true);
    }
}
