package br.venson.net.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Faixa> faixas = new ArrayList<>();

    public void adicionar(Faixa faixa) {
        faixas.add(faixa);
    }

    public IteradorFaixa criarIterador() {
        return new PlaylistIterator(faixas);
    }

    @Override
    public String toString() {
        return faixas.toString();
    }
}
