import java.util.ArrayList;
import java.util.Scanner;
void main(){

    Animal c1 = new Cachorro("Marrom", "Poodle", 0.9, 80);
    Animal g1 = new Gato("Laranja", "Siames", 0.8, 80);
    Animal p1 = new Papagaio("Verde", "Normal", 0.5, 80);

    // Para conseguir chamar este método, implementado apenas na classe filha, p
    // precisamos alterar o tipo da variável para o da classe filha Cachorro
    // Cachorro c1 = new Cachorro("Marrom", "Poodle", 0.9, 80);
    // c1.caminhar();
    Animal[] vetorAnimal = {c1, g1, p1};
    ArrayList<Animal> listAnimals = new ArrayList<Animal>();

    // System.out.println(c1.toString());
    // System.out.println(g1.toString());
    // System.out.println(p1.toString());
    // c1.emitirSom();
    // g1.emitirSom();
    // p1.emitirSom();
    for (Animal animal : vetorAnimal) {
        System.out.println(animal.toString());
        animal.emitirSom();
        System.out.println("===============");
    }

    while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual animal você quer criar: ");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Papagaio");

        String opcao = sc.next();
        String raca;
        switch (opcao) {
            case "1":
                System.out.println("Digite o nome da raca:");
                raca = sc.next();
                listAnimals.add(new Cachorro(raca));
                break;

            case "2":
                System.out.println("Digite o nome da raca:");
                raca = sc.next();
                listAnimals.add(new Gato(raca));
                break;

            case "3":
                System.out.println("Digite o nome da raca:");
                raca = sc.next();
                listAnimals.add(new Papagaio(raca));
                break;

            default:
                System.out.println("Digite uma opção válida");
                break;
        }

        for (Animal animal : listAnimals) {
            System.out.println(animal.toString());
            animal.emitirSom();
            System.out.println("===============");
        }
    }
}
