package concrets;

import abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "Peixe", idade, "Marinho", altura, peso);
    }

    @Override
    public void comer() {
        quantidadeComida += 1;
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
    }

    @Override
    public void nadar() {
        caminhoPercorrido += 1.5;
    }
}
