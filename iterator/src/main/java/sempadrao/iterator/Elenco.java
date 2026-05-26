package sempadrao.iterator;

public class Elenco {
    // O PROBLEMA: A estrutura de dados fica exposta para quem for usar.
    private Jogador[] jogadores = new Jogador[23];
    private int quantidade = 0;

    public void adicionarJogador(Jogador jogador) {
        if (quantidade < jogadores.length) {
            jogadores[quantidade] = jogador;
            quantidade++;
        }
    }

    // O cliente vai ter que lidar diretamente com o Array!
    public Jogador[] getJogadores() {
        return jogadores;
    }
}