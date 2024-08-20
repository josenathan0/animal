package concrets;

import abstracts.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, double altura, double peso) {
        super(nome, "Gato", idade, "Terrestre", altura, peso, 4);
    }

    @Override
    public void comer() {
        quantidadeComida += 2;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 3.0;
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
    }
}