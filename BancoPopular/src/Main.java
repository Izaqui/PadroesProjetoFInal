import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        FactoryConta factory = new FactoryConta();
		String titular = “Carlos”;
		String tipo = “corrente”;
		factory.getConta(titular, tipo);
    }  

}
