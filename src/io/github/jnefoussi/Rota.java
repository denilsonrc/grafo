package io.github.jnefoussi;

/**
 *
 * @author Jonathan
 */
public class Rota {
    
    //atributos
    private int origem;
    private int destino;
    private int peso;
    
    //Consturtor
    public Rota (int origem, int destino, int peso){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }
    
    //Getters e Setters

    /**
     * @return the origem
     */
    public int getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(int origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public int getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(int destino) {
        this.destino = destino;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
