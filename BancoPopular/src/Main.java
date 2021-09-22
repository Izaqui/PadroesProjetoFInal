import java.util.Scanner;
class Conta{
    private float saldo;
    private float limite;
    public void saca(int valor) {
		if(saldo<valor){
            System.out.print("Seu saldo é insuficiente para este saque");
        }
        else{
            System.out.println("Saque de "+valor+"R$ efetuado com sucesso");
        }
	}
	
    public void deposita(int valor) {

    }
    public void transferir(){

    }
}
class FactoryConta {

	public Conta getConta(float limite, float valor) {
		
	}

}    

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    }  

}
