package aulas.aula02_arrays;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Aula2 {

    // ESCOPO DE VARIÁVEIS (ESCOPO DE CLASSE)
    //  Variáveis declaradas no escopo da classe (fora de qualquer método).
    //  Elas podem ser acessadas e modificadas por qualquer método desta classe.
    static int pontuacaoGlobal = 0;
    static final int PONTUACAO_MAXIMA = 9999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aluno = null;
        aluno = "Marcia";
        System.out.println("O nome do meu aluno é: " + Integer.toString(10));
        System.out.println("=== INICIANDO SISTEMA ===\n");

        // ESCOPO DE VARIÁVEIS (MÉTODO E BLOCO)
        System.out.println("--- 1. Escopo de Variáveis --- %s");
        System.out.printf("%n");

        // 'faseAtual' só existe dentro do 'main'
        int faseAtual = 1;

        if (faseAtual == 1) {
            // 'inimigosNaTela' só existe dentro deste 'if'
            int inimigosNaTela = 5;
            pontuacaoGlobal += 100;
            System.out.println("Fase: " + faseAtual + " | Inimigos: " + inimigosNaTela);
        }
        // Se tentássemos usar 'inimigosNaTela' aqui fora, daria erro de compilação.
        System.out.println("Pontuação Global após a fase 1: " + pontuacaoGlobal + "\n");


        // ARRAYS (VETORES)
        System.out.println("--- 2. Arrays ---");

        // Declaração e inicialização direta de um array com as notas de uma turma
        double[] notasLaboratorio = {8.5, 9.0, 7.2, 10.0, 6.5};



        // Declaração com tamanho fixo e alocação posterior
        String[] navesDisponiveis = new String[3];
        navesDisponiveis[0] = "Interceptor";
        navesDisponiveis[1] = "Destroyer";
        navesDisponiveis[2] = "Cruiser";

        // Iterando sobre um array com um loop 'for' tradicional
        System.out.print("Notas registradas no sistema: ");
        for (int i = 0; i < notasLaboratorio.length; i++) {
            System.out.print(notasLaboratorio[i] + " ");
        }
        System.out.println();

        // Iterando com 'for-each'
        System.out.print("Frota disponível: ");
        for (String nave : navesDisponiveis) {
            System.out.print("[" + nave + "] ");
        }
        System.out.println("\n");


        // TÓPICO 3: FUNÇÕES (MÉTODOS)
        System.out.println("--- 3. Funções ---");

        // Chamando uma função que não retorna valor (void)
        exibirCabecalhoRelatorio("Desempenho da Frota");

        // Chamando uma função que retorna um valor, passando um array como parâmetro
        double mediaTurma = calcularMedia(notasLaboratorio);
        System.out.printf("A média calculada das notas é: %.2f\n\n", mediaTurma);


        // TÓPICO 4: RECURSIVIDADE
        System.out.println("--- 4. Recursividade ---");

        // Exemplo: Fatorial
        int numeroParaFatorial = 5;
        int resultadoFatorial = calcularFatorial(numeroParaFatorial);
        System.out.println("O fatorial de " + numeroParaFatorial + "! é: " + resultadoFatorial);

        sc.close();
    }

    // IMPLEMENTAÇÃO DAS FUNÇÕES(Métodos)

    /**
     * Função simples sem retorno (void).
     */
    public static void exibirCabecalhoRelatorio(String titulo) {
        System.out.println("------------------------------------------------");
        System.out.println(">> RELATÓRIO: " + titulo.toUpperCase());
        System.out.println("------------------------------------------------");
    }

    /**
     * Função que recebe um array como parâmetro e retorna um valor double.
     */
    public static double calcularMedia(double[] valores) {
        if (valores.length == 0) return 0.0; // Evita divisão por zero

        double soma = 0.0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.length;
    }

    /**
     * Função RECURSIVA clássica: Fatorial.
     * n! = n * (n-1)!
     */
    public static int calcularFatorial(int n) {
        //Caso Base
        if (n == 0 || n == 1) {
            return 1;
        }
        // Passo Recursivo
        return n * calcularFatorial(n - 1);
    }
}
