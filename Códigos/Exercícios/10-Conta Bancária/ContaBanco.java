/* Esta classe representa uma conta bancária básica, com funcionalidades como abrir conta, depositar,
* sacar, pagar mensalidade e fechar conta. Ela armazena informações como número da conta, tipo (conta
* corrente ou conta poupança), nome do titular, saldo e status da conta (aberta ou fechada).*/

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status){
        this.numConta=numConta;
        this.tipo=tipo;
        this.dono=dono;
        this.saldo=saldo;
        this.status=status;
        }

    public void abrirConta(String tipoConta){
        status = true;
        tipo = tipoConta;
        //é uma expressão em Java que compara duas strings, tipo e "cc", ignorando diferenças de maiúsculas e minúsculas. 
        if (tipoConta.equalsIgnoreCase("cc")){
            saldo += 50;
        } else if (tipoConta.equalsIgnoreCase("cp")){
            saldo += 150;
        }else{
            System.out.println("Tipo de conta inválido. Use 'cc' para conta corrente ou 'cp' para conta poupança.");
        }
    }

    public void depositar(double valor){
        if (status==true){
            saldo+=valor;
        }else{
            System.out.println("Abra uma conta para poder fazer depósitos.");
        };
    }
    public void sacar(double retirar){
        if (status==true & saldo>=retirar){
            saldo-=retirar;
        }else if(status==true & saldo<retirar){
            System.out.println("Você não tem dinheiro suficiente em caixa.");
        }else{
            System.out.println("Abra uma conta para poder fazer depósitos.");
        };
    }

    public void pagarMensalidade(){
        if (tipo.equals("cc")){
            if (status==true & saldo>=12){
            saldo-=12;
            System.out.println("Seu pagamento doi realizado com sucesso");
            }else if (status==true & saldo<20){
                System.out.println("Você não tem dinheiro suficiente em caixa.");
            }else{
                System.out.println("Abra uma conta para poder fazer depósitos.");
            }
        }else{
            if (status==true & saldo>=20){
            saldo-=20;
            System.out.println("Seu pagamento foi realizado com sucesso");
            }else if (status==true & saldo<20){
                System.out.println("Você não tem dinheiro suficiente em caixa.");
            }else{
                System.out.println("Abra uma conta para poder fazer depósitos.");
            }
        }
    }

    public void fecharConta(){
        if (saldo >0){
            System.out.println("Para fechar sua conta você precisa sacar seu dinheiro em caixa.");
        }else if (saldo<0){
            System.out.println("Para fechar a conta você precisa quitar sua dívida.");
        }else{
            status=false;
            System.out.println("Sua conta foi fechada com sucesso.");
        }
    }

    public String statusString(){
        return "Status da conta:" +
            "\nNúmero da conta: " + getNumConta() + "\nTipo: " + getTipo() + "\nUsuário: " + getDono() + "\nSaldo: " + getSaldo() + "\nStatus: " 
            + getStatus();
    }



    public int getNumConta() {
        return numConta;
    }



    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getDono() {
        return dono;
    }



    public void setDono(String dono) {
        this.dono = dono;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public boolean getStatus() {
        return status;
    }



    public void setStatus(boolean status) {
        this.status = status;
    }
}