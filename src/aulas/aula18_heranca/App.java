import aulas.aula16_agregacao.carro.Carro;
import conta.ContaBancaria;

public class App {
    void main(){
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(10); // Por que não estou

        ContaBancaria conta2 = new ContaBancaria();
        conta2.sacar(-99);

        Carro c1 = new Carro(2);

        System.out.println("Conta1.saldo: " + conta1);
        System.out.println("Conta2.saldo: " + conta2);
    }
}
