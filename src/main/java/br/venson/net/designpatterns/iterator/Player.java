package br.venson.net.designpatterns.iterator;

import java.util.List;
import java.util.Collections;

public class Player {

    public void tocarTudo(Playlist playlist) {
        IteradorFaixa iterador = playlist.criarIterador();
        while (iterador.temProxima()) {
            System.out.println("Tocando: " + iterador.proxima());
        }
    }

    public void tocarEmbaralhado(Playlist playlist) {
        // Coleta as faixas em uma lista local para nao alterar a ordem original
        java.util.List<Faixa> faixasLocais = new java.util.ArrayList<>();
        IteradorFaixa iterador = playlist.criarIterador();
        while (iterador.temProxima()) {
            faixasLocais.add(iterador.proxima());
        }
        
        Collections.shuffle(faixasLocais);
        for (Faixa faixa : faixasLocais) {
            System.out.println("Tocando (shuffle): " + faixa);
        }
    }
}
