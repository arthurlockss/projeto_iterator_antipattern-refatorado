package br.venson.net.designpatterns.iterator;

import java.util.List;

public class Recomendador {

    public void sugerirFavoritas(Playlist playlist) {
        IteradorFaixa iterador = playlist.criarIterador();
        System.out.println("Favoritas:");
        while (iterador.temProxima()) {
            Faixa faixa = iterador.proxima();
            if (faixa.isFavorita()) {
                System.out.println("  * " + faixa);
            }
        }
    }
}
