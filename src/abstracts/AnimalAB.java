package abstracts;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    protected int quantidadeComida;
    protected double caminhoPercorrido;
    protected int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadeComida = 0;
        this.caminhoPercorrido = 0.0;
        this.horasDormidas = 0;
    }

    @Override
    public abstract void comer();
    @Override
    public abstract void moverse();
    @Override
    public abstract void dormir();
}
