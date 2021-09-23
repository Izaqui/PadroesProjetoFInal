public class ContaCorrente extends Conta{
    private double taxaDeOperacao = 00.05;

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public  void  transferir(double valor, ContaCorrente destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            this.saldo -= taxaDeOperacao;
            destino.depositar(valor);
        }
    }
}