package sempadrao.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinadorTest {

    @Test
    void deveContarJogadoresLidandoComArrayNulo() {
        Elenco elenco = new Elenco();
        elenco.adicionarJogador(new Jogador("Zico"));
        elenco.adicionarJogador(new Jogador("Júnior"));

        int contagem = 0;
        Jogador[] arrayExposto = elenco.getJogadores();

        // O CLIENTE SOFRE: Ele tem que saber usar arrays e fazer verificações de null.
        for (int i = 0; i < arrayExposto.length; i++) {
            if (arrayExposto[i] != null) { // Sem esse if, o programa daria NullPointerException
                contagem++;
            }
        }

        assertEquals(2, contagem);
    }
}