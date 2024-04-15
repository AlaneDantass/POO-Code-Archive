    public class Gafanhoto extends Pessoa_{
    private String login;
    private int totAssistido;


    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUM(){
        setTotAssistido(totAssistido++);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString(){
        return "Nome=" + nome + "\n login=" + login + "\n idade=" + idade + "\n totAssistido=" + totAssistido
                + "\n sexo=" + sexo + ", experiencia=" + experiencia + "\n getLogin()=" + getLogin()
                + "\n getTotAssistido()=" + getTotAssistido();
    }
    
    
}
