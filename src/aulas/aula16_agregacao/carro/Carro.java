package aulas.aula16_agregacao.carro;

public class Carro {

    private String modelo;
    private int velocidadeAtual;
    
    // Relação de Agregação/Composição: O carro "TEM UM" motor
    private Motor motor;

    // Ao construir o carro, injetamos o motor nele
    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    public void ligarCarro() {
        System.out.println("Tentando ligar o " + this.modelo + "...");
        // Comunicação entre objetos (Delegação de responsabilidade)
        this.motor.darPartida();
    }

    public void acelerar(int incremento) {
        if (this.motor.isLigado()) {
            this.velocidadeAtual += incremento;
            System.out.println(this.modelo + " acelerou. Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Você precisa ligar o motor antes de acelerar!");
        }
    }
}
