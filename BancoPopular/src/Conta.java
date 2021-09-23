package BancoPopular.src;

public abstract class Conta{
    private String titular;
    private String cpf;
    private String numero_conta
    private String tipo;
    private double saldo;

    public abstract void sacar(double valor);
    public abstract void depositar(int valor);
    public abstract void transferir(double valor, Conta destino);
}