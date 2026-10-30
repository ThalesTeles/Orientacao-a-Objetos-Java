package modulo4_heranca_polimorfismo.estatico;
import java.util.Scanner;

@SuppressWarnings("resource")
public class ContaBancaria {

    // Atributos STATIC
    protected static int proximoNumero;
    private static int totalContasCriadas;
    private static String nomeDoBanco;
    private static float taxaJurosAnual; // em %

    static {
        System.out.println("INICIALIZANDO SISTEMA...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do banco: ");
        nomeDoBanco = sc.nextLine();

        proximoNumero = 1000;
        totalContasCriadas = 0;
        taxaJurosAnual = 2.5F;
    }

    // Atributos de instância
    private float saldo;
    private String titular;
    private final int numero; // final

    public ContaBancaria(){
        this.numero = 0;
    }

    public ContaBancaria(String titular, float saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

        // Cada CONSTRUTOR lê o contador compartilhado, usa o valor
        // e o incrementa para a próxima conta que for criada.
        this.numero = proximoNumero;

        proximoNumero++;
        totalContasCriadas++;
    }

    public boolean sacar(float valor) {
        if (valor <= 0 || valor > this.saldo) {
            System.out.println("Saque inválido para " + this.titular + ".");
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

    public static int getTotalContasCriadas(){
        return totalContasCriadas;
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
