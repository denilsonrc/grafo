package io.github.jnefoussi;

/**
 * @author Jonathan J Nefoussi
 */
import io.github.jnefoussi.Grafo;

public class Main {

    public static void main(String[] args) {

        try {

            Grafo grafo = new Grafo(5);
            ListaVertices lr = new ListaVertices();

            //Arestas definidas em aula
            grafo.insereAresta(0, 1, 2, lr); //A-B Peso 2
            grafo.insereAresta(0, 4, 1, lr); //A-E Peso 1 
            grafo.insereAresta(0, 2, 1, lr); //A-C Peso 1
            grafo.insereAresta(1, 0, 2, lr); //B-A Peso 2
            grafo.insereAresta(1, 4, 3, lr); //B-E Peso 3
            grafo.insereAresta(1, 2, 3, lr);
            grafo.insereAresta(1, 3, 4, lr);
            grafo.insereAresta(2, 0, 1, lr);
            grafo.insereAresta(2, 1, 3, lr);
            grafo.insereAresta(2, 3, 2, lr);
            grafo.insereAresta(3, 2, 2, lr);
            grafo.insereAresta(3, 1, 4, lr);
            grafo.insereAresta(3, 4, 1, lr);
            grafo.insereAresta(4, 0, 1, lr);
            grafo.insereAresta(4, 1, 3, lr);
            grafo.insereAresta(4, 3, 1, lr);

            grafo.imprimeMatriz(grafo.getMatrizDePesos());
            
            lr.imprimeLista(lr);
            
            System.out.print("\nTamanho da rota: " +lr.calculaRota(lr,1)+"\n\n");

        } catch (Exception ex) {
            if (ex.getMessage() == null) {
                System.out.println("Ocorreu um erro de " + ex + " no main");
            } else {
                System.out.println(ex.getMessage());
            }
        }

    }

}
