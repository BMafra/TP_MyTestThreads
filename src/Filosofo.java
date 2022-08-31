public class Filosofo extends Thread {
    final static int TEMPO_MAXIMO = 100;
    Mesa mesa; // garfos -> controle do semafaro (quanto 0 garfo ta disponivel ou não)
    int filosofo;

    public Filosofo(String nome, Mesa mesaDeJantar, int fil) {
        super(nome);
        mesa = mesaDeJantar;
        filosofo = fil;
    }

    public void run() { // inicia execução da thread
        int tempo = 0;
        while (true) {
            tempo = (int) (Math.random() * TEMPO_MAXIMO);
            pensar(tempo);
            Mesa.getGarfos(); // usar recurso (garfo) compartilhado
            tempo = (int) (Math.random() * TEMPO_MAXIMO);
            comer(tempo);
            returnGarfos(); // devolve recurso (garfo)
        }
    }

    public void pensar(int tempo) {
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filófoso pensou em demasia"); // "morreu de fome!"
        }
    }

    public void comer(int tempo) {
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filósofo comeu em demasia");
        }
    }
}