package modulo5_abstracao.animal;

public class Gato extends Animal {

    public Gato(String cor, String raca, double tamanho, double peso) {
        super(cor, raca, tamanho, peso);
    }

    public Gato(String raca){
        super(raca);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
}
