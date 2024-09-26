public class MainLivro {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();

        livraria.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 59.90, 10));
        livraria.adicionarLivro(new Livro("Inteligência Emocional", "Daniel Goleman", 39.50, 5));
        livraria.adicionarLivro(new Livro("Treine seu cérebro para provas", "Augusto Cury", 45.00, 8));
        livraria.adicionarLivro(new Livro("A Revolução dos Bichos", "George Orwell", 25.90, 15));
        livraria.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 19.90, 20));

        livraria.buscarLivroPorTitulo("Treine seu cérebro para provas");
        livraria.listarLivros();
        livraria.Vtot("Inteligência Emocional");
        
    }
}
