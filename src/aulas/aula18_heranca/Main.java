package aulas.aula18_heranca.conta;

public class Main {
    public static void main(String[] args) {

        // Repare: a VARIÁVEL é do tipo ContaBancaria (tipo da referência),
        // mas o OBJETO real é ContaEspecial (tipo da instância).
        // Isso é permitido por herança (ContaEspecial "é uma" ContaBancaria).
        ContaBancaria contaPadrao = new ContaBancaria("Thales Teles", 1001, 500.0f);
        ContaBancaria contaCredito = new ContaEspecial("Márcia Ramos", 2002, 500.0f, 1000.0f);

        System.out.println("--- Testando saque na conta padrão ---");
        contaPadrao.sacar(600.0f); // saldo insuficiente -> negado

        System.out.println("\n--- Testando saque na conta especial ---");
        // Mesma chamada de método, sacar(), mas comportamento DIFERENTE:
        // Java decide em tempo de EXECUÇÃO qual versão de sacar() rodar,
        // olhando o tipo REAL do objeto (ContaEspecial), não o tipo da variável.
        contaCredito.sacar(600.0f); // usa o limite de crédito -> permitido

        System.out.println("\n--- Pergunta para a aluna ---");
        System.out.println("Por que 'contaCredito.sacar(600)' funcionou e");
        System.out.println("'contaPadrao.sacar(600)' não, se as duas variáveis");
        System.out.println("são declaradas como ContaBancaria?");
    }
}
