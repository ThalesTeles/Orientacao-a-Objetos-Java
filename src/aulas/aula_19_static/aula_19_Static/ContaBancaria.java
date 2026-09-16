package aulas.aula19_static.conta;

public class ContaBancaria {

    // Atributos STATIC
    private static int proximoNumero = 1000;
    private static String nomeDoBanco = "Banco Caixa Real";
    private static float taxaJurosAnual = 2.5f; // em %

    // Atributos de instância
    private float saldo;
    private String titular;
    private final int numero; // final

    public ContaBancaria(String titular, float saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

        // Cada CONSTRUTOR lê o contador compartilhado, usa o valor
        // e o incrementa para a próxima conta que for criada.
        this.numero = proximoNumero;
        proximoNumero++;
    }

    public boolean sacar(float valor) {
        if (valor <= 0 || valor > this.saldo) {
            System.out.println("Saque inválido para " + titular + ".");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Getters de INSTÂNCIA
    public float getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumero() {
        return this.numero;
    }

    // Getter/setter STATIC
    // Não usamos "this" aqui, porque não há um objeto envolvido.
    public static String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public static void setTaxaJurosAnual(float novaTaxa) {
        taxaJurosAnual = novaTaxa;
    }

    public static float getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
