package modulo5_abstracao.animal;

public class Papagaio extends Animal{

    public Papagaio(String cor, String raca, double tamanho, double peso) {
        super(cor, raca, tamanho, peso);
    }

    public Papagaio(String raca){
        super(raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Caá Caá");
    }

}
