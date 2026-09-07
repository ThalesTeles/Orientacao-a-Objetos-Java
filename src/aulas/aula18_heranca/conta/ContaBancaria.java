package aulas.aula18_heranca.conta;

public class ContaBancaria {

    // Atributos privados
    private float saldo;
    private String titular;
    private int numero;

    // Construtor principal
    public ContaBancaria(String titular, int numero, float saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Getters para permitir leitura segura do estado por outras classes (inclusive filhas)
    public float getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumero() {
        return numero;
    }

    // Setters para permitir a modificação segura do estado de saldo por outras classes (inclusive filhas)
    public void sacar(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Operação negada: Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Operação negada: Valor de depósito inválido.");
        }
    }
}
