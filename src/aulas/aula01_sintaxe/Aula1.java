package aulas.aula01_sintaxe;

import java.util.Scanner;

public class Aula1 {

    /*
    * O QUE É O @SuppressWarnings("unused")?
    * O compilador do Java é extremamente rigoroso e gera alertas (warnings) para
    * códigos "mortos" ou variáveis declaradas que nunca são utilizadas, o que em
    * um sistema real geralmente indica um erro estrutural.
    * Como este é um código puramente pedagógico onde declaramos variáveis apenas
    * para demonstrar a sintaxe, usamos esta anotação para dizer ao compilador
    * ignorar estes erros de variáveis nunca utilizadas"
    */
    @SuppressWarnings("unused")
    static void main(String[] args) {
        System.out.println("Olá Mundo");

        // TIPOS
        int idade = 20;
        double preco = 19.90;
        float altura = 1.75f; //auto cast
        String nome1 = "Thales";
        String nome2;

        byte nivel = 10;
        short estoque = 5000;
        long estrelas = 10000000000L;
        char inicial = 'A';

        // ENTRADA E SAIDA I/O
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome1 = scanner.next();
        nome2 = scanner.next();
        System.out.printf("Nome1 : %s\nNome2: %s\n", nome1, nome2);
        System.out.println("Nome1: " + nome1 + ",Nome2 : " + nome2);

        // ESTRUTURAS DE CONDIÇÃO
        if (idade >= 18) {
            System.out.println("Você é maior de idade. Pode dirigir.");
            String nome3 = "joao";
            if(idade >= 65){
                System.out.println("O seu voto é optativo");
            }
        }
        else if (idade >= 16) {
            System.out.println("Você não pode dirigir, mas já pode votar.");
        } else {
            System.out.println("Você é muito jovem para dirigir e votar.");
        }

        // switch...case

//        comando = ["mover", "frente", 10]
//
//        match comando:
//          case ["parar"]:
//              print("Parando o robô.")
//          case ["mover", "frente", distancia]:
//              print(f"Movendo para frente {distancia} metros")
//          case ["mover", "tras", distancia] if distancia < 5:
//              print("Recuo curto.")
//          case _:
//             print("Comando não reconhecido.")

        System.out.println("Digita um data(1-7)");
        int diaDaSemana =  scanner.nextInt();
        scanner.nextLine();
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }

        // ESTRUTURAS DE REPETIÇÃO

            // while
        int contador = 3;

        while (contador < 3) {// 0 1 2 3
            System.out.println("Contagem: " + contador);
            contador = contador + 1;
        }

        int tentativas = 1;

            // do...while
        do {
            System.out.println("Tentativa de conexão número: " + tentativas);
            tentativas++;
        } while (tentativas <= 3);

            // for
        for (int i = 2; i < 5; i+=2) {
            System.out.println("Execução " + i);
        }
        String[] dias = {"Domingo","Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int[] numeros = {1, 2, 3, 4};
        for (String f : dias) {
            System.out.println("Hoje é " + f);
        }


        /*
        * POR QUE FECHAR O SCANNER? (scanner.close())
        * No Java, o Garbage Collector (Coletor de Lixo) limpa a memória automaticamente,
        * mas ele NÃO gerencia recursos externos do Sistema Operacional, como conexões de rede,
        * arquivos abertos ou canais de entrada de dados (como o System.in usado pelo Scanner).
        * Se não fecharmos o Scanner explicitamente, criamos um "resource leak" (vazamento de recursos),
        * mantendo o canal do SO preso desnecessariamente após o uso.
        */
        scanner.close();
    }
}
