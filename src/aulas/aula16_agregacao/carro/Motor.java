package aulas.aula16_agregacao.carro;

@SuppressWarnings("unused")
public class Motor {
    private String tipo;
    private int cilindros;
    private boolean ligado;

    public Motor(String tipo, int cilindros) {
        this.tipo = tipo;
        this.cilindros = cilindros;
        this.ligado = false;
    }

    public void darPartida() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Vrummm! Motor " + this.tipo + " ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public boolean isLigado() {
        return this.ligado;
    }
}
