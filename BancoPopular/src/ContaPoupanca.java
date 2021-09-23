
public class ContaPoupanca extends Conta{
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
}