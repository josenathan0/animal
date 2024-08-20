package concrets;

import abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, double altura, double peso) {
        super(nome, "Cachorro", idade, "Terrestre", altura, peso, 4);
    }

    @Override
    public void comer() {
        quantidadeComida += 5;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 5.0;
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
    }
}