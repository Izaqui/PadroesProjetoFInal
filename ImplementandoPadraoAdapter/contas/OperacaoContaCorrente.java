public class OperacaoContaCorrente extends Conta implements Manutencao {

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
            destino.depositar(valor);
        }
    }

    @Override
    public void manutencaoContaCorrente( double saldo) {
        saldo -= taxaDeOperacao;
    }

    @Override
    public void manutencaoContaPoupanca( double saldo) {
        //do nothing
    }

}