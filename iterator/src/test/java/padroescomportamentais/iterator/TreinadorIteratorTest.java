package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinadorIteratorTest {

    @Test
    void devePercorrerElencoUsandoIterator() {
        Elenco elenco = new Elenco();
        elenco.adicionarJogador(new Jogador("Zico"));
        elenco.adicionarJogador(new Jogador("Júnior"));
        elenco.adicionarJogador(new Jogador("Adílio"));

        int contagem = 0;
        String nomes = "";

        // O CLIENTE FICA FELIZ: Ele só pede o iterador.
        // Se amanhã o clube mudar de Array para List, este código NÃO QUEBRA!
        Iterador iterador = elenco.criarIterador();

        while (iterador.temProximo()) {
            Jogador j = iterador.proximo();
            nomes += j.getNome() + " ";
            contagem++;
        }

        assertEquals(3, contagem);
        assertEquals("Zico Júnior Adílio ", nomes);
    }
}