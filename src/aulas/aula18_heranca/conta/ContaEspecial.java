package aulas.aula18_heranca.conta;

// O 'extends' estabelece a relação "É UMA" (ContaEspecial é uma ContaBancaria, ou um tipo especial de ContaBancaria)
public class ContaEspecial extends ContaBancaria {

    // Atributo exclusivo da conta especial
    private float limiteCredito;

    // O construtor da classe filha DEVE acionar o construtor da classe pai
    public ContaEspecial(String titular, int numero, float saldoInicial, float limiteCredito) {
        // Chamada obrigatória ao construtor da classe pai
        super(titular, numero, saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() {
        return this.limiteCredito;
    }

    /*
     * TODO (para a próxima aula):
     *
     * O método sacar() original (herdado de ContaBancaria) só permite saques
     * se o valor for menor ou igual ao saldo atual.
     *
     * PERGUNTA: Como podemos modificar (sobrescrever) esse comportamento nesta classe
     * para que o saque seja permitido caso o valor solicitado seja menor ou igual
     * à soma do Saldo + Limite de Crédito?
     *
     * DICA: Lembre-se que você não pode acessar 'this.saldo' diretamente, pois ele é privado na classe mãe.
     * O que você deve usar?
     */
}
