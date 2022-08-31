public class Jantar {
    public static void main(String[] args) {
        //instanciar a Mesa
        Mesa mesa = new Mesa();
        // Criar as Threads e start()
        for(int i = 0; i < 5; i++){
            new Filosofo("Filosofo " + i, mesa, i).start(); // executando
        }
    }
}
