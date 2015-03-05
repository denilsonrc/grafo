package io.github.jnefoussi;

/**
 *
 * @author roben
 */
public class ListaNosPossiveis {

    //Atributos
    private Celula primeira;
    private Celula ultima;
    private int quantidade;

    //Construtor sem Objeto
    public ListaNosPossiveis() {
    }

    //Construtor recebendo Objeto
    public ListaNosPossiveis(Object elementoPassado) {
        Celula novo = new Celula(elementoPassado);
        this.primeira = novo;
        this.ultima = novo;
        this.quantidade = 1;
    }

    //insere um novo objeto na lista
    public void adiciona(Object elementoPassado) {
        Celula novo = new Celula(elementoPassado);
        novo.setProxima(this.primeira);
        this.primeira = novo;
        if (this.quantidade == 0) {
            this.ultima = novo;
        }

        this.quantidade++;
    }

    public void adicionaFim(Object elemento) {
        if (this.quantidade == 0) {
            this.adiciona(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.quantidade++;
        }
    }

    //adiciona em uma posição expecifica
    public void adiciona(int posicao, Object elementoPassado) {
    }

    //pega o objeto da posição
    public Object pega(int posicao) {
        if (posicao >= quantidade) {
            return null;
        }
        Celula temp = this.primeira;
        for (int i = 1; i <= posicao; i++) {
            temp = temp.getProxima();
        }
        return temp;
    }

    public void remove(int posicao) {
        if (posicao < quantidade) {

            Celula temp = this.primeira;
            Celula temp_ant = null;
            Celula temp_prox;
            for (int i = 1; i <= posicao; i++) {
                temp_ant = temp;
                temp = temp.getProxima();

            }
            this.quantidade--;
            if (temp == this.primeira) {
                if (temp == this.ultima) {
                    this.primeira = null;
                    this.ultima = null;
                    return;
                }
                this.primeira = temp.getProxima();
                return;
            }
            if (temp == this.ultima) {
                this.ultima = temp_ant;
            }
            temp_prox = temp.getProxima();
            temp_ant.setProxima(temp_prox);
        }
    }


    public int tamanho() {
        return this.quantidade;
    }

    //retorna se o objeto esta na lista
    public boolean contem(Object o) {
        return false;
    }

    //getter setters
    public void setPrimeira(Celula prim) {
        this.primeira = prim;
    }

    public void setUltima(Celula fim) {
        this.ultima = fim;
    }

    

    
}
