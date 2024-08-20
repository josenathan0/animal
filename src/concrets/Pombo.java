package concrets;

import abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, double altura, double peso, double envergaduraAssa) {
        super(nome, "Pombo", idade, "Aéreo", altura, peso, 2, envergaduraAssa);
    }

    @Override
    public void comer() {
        quantidadeComida += 1;
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 7;
    }

    @Override
    public void voar() {
        caminhoPercorrido += 15.0;
    }
}
