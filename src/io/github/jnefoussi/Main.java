package io.github.jnefoussi;

/**
 * @author Jonathan J Nefoussi
 */
import io.github.jnefoussi.Grafo;

public class Main {

    public static void main(String[] args) {

        try {

            Grafo grafo = new Grafo(5);

            //Arestas definidas em aula
            grafo.insereAresta(0, 1, 2); //A-B Peso 2
            grafo.insereAresta(0, 4, 1); //A-E Peso 1 
            grafo.insereAresta(0, 2, 1); //A-C Peso 1
            grafo.insereAresta(1, 0, 2); //B-A Peso 2
            grafo.insereAresta(1, 4, 3); //B-E Peso 3
            grafo.insereAresta(1, 2, 3);
            grafo.insereAresta(1, 3, 4);
            grafo.insereAresta(2, 0, 1);
            grafo.insereAresta(2, 1, 3);
            grafo.insereAresta(2, 3, 2);
            grafo.insereAresta(3, 2, 2);
            grafo.insereAresta(3, 1, 4);
            grafo.insereAresta(3, 4, 1);
            grafo.insereAresta(4, 0, 1);
            grafo.insereAresta(4, 1, 3);
            grafo.insereAresta(4, 3, 1);
            
            grafo.imprimeMatriz(grafo.getMatrizDePesos());

        } catch (Exception ex) {
            if (ex.getMessage() == null) {
                System.out.println("Ocorreu um erro de " + ex + " no main");
            } else {
                System.out.println(ex.getMessage());
            }
        }

    }

}
