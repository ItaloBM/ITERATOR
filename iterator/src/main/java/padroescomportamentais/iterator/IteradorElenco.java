package padroescomportamentais.iterator;

public class IteradorElenco implements Iterador {
    private Jogador[] jogadores;
    private int posicaoAtual = 0;

    public IteradorElenco(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public boolean temProximo() {
        // Verifica se a posição atual é válida e se o espaço não está vazio
        if (posicaoAtual >= jogadores.length || jogadores[posicaoAtual] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Jogador proximo() {
        Jogador jogador = jogadores[posicaoAtual];
        posicaoAtual++;
        return jogador;
    }
}