package aulas.aula18_heranca.conta;

/**
 * Classe base do domínio bancário.
 */
public class ContaBancaria {

    private float saldo;
    private String titular;
    private final int numero;

    public ContaBancaria(String titular, int numero, float saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    /**
     * Comportamento PADRÃO de saque: só permite sacar até o saldo disponível.
     * Toda subclasse HERDA este comportamento automaticamente.
     * Se uma subclasse precisar de uma regra diferente, ela pode
     * SOBRESCREVER este método com @Override (ver ContaEspecial).
     */
    public boolean sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para " + titular + ".");
            return false;
        }
        saldo -= valor;
        System.out.println(titular + " sacou R$" + valor + ". Saldo atual: R$" + saldo);
        return true;
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.println(titular + " depositou R$" + valor + ". Saldo atual: R$" + saldo);
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }
}
