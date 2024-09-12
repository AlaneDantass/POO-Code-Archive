package Isolados.Mercado;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        mercado.adicionar(new Produto("Amendoin", 2.00));
        mercado.adicionar(new Produto("Leite", 2.99));
        mercado.adicionar(new Produto("Figo", 3.00));
        mercado.adicionar(new Produto("Iorgute", 3.50));
        mercado.adicionar(new Produto("Ameixa", 5));
        mercado.adicionar(new Produto("Papel", 7.00));

        mercado.pesquisar("Leite");
        mercado.excluir("Figo");

        mercado.pesquisar("Iorgute");
        mercado.excluir("Papel");   
    }
}

