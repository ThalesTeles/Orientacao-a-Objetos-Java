package aulas.aula07_classes.personagem;

public class Personagem {
    String nome;
    String roupa;
    private int vida;

    /* Construtores... */
    public Personagem(String nome, String roupa, int vida) {
        this.nome = nome;
        this.roupa = roupa;
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        if(vida >= 0) {
            this.vida = vida;
        }
    }
}
