import java.util.Scanner;
public abstract class Conta{
    public String titular;
    public String tipo;
    public float saldo;

    public abstract void saca(double valor);
    public abstract void deposita(int valor);
    public abstract void transferir(double valor, Conta destino);
}
class FactoryConta {

	

}    

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    }  

}
