package modulo5_abstracao.animal;

public class Cachorro extends Animal {
    public Cachorro(String cor, String raca, double tamanho, double peso) {
        super(cor, raca, tamanho, peso);
    }

    public Cachorro(String raca){
        super(raca);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    public void caminhar(){

    }
}
