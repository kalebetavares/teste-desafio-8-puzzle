import org.junit.jupiter.api.Test;
import puzzle8.Jogo;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Testes para verificar o funcionamento do método "Movimentar";

class MovimentarTest {

    @Test
    public void MovTest(){
        Jogo jogo = new Jogo();
        String entradaUsuario = "3";
        jogo.movimentar(entradaUsuario);
        assertEquals(Arrays.asList(" ","7","2","3","8","1","5","6","4"), jogo.getTabuleiro().getConjuntoPecas());
    }

    @Test
    public void TestFalhaMov(){
        Jogo jogo = new Jogo();
        String entradaUsuario = "2";
        jogo.movimentar(entradaUsuario);
        assertEquals(Arrays.asList("3","7","2"," ","8","1","5","6","4"), jogo.getTabuleiro().getConjuntoPecas());
    }
}