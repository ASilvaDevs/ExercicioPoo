package br.com.asilva;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Alex Silva", "Rua das Pedras, 0000", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Alex Tech Ltda", "Avenida Central, 456", "12.345.678/0001-90");

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Endereço: " + pf.getEndereco());
        System.out.println("CPF: " + pf.getIdentificacao());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Endereço: " + pj.getEndereco());
        System.out.println("CNPJ: " + pj.getIdentificacao());
    }
}
