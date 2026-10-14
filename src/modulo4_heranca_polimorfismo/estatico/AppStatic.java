package modulo4_heranca_polimorfismo.estatico;

public class AppStatic {
    public static void main(String[] args) {

        // 1. BLOCO STATIC
        // Na primeira vez que a classe ContaBancaria é usada, a JVM carrega
        // a classe e executa o bloco static dela UMA única vez, antes de
        // qualquer objeto existir. É ali que o nome do banco é lido.
        System.out.println("=== 1. Bloco static ===");
        System.out.println("Banco: " + ContaBancaria.getNomeDoBanco());
        System.out.println("Taxa inicial: " + ContaBancaria.getTaxaJurosAnual() + "%");

        // 2. CONTADOR COMPARTILHADO
        // Cada construtor lê proximoNumero, usa o valor e incrementa.
        // Como só existe UMA cópia na classe, a Márcia recebe 1001.
        System.out.println("\n=== 2. Contador compartilhado ===");
        ContaBancaria contaThales = new ContaBancaria("Thales Teles", 500.0f);
        ContaBancaria contaMarcia = new ContaBancaria("Márcia Ramos", 800.0f);

        System.out.println("Número da conta do Thales: " + contaThales.getNumero());
        System.out.println("Número da conta da Márcia: " + contaMarcia.getNumero());
        System.out.println("Próximo número disponível: " + ContaBancaria.proximoNumero);
        System.out.println("Total de contas criadas: " + ContaBancaria.getTotalContasCriadas());

        // 3. UMA CÓPIA SÓ, VISTA POR TODOS
        // Alterar a taxa pela classe muda para TODAS as contas ao mesmo tempo.
        // static não é "cada um tem uma cópia igual", é "só existe uma
        // cópia, e todo mundo aponta pra ela".
        // Método static se chama pelo nome da classe, não por um objeto.
        System.out.println("\n=== 3. Atributo static compartilhado ===");
        ContaBancaria.setTaxaJurosAnual(3.0f);
        System.out.println("Nova taxa para todas as contas: " + ContaBancaria.getTaxaJurosAnual() + "%");

        // 4. VALORES PADRÃO
        // Atributos static que não recebem valor são inicializados
        // automaticamente: 0 para números, null para objetos, false para boolean.
        System.out.println("\n=== 4. Valores padrão de atributos static ===");
        System.out.println("int: " + StaticClass.padraoInt);
        System.out.println("String: " + StaticClass.padraoString);
        System.out.println("boolean: " + StaticClass.padraoBool);
    }
}
