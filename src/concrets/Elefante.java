package concrets;

import abstracts.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, double altura, double peso) {
        super(nome, "Elefante", idade, "Terrestre", altura, peso, 4);
    }

    @Override
    public void comer() {
        quantidadeComida += 100;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 1.5;
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
    }
}
