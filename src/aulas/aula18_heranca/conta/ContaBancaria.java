package aulas.aula18_heranca.conta;

public class ContaBancaria {
    private float saldo;
    private String tipo;

    public ContaBancaria(String tipo, float saldo){
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public ContaBancaria(){}



    public void sacar(float valor) {
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("O saque realizado foi de: " + valor);
            System.out.println("Saldo atual:" + this.saldo);
        }
        else
            System.out.println("O valor é maior que o saldo atual");
    }

    public float depositar(float valor){
        if (valor >= 0){
            this.saldo += valor;

        } else
            System.out.println("O valor inválido para o deposito");
        return this.saldo;
    }

    static void main(){
        System.out.println("====== CONTA CORRENTE ======");
        ContaBancaria conta = new ContaBancaria("Corrente", 100);
        conta.sacar(100);
        System.out.println("O valor depositado foi de: " + conta.depositar(10));

        System.out.println("====== CONTA ESPECIAL (1======");
        ContaBancaria contaEspecial = new ContaBancaria("Especial", 1000);
        contaEspecial.sacar(500);

        conta.saldo = -199999;
        System.out.println("Saldo atual de conta: " + conta.saldo);

    }
}
