package puzzle8;

import puzzle8.Tabuleiro;

import java.util.Scanner;

public class Jogo{

    private Tabuleiro tabuleiro = new Tabuleiro();

    public void iniciarJogo() {
        do {
            mostrarTabuleiro();
            String entrada = receberEntrada();
            movimentar(entrada);
        }while(!vitoria());
        System.out.println("Você venceu!");
    }

    //Modifica a posição dos números
    public void movimentar(String entrada) {
        this.tabuleiro.trocarPosicao(entrada);
    }

    //Leitor de entrada do usuário
    public String receberEntrada() {
        System.out.println("Digite a peça que você deseja movimentar: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public void mostrarTabuleiro(){
        this.tabuleiro.imprimirTabuleiro();
    }

    //Compara os conjuntos e verica as posições
    public boolean vitoria() {
        if(tabuleiro.getConjuntoPecas().equals(tabuleiro.getConjuntoVitoria())) {
            return true;
        }

        return false;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}