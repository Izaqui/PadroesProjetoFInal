package BancoPopular.src;
import BancoPopular.src.Conta;

class FactoryConta {

    public Conta getPessoa(String titular, String tipo) {
		if (tipo.equals(“poupanca”))
			return new ContaPoupanca(titular);
		if (tipo.equals(“corrente”))
			return new ContaCorrente(titular);
	}

	

}    