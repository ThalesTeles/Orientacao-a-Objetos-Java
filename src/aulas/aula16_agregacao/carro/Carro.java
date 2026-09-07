package aulas.aula16_agregacao.carro;

public class Carro{
    public int portas;
    public int velocidade;
    public Motor motor;

    public Carro(int portasDoConstrutor){

    }

    public void girar_chave(){
        motor.dar_partida();
    }

    public void acelerar(int valor) {
        velocidade += valor;
    }
}
