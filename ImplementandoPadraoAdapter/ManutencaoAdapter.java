public class ManutencaoAdapter implements ContaBancaria {

    Manutencao manutencao;

    public ManutencaoAdapter(String tipoDeConta){
        if(tipoDeConta.equals("Conta Corrente")) {
            manutencao = new OperacaoContaCorrente();
        } else if (tipoDeConta.equals("Conta Poupança")){
            manutencao = new OperacaoContaPoupanca();
        }
    }

    @Override
    public void conta(String tipo, String numero_conta){
        if (tipo.equals("Conta Corrente")){
            manutencao.manutencaoContaCorrente(saldo);
        } else  if (tipo.equals("Conta Poupança")) {
            manutencao.manutencaoContaPoupanca(saldo);
        }
    }
}