public class principalL {
    
    public static void main(String[] args) {
        // Criando um vetor de lutadores

        Lutador[] lutadores = new Lutador[6];

    //vetor é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo. Você pode pensar em um vetor como uma série de caixas numeradas, onde cada caixa pode armazenar um valor. 


        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35,1.65f, 80.9f,12,2,1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 30);
        lutadores[5] = new Lutador("Nerdard","EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        lutadores[1].apresentar();
        lutadores[1].status();
        lutadores[3].ganharLuta();
        lutadores[5].status();
    }
}
