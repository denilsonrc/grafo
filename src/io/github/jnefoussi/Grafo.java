package io.github.jnefoussi;

/**
 * @author Diego Pedro - Fonte: https://sites.google.com/site/diegopedro/grafos
 * A implementação inicial deste código foi feita pelo @author e utilizada como
 * base para implementar uma matriz de de grafos e suas rotas para aula de Redes
 * de Computadores II.
 */
public class Grafo {

    public final int NUMERO_DE_NODOS;
    public final int OO = 2147483647;//infinito 
    private Integer[][] matrizDePesos;

    /**
     * Método construtor da Classe Grafo: Constrói o Grafo com "n" nós, onde n é
     * passado como parâmetro.
     */
    public Grafo(int numeroDeNodos) throws Exception {

        if (numeroDeNodos <= 0) {
            throw new Exception("o numero de nodos deve ser maior que 0");
        }
        NUMERO_DE_NODOS = numeroDeNodos;
        try {
            setMatrizDePesos(criaMatrizInt(numeroDeNodos, 0));
        } catch (Exception ex) {
            if (ex.getMessage() == null) {
                System.out.println("Ocorreu um erro de " + ex + " no construtor");
            } else {
                System.out.println(ex.getMessage());
            }
        }

    }//GrafoConstrutorFinal

    /**
     * Método que cria a matriz com tamanho "n" onde n define o tamanho x e y da
     * matriz.
     */
    public Integer[][] criaMatrizInt(int tamanho, Integer valorPadrao) throws Exception {

        if (tamanho <= 1) {
            throw new Exception("o tamanho deve ser maior que 1");
        }
        //como o grafo vai considerar valores de 1-n 
        Integer matriz[][] = new Integer[tamanho + 1][];
        try {
            for (int i = 0; i < tamanho; i++) {
                matriz[i] = new Integer[tamanho + 1];
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] = valorPadrao;
                }
            }
        } catch (Exception ex) {
            if (ex.getMessage() == null) {
                System.out.println("Ocorreu um erro de " + ex + " em criaMatrizInt");
            } else {
                System.out.println("Erro ao criar a matriz");
            }
        }
        return matriz;
    }//CriaMatrizIntFinal

    /**
     * Percorre a matriz imprimindo todas as posições existentes.
     */
    public void imprimeMatriz(Integer matriz[][]) throws Exception {

        if (matriz == null) {
            throw new Exception("a matriz e nula");
        }

        if (matriz[0] == null) {
            throw new Exception("a matriz nao foi inicializada");
        }

        int tamanho = getNUMERO_DE_NODOS();

        System.out.println("\nMatriz do grafo");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("[" + matriz[i][j] + "] ");
            }
            System.out.printf("\n");
        }

    }//ImprimeMatrizFinal

    /**
     * Insere a aresta entre os nós do grafo O valor dentro da posição x,y da
     * matriz é o peso da aresta A posição x,y são os nós interligado.
     */
    public void insereAresta(int A, int B, int peso, ListaRotas lista) throws Exception {
        try {
            if (A < 0 || B < 0
                    || A > getNUMERO_DE_NODOS()
                    || B > getNUMERO_DE_NODOS()) {
                throw new Exception("um dos vertices sao invalidos");
            }
            if (peso == 0) {
                throw new Exception("nao eh permitido peso negativo");
            }

            matrizDePesos[A][B] = peso;
            Rota r = new Rota(A, B, peso);
//            lista.adiciona(r);
            lista.adicionaFim(r);
        } catch (Exception ex) {
            if (ex.getMessage() == null) {
                System.out.println("Ocorreu um erro de " + ex + " insertArc");
            } else {
                System.out.println("Erro na insecao de arco");
            }
        }
    }//InsereArestaFinal

    //Getters e Setters
    public Integer[][] getMatrizDePesos() {
        return this.matrizDePesos;
    }

    public void setMatrizDePesos(Integer[][] pesos) {
        this.matrizDePesos = pesos;
    }

    public int getNUMERO_DE_NODOS() {
        return NUMERO_DE_NODOS;
    }

}//GrafoClasseFinal
