package modulo4_heranca_polimorfismo.estatico;

public class AppStatic {
    public static void main(String[] args) {

        System.out.println("Banco: " + ContaBancaria.getNomeDoBanco());
        System.out.println("Taxa inicial: " + ContaBancaria.getTaxaJurosAnual() + "%");

        ContaBancaria.setTaxaJurosAnual(3.0f);

        ContaBancaria contaThales = new ContaBancaria("Thales Teles", 500.0f);
        ContaBancaria contaMarcia = new ContaBancaria("Márcia Ramos", 800.0f);

        // Quais a saída destas linhas?
        System.out.println("Número da conta do Thales: " + contaThales.getNumero());
        System.out.println("Número da conta da Márcia: " + contaMarcia.getNumero()); 

        System.out.println("Taxa vista pelo Thales: " + contaThales.getTaxaJurosAnual() + "%");
        System.out.println("Taxa vista pela Márcia: " + contaMarcia.getTaxaJurosAnual() + "%");
        // As duas imprimem 3.0 mesmo a conta do Thales tendo sido
        // "criada" logicamente antes da chamada a setTaxaJurosAnual().
        // static não é "cada um tem uma cópia igual", é "só existe
        // uma cópia, e todo mundo aponta pra ela".
    }
}
