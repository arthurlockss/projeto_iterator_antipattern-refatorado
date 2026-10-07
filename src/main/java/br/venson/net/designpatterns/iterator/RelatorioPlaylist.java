package br.venson.net.designpatterns.iterator;

import java.util.List;

public class RelatorioPlaylist {

    public void resumo(Playlist playlist) {
        IteradorFaixa iterador = playlist.criarIterador();
        int totalSegundos = 0;
        int quantidade = 0;
        while (iterador.temProxima()) {
            Faixa faixa = iterador.proxima();
            totalSegundos += faixa.getDuracaoSegundos();
            quantidade++;
        }
        System.out.printf("Total de faixas: %d | duracao: %d min%n",
                quantidade, totalSegundos / 60);
    }
}
