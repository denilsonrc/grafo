package io.github.jnefoussi;

/**
 *
 * @author Roben C Lunardi
 */
public class Celula {
    
    //Atributos
    private Celula proxima;
    private Object elemento;

    //Construtor
    public Celula(Celula proximaPassado, Object elementoPassado) {
        this.proxima = proximaPassado;
        this.elemento = elementoPassado;
    }

    //Construtor
    public Celula(Object elementoPassado) {
        this.elemento = elementoPassado;
    }

    //Getters e Setters
    public void setProxima(Celula proximaPassado) {
        this.proxima = proximaPassado;
    }

    public Celula getProxima() {
        return this.proxima;
    }

    public Object getElemento() {
        return this.elemento;
    }
}
