package Entidades;

import java.time.LocalDate;

public class Client extends People {
    public Client(String nome, String cpf, LocalDate nascimento) {
        super(nome, cpf, nascimento);
    }

    @Override
    public void imprimirPessoa() {
        System.out.println("O cliente "+getNome());
        System.out.println("Dados");
        System.out.println("CPF:"+getCpf());
        System.out.println("Data de Nascimento:"+getNascimento());
    }


}
