package padroescomportamentais.iterator;

public class Elenco implements Agregado {
    // Agora o array é estritamente privado, não tem mais Getter para ele!
    private Jogador[] jogadores = new Jogador[23];
    private int quantidade = 0;

    public void adicionarJogador(Jogador jogador) {
        if (quantidade < jogadores.length) {
            jogadores[quantidade] = jogador;
            quantidade++;
        }
    }

    // A MÁGICA: Em vez de devolver o Array, devolvemos o Iterador!
    @Override
    public Iterador criarIterador() {
        return new IteradorElenco(jogadores);
    }
}