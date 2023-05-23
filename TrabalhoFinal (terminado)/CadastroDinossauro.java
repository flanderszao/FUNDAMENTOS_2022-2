
/**
 * Complementei algumas partes, como requerido pelo
 * trabalho final, e tive que editar algumas partes
 * para que meus métodos funcionassem sem problema
 * o próxima posição especialmente estava dando problemas.
 * 
 * Foi feito trocando informações com a
 * Patrícia, pesquisando métodos de resolução
 * na internet, adaptando e testando métodos
 * aprendidos em aula & com muita sorte
 * 
 * @author (Vitor Rafael - Complementador) 
 * @version (11/2022)
 */
public class CadastroDinossauro {
    Dinossauro[] cadastroDinossauros;
    BibliotecaComplementar biblio = new BibliotecaComplementar();
    private int proximaPosicao;
    public CadastroDinossauro(){
        cadastroDinossauros = new Dinossauro[50];
        proximaPosicao = 0; //evitar “out of range” nos metodos
    } //TIVE QUE DAR PEQUENAS REVISADAS POR AQUI, POIS ESTAVAM DANDO ERRO NO MEU CÓDIGO
    public boolean adicionarDinossauro(Dinossauro dino) {
        if(proximaPosicao + 1< cadastroDinossauros.length){ //pq comeca com -1
            cadastroDinossauros[proximaPosicao] = dino;
            proximaPosicao++;
            return true;
        } else { return false; }
    }
    public Dinossauro pesquisarDinossauro(int id) {
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroDinossauros[i].getIdDinossauro() == id){
                return cadastroDinossauros[i];
            }
        }
        return null;
    }
    public boolean removerDinossauro(int id) {
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroDinossauros[i].getIdDinossauro() == id){
                cadastroDinossauros[i] = null;
                for(int j=i; j<proximaPosicao; j++){
                    cadastroDinossauros[j] = cadastroDinossauros[j+1];
            }
                cadastroDinossauros[proximaPosicao]=null;
                proximaPosicao--;
                return true;
            }
        }
            return false;
    }
    //primeira atividade
    public Dinossauro DinossauroCategorias() {
        int i=0, carn=0, herb=0, carp=0, carm=0, carg=0, herp=0, herm=0, herg=0;
        for (i=0; i<proximaPosicao; i++){
            if (cadastroDinossauros[i].getTipo() == 1){
                carn++; // aqui conta quantos carnívoros em geral
                if (cadastroDinossauros[i].getCategoria() == 1) carp++; // carnívoros pequenos,
                if (cadastroDinossauros[i].getCategoria() == 2) carm++; // médios
                if (cadastroDinossauros[i].getCategoria() == 3) carg++; // e grandes
            }
            if (cadastroDinossauros[i].getTipo() == 2){
                herb++; // aqui conta quantos herbívoros em geral
                if (cadastroDinossauros[i].getCategoria() == 1) herp++; // herbivoros pequenos
                if (cadastroDinossauros[i].getCategoria() == 2) herm++; // médios
                if (cadastroDinossauros[i].getCategoria() == 3) herg++; // e grandes
            }
        }    
        System.out.println("Carnívoros: "+carn);
        System.out.println("De pequeno porte: "+carp);
        System.out.println("De médio porte: "+carm);
        System.out.println("De grande porte: "+carg);
        System.out.println();
        System.out.println("Herbívoros: "+herb);
        System.out.println("De pequeno porte: "+herp);
        System.out.println("De médio porte: "+herm);
        System.out.println("De grande porte: "+herg);
        return null; 
    }
    
    //segunda atividade
    public Dinossauro DinossauroPesoPesado(int tip, int cat)  {
        int pesoid=0, i=0, cats, tips; 
        String dino=null;
        double auxpeso=0, auxspeso=0; //variaveis para guardar info de dinossauro pesado
        for(i=0; i<proximaPosicao; i++){
            tips = cadastroDinossauros[i].getTipo(); // procurar e guardar o tipo e categoria de dinossauros
            cats = cadastroDinossauros[i].getCategoria();
            if (tips == tip && cats == cat){
                auxpeso = cadastroDinossauros[i].getPeso(); // ver se são as categorias pedidas, se forem o programa pega o peso
                if (auxspeso < auxpeso){
                    auxspeso = auxpeso; // e se o peso for maior que o antigo peso (peso inicial 0) ele guarda o peso e id desse dinossauro
                    pesoid = i;
                }
            }
        } // 
        if (auxspeso != 0.0){
            dino = cadastroDinossauros[pesoid].getNomeRaca();
            System.out.println("O dinossauro mais pesado é o "+dino+" com "+auxspeso+"kg");
        }
        else System.out.println("Algo deu errado.");
        return null;
    }
    
    //terceira atividade
    public Dinossauro DinossauroCarne() {
        double aux=0, auxs=0;
        int cat=0, tip=0;
        for (int i=0; i<proximaPosicao; i++){
            tip = cadastroDinossauros[i].getTipo(); //procura se o dinossauro é carnívoro
            if (tip==1) {
                cat = cadastroDinossauros[i].getCategoria(); //procura qual o porte do dinossauro
                switch (cat) {
                    case 1:
                        aux = cadastroDinossauros[i].getPeso();
                        aux = aux*0.1; //pequeno porte (peso * 10%)
                        System.out.println(aux);
                        auxs = auxs + aux; //e contabiliza no total
                        break;
                    case 2:
                        aux = cadastroDinossauros[i].getPeso();
                        aux = aux*0.1 + aux*0.05; //médio porte (peso * 10%) + (peso * 5%) [estava dando bugs de outras formas]
                        System.out.println(aux);
                        auxs = auxs + aux; //e contabiliza no total
                        break;
                    case 3:
                        aux = cadastroDinossauros[i].getPeso();
                        aux = aux*0.1 + aux*0.1; //grande porte (peso * 10%) + (peso * 10%) [estava dando bugs de outras formas]
                        System.out.println(aux);
                        auxs = auxs + aux; //e contabiliza no total
                        break;
                }
            }
        }
        auxs = auxs*30; // peso multiplicado por dias do mês
        System.out.println("Precisam ser comprados "+auxs+"kg de carne durante 1 mês.");
        return null;
    }
    
    // quarta atividade
    public boolean DinossauroTempo(double DinoDist, double PeopDist, double DinoSpd) {
        double PeopTemp=0, DinoTemp=0;
        DinoTemp = DinoDist/DinoSpd; //esse ficou meio na cara, mas pede variáveis para o usuário
        PeopTemp = PeopDist/20;
        if (PeopTemp < DinoTemp) return true; //caso a pessoa seja mais rápida ela chega
        else return false; // caso contrário não
    }
    // quinta atividade
    public Dinossauro DinossauroZonaPerigo(int form){
        int[][] zona = new int[150][150];
        int m=0, n=0, aux, auxs, tip, id, contn=0, conts=0;
        double daux, dauxs;
        
        /*
         * NOTA IMPORTANTE SOBRE ESSA ATIVIDADE
         * PARA ESSA ATIVIDADE EU AGI EM CIMA
         * DA SUPOSICÃO DE QUE NUM GRID DE 150X150
         * DE 75 PARA BAIXO SERIA A ZONA NORTE
         * E DE 76 PARA CIMA SERIA A ZONA SUL
         * 
         * COMO SE FOSSE UM QUADRADO COM
         * 150 PEÇAS DE ALTURA E
         * 150 PEÇAS DE COMPRIMENTO
         */
        
        for (int i=0; i<150; i++){
            for (int j=0; j<150; j++){
                zona[i][j] = 0; // PARA INICIALIZAR TODOS OS VETORES (PROVISÓRIO)
            }
        }
        
        if (form==1){
            for (int i=0; i<proximaPosicao; i++){
                id = cadastroDinossauros[i].getIdDinossauro();
                tip = cadastroDinossauros[i].getTipo(); // o primeiro método põe organizadamente os dinossauros
                for (int j=0; j<2; j++){
                    for (int k=0; k<2; k++){
                        zona[m][n] = id; // mas meio que acaba sempre colocando os dinossauros na zona norte
                        if (m <= 75 && tip==1) contn++; //não imagino que essa tenha sido a intenção
                        if (m > 75 && tip==1) conts++; //então tomei a liberdade de criar um método que distribui os dinossauros
                        if (n<149) n++;  // de maneira aleatória, abaixo
                        if (n==149) {
                            n=0; // esse também está tendo problema para guardar dinossauros
                            m++; // então não é um método que realmente funciona
                        } // mas deixei aqui para que possa ficar registrado
                    }
                }
            }
        }
        if (form==2){
            for (int i=0; i<proximaPosicao; i++){
                id = cadastroDinossauros[i].getIdDinossauro();
                tip = cadastroDinossauros[i].getTipo();
                daux = Math.random()*150; //para criar um elemento aleatório
                dauxs = Math.random()*150; //para guardar em algum local do parque
                aux = (int)daux; //transformar em int
                auxs = (int)dauxs;
                if (zona[aux][auxs]!=0) i--; // para o método não sobrescrever dinossauros (supondo que não haverá nenhum de ID == 0)
                else {
                    zona[aux][auxs] = id; 
                    if (aux<=75 && tip==1) contn++; //contn++ conta se o dinossauro está na zona norte
                    if (aux>75 && tip==1) conts++; //conts++ conta se o dinossauro está na zona sul
                }
            }
        }
        System.out.println("Dinossauros carnívoros na zona norte: "+contn);
        System.out.println("Dinossauros carnívoros na zona sul: "+conts);
        if (contn>conts) System.out.println("A zona norte é mais perigosa!");
        if (conts>contn) System.out.println("A zona sul é mais perigosa!");
        if (contn==conts) System.out.println("Ambas as zonas são igualmente perigosas!");
        if (contn==0 && conts==0) System.out.println("Nenhuma zona contém perigo imediato!");
        return null;
    }
    
    // sexta atividade
    public Dinossauro DinossauroVogal(){
        int cont=0, aux=0, auxs=0;
        char charaux, teste1;
        String palaux, palauxs, nomedino;
        int[][] idaux = new int[proximaPosicao][3];
    
        // para fazer essa atividade eu basicamente copiei o que deu certo
        // do trabalho de nota E2
        
        for (int i=0; i<proximaPosicao; i++){
            palauxs = cadastroDinossauros[i].getNomeRaca();
                for (int j=0; j<palauxs.length(); j++){
                    charaux = palauxs.charAt(j); //puxa caracatere
                    palaux = String.valueOf(charaux); // transforma em string
                    if (palaux.equalsIgnoreCase("a")|palaux.equalsIgnoreCase("e")|palaux.equalsIgnoreCase("i")|palaux.equalsIgnoreCase("o")|palaux.equalsIgnoreCase("u")){
                        cont++; //ve se a string bate com as vogais e conta
                    }
                    if (j==0) idaux[i][2] = biblio.AlfabetoValor(palaux);
                }
            idaux[i][0] = i; // uma pequena matriz, que guarda a posição do dinossauro original
            idaux[i][1] = cont; // e quantas vogais ele possui
            cont=0;
        }
        
        for (int i = 0; i < idaux.length; i++) 
        { 
           int pos = i; // pesquisei e adaptei um código da internet
            for (int j = i+1; j < idaux.length; j++) 
           {
                if (idaux[j][2] < idaux[pos][2])
                {
                    pos = j;
                }
            }

            int temp = idaux[pos][2]; //primeiro ele organiza alfabeticamente
            idaux[pos][2] = idaux[i][2]; 
            idaux[i][2] = temp; 
            
            temp = idaux[pos][1];
            idaux[pos][1] = idaux[i][1];
            idaux[i][1] = temp;
            
            temp = idaux[pos][0];
            idaux[pos][0] = idaux[i][0]; 
            idaux[i][0] = temp; 
        }
        
        for (int i = 0; i < idaux.length; i++) 
        { 
           int pos = i; 
            for (int j = i+1; j < idaux.length; j++) 
           {
                if (idaux[j][1] < idaux[pos][1])
                {
                    pos = j;
                }
            }

            int temp = idaux[pos][1]; // depois de maneira crescente
            idaux[pos][1] = idaux[i][1]; 
            idaux[i][1] = temp; 
            
            temp = idaux[pos][2];
            idaux[pos][2] = idaux[i][2];
            idaux[i][2] = temp;
            
            temp = idaux[pos][0];
            idaux[pos][0] = idaux[i][0]; 
            idaux[i][0] = temp; 
        } 
        
        for (int i=0; i<proximaPosicao; i++){
            aux = idaux[i][0]; // ele puxa a posição do dinossauro
            auxs = idaux[i][1]; // e suas vogais, e imprime
            nomedino = cadastroDinossauros[aux].getNomeRaca();
            System.out.println(nomedino+" possuí "+auxs+" vogais no nome.");
        }
        
        return null;
    }
    
    // complementar
    // criei os métodos abaixo para me ajudarem a imprimir os dinossauros,
    // similar ao método toString
    public Dinossauro DinossauroImprimir(Dinossauro dinoaux){
        System.out.println("ID: "+dinoaux.getIdDinossauro());
        System.out.println("Nome: "+dinoaux.getNomeRaca());
        if (dinoaux.getTipo() == 1) System.out.println("Tipo: Carnívoro");
        if (dinoaux.getTipo() == 2) System.out.println("Tipo: Herbívoro");
        if (dinoaux.getCategoria() == 1) System.out.println("Categoria: Pequeno Porte");    
        if (dinoaux.getCategoria() == 2) System.out.println("Categoria: Médio Porte");
        if (dinoaux.getCategoria() == 3) System.out.println("Categoria: Grande Porte");
        System.out.println("Peso: "+dinoaux.getPeso());
        return null;
    }
    
    // e uma variação para imprimir todos
    public Dinossauro DinoImprimirTudo(){
        for (int i=0; i<proximaPosicao; i++){
            System.out.println();
            DinossauroImprimir(cadastroDinossauros[i]);
        }
        return null;
    }
    
    // um código simples para dizer quantos vetores estão livres
    public int DinoVetoresLivres(){
        int a, b, c;
        a = cadastroDinossauros.length;
        b = proximaPosicao;
        c = a-b;
        return c;
    }
}

