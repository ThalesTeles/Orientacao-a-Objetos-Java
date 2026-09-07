package aulas.aula18_heranca;

import aulas.aula18_heranca.conta.ContaBancaria;
import aulas.aula18_heranca.conta.ContaEspecial;

public class AppHeranca {
    public static void main(String[] args) {
        System.out.println("=== TESTE CONTA BANCÁRIA (CLASSE PAI) ===");
        ContaBancaria contaPadrao = new ContaBancaria("Thales Teles", 1001, 500.0f);
        contaPadrao.sacar(600.0f); // Deve falhar (Saldo insuficiente)
        contaPadrao.sacar(100.0f); // Deve passar

        System.out.println("\n=== TESTE CONTA ESPECIAL (CLASSE FILHA) ===");
        // Criando a conta especial. Repare que acessamos todos os dados da mãe normalmente.
        ContaEspecial contaCredito = new ContaEspecial("Marcia Ramos", 2002, 500.0f, 1000.0f);

        System.out.println("Titular da Conta Especial: " + contaCredito.getTitular());
        System.out.println("Saldo Base: R$" + contaCredito.getSaldo());
        System.out.println("Limite Adicional: R$" + contaCredito.getLimiteCredito());

        System.out.println("\n-- Teste de Saque na Conta Especial --");
        // Por enquanto, ela herdou a validação original.
        // Porém, o método de saque da classe pai não considera o limite de crédito da classe filha, como podemos mudar isso?
        contaCredito.sacar(1200.0f);
    }
}
