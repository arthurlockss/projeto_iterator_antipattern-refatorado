package br.venson.net.designpatterns.iterator;

import java.util.List;

public class PlaylistIterator implements IteradorFaixa {
    private final List<Faixa> faixas;
    private int posicao;

    public PlaylistIterator(List<Faixa> faixas) {
        this.faixas = faixas;
        this.posicao = 0;
    }

    @Override
    public boolean temProxima() {
        return posicao < faixas.size();
    }

    @Override
    public Faixa proxima() {
        if (!temProxima()) {
            return null; // ou throw new NoSuchElementException();
        }
        Faixa faixa = faixas.get(posicao);
        posicao++;
        return faixa;
    }
}
