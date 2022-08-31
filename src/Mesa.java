public class Mesa {
    // estrutura de dados: vetor, ArrayList

    int[] filosofos = new int[5];
    public static int PENSANDO = 1; //Todos começam pensando
    public static int COMENDO = 2;
    public static int FOME = 3;

    public Mesa(){
        for(int i = 0; i < 5; i++){
            filosofos[i] = PENSANDO; // inicializando
        }
    }

    public void getGarfos(int filosofo){
        //pegar os garfos(2)
    }

    public void returnGarfos(){
        //devolver os garfos
    }

    boolean[] garfos = new boolean[5];

    public void aDireita(){
        // Retorna o filosofo a direita
    }

    public void aEsquerda(){
        // Retorna o filosofo a esquerda
    }

    public void garfoEsquerdo(){
        // Retorna o garfo a direita
    }

    public void garfoDireito(){
        // Retorna o garfo a esquerda
    }

    public void imprimeEstadoFilosofo(){
        // Imprime o estado de cada filosofo
        // Comer, pensar (açoes); com fome (esperando)
    }
}
