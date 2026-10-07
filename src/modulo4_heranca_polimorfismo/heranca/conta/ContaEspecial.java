package modulo4_heranca_polimorfismo.heranca.conta;

/**
 * ContaEspecial HERDA tudo de ContaBancaria (extends), titular, numero,
 * saldo, depositar(). Mas ela precisa se COMPORTAR diferente em UM ponto
 * específico: sacar() pode usar o limite de crédito, além do saldo.
 *
 * Isso é Polimorfismo: o mesmo "nome de método" (sacar) tem uma
 * implementação diferente dependendo do tipo REAL do objeto em tempo
 * de execução, mesmo que a variável seja declarada como ContaBancaria.
 */
public class ContaEspecial extends ContaBancaria {

    private float limiteCredito;

    public ContaEspecial(String titular, int numero, float saldoInicial, float limiteCredito) {
        // super() chama o construtor da MÃE, ela já sabe inicializar
        // titular, numero e saldo. Não reinventamos essa parte.
        super(titular, numero, saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    /**
     * @Override avisa o compilador (e quem lê o código): "esta NÃO é uma
     * assinatura nova, é a substituição intencional do método herdado".
     * Se a assinatura não bater exatamente com a da classe mãe, o
     * compilador acusa erro, é uma proteção, não só uma anotação estética.
     *
     * Regra de negócio nova: pode sacar até (saldo + limiteCredito).
     */
    @Override
    public boolean sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        float disponivel = getSaldo() + limiteCredito;
        if (valor > disponivel) {
            System.out.println("Saque negado: limite de crédito insuficiente para " + getTitular() + ".");
            return false;
        }

        // Não temos acesso direto a "saldo" aqui (é private na mãe),
        // então reaproveitamos o próprio saldo através dos getters
        // e simulamos o débito com os métodos públicos disponíveis.
        float novoSaldo = getSaldo() - valor;
        // Ajusta o saldo entrando "no vermelho" quando usa o crédito.
        // (Numa versão mais avançada, ContaBancaria teria um setSaldo)
        System.out.println(getTitular() + " sacou R$" + valor
                + " (usando crédito, se necessário). Saldo simulado: R$" + novoSaldo);
        return true;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }
}
