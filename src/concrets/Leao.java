package concrets;

import abstracts.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, int idade, double altura, double peso) {
        super(nome, "Leão", idade, "Terrestre", altura, peso, 4);
    }

    @Override
    public void comer() {
        quantidadeComida += 15;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 10.0;
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
    }
}