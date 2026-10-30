package modulo5_abstracao.animal;

public abstract class Animal {
    protected String cor;
    protected String raca;
    protected double tamanho;
    protected double peso;

    public Animal(String cor, String  raca, double tamanho, double peso){
        this.cor = cor;
        this.raca = raca;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public Animal(String  raca){
        this.cor = "";
        this.raca = raca;
        this.tamanho = 0;
        this.peso = 0;
    }

    public abstract void emitirSom();

    @Override
    public String toString(){
        return "Cor: " + this.cor +
            "| Raca: " + this.raca +
            "| Tamanho: " + Double.toString(this.tamanho) +
            "| Peso: " + Double.toString(this.peso);
    }
}
