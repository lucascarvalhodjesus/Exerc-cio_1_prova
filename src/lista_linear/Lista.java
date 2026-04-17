package lista_linear;

public class Lista {
    public int[] inserirOrdenadoDecrescente(int[] lista, int novoValor, int indice){
        for(int i = lista.length - 1; i > indice; i--){
            lista[i] = lista[i - 1];
        }
        return lista;
    }
}
