package io.github.jnefoussi;

/**
 *
 * @author roben
 */
public class ListaVertices {

    //Atributos
    private Celula primeira;
    private Celula ultima;
    private int quantidade;

    //Construtor sem Objeto
    public ListaVertices() {
    }

    //Construtor recebendo Objeto
    public ListaVertices(Object elementoPassado) {
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

//    //pega objeto pelo nome
//    public Object pegaNome(String nome) {
//
//        Celula temp = this.primeira;
//        Aluno a1;
//
//        for (int i = 0; i < this.quantidade; i++) {
//            a1 = (Aluno) temp.getElemento();
//            if (nome.equals(a1.getNome())) {
//
//                return a1;
//            }
//            temp = temp.getProxima();
//        }
//        return null;
//    }
    //remove da lista pela posição
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

//    //remove por nome
//    public void removeNome(String nome) {
//
//        Aluno a1 = new Aluno();
//        Celula temp = this.primeira;
//        Celula temp_ant = null;
//        Celula temp_prox;
//        for (int i = 0; i < this.quantidade; i++) {
//
//            temp_ant = temp;
//
//            a1 = (Aluno) temp.getElemento();
//            if (nome.equals(a1.getNome())) {
//
//                break;
//            }
//            temp = temp.getProxima();
//
//        }
//        if (!nome.equals(a1.getNome())) {
//            return;
//        }
//        this.quantidade--;
//        if (temp == this.primeira) {
//            if (temp == this.ultima) {
//                this.primeira = null;
//                this.ultima = null;
//                return;
//            }
//            this.primeira = temp.getProxima();
//            return;
//        }
//        if (temp == this.ultima) {
//            this.ultima = temp_ant;
//        }
//        temp_prox = temp.getProxima();
//        temp_ant.setProxima(temp_prox);
//    }
    //retorna o tamanho da lista
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

    public void imprimeLista(ListaVertices lr) {
        System.out.println("\n   Rotas");
        System.out.println("SRC DST SZ");
        for (int i = 0; i < lr.tamanho(); i++) {
            Celula pegada = (Celula) lr.pega(i);
            Vertice ax = (Vertice) pegada.getElemento();

            System.out.println(" " + ax.getOrigem() + "   " + ax.getDestino() + "   " + ax.getPeso());

        }
        System.out.println("\nTamanho da lista de Rotas: " + lr.tamanho());
    }

    public int calculaRota(ListaVertices lr, int inicioRota) {
        //Desconsiderar esse método para calcular a rota
        int tamanhoRota = 0;
        
        for (int i = 0; i < lr.tamanho(); i++) {
            Celula pegada = (Celula) lr.pega(i);
            Vertice ax = (Vertice) pegada.getElemento(); //Estrutura da Rota SRC DST SZ

            if (ax.getOrigem() == inicioRota) {
               
                tamanhoRota += ax.getPeso();
                inicioRota++;
                //noOrigem tem q ir pra listas de nós visitas
                
                
            }

//            tamanhoRota += ax.getPeso();
        }
        return tamanhoRota;
    }
    
        
    }
    
 
