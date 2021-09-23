public class OperacaoContaPoupanca extends Conta implements Manutencao {

    private double rendimento = 00.04;

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public  void  transferir(double valor, ContaPoupanca destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
        }
    }

    @Override
    public void manutencaoContaCorrente( double saldo) {
        //do nothing
    }

    @Override
    public void manutencaoContaPoupanca( double saldo) {
        saldo += rendimento;
    }

}