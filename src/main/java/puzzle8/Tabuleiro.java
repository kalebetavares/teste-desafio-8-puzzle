package puzzle8;

import java.util.*;

public class Tabuleiro {

    private final Map<Integer, List<Integer>> jogadasPermitidas = new HashMap<>();

    private List<String> conjuntoPecas = new ArrayList<>();
    private List<String> conjuntoVitoria = new ArrayList<>();

    public Tabuleiro() {
        conjuntoPecas.add("3");
        conjuntoPecas.add("7");
        conjuntoPecas.add("2");
        conjuntoPecas.add(" ");
        conjuntoPecas.add("8");
        conjuntoPecas.add("1");
        conjuntoPecas.add("5");
        conjuntoPecas.add("6");
        conjuntoPecas.add("4");

        conjuntoVitoria.add("1");
        conjuntoVitoria.add("2");
        conjuntoVitoria.add("3");
        conjuntoVitoria.add("4");
        conjuntoVitoria.add("5");
        conjuntoVitoria.add("6");
        conjuntoVitoria.add("7");
        conjuntoVitoria.add("8");
        conjuntoVitoria.add(" ");

        jogadasPermitidas.put(0, Arrays.asList(1,3));
        jogadasPermitidas.put(1, Arrays.asList(0,2,4));
        jogadasPermitidas.put(2, Arrays.asList(1,5));
        jogadasPermitidas.put(3, Arrays.asList(0,4,6));
        jogadasPermitidas.put(4, Arrays.asList(1,3,5,7));
        jogadasPermitidas.put(5, Arrays.asList(2,4,8));
        jogadasPermitidas.put(6, Arrays.asList(3,7));
        jogadasPermitidas.put(7, Arrays.asList(4,6,8));
        jogadasPermitidas.put(8, Arrays.asList(5,7));


    }

    public void imprimirTabuleiro () {
        for (int i = 0; i < conjuntoPecas.size(); i+=3){
            System.out.println(conjuntoPecas.get(i) + " " + conjuntoPecas.get(i+1) + " " + conjuntoPecas.get(i+2));
        }
    }

    public void trocarPosicao (String entradaPeca) {
        int posicaoDoVazio = this.conjuntoPecas.indexOf(" ");
        int posicaoEntradaPeca = this.conjuntoPecas.indexOf(entradaPeca);

        if (jogadasPermitidas.get(posicaoDoVazio).contains(posicaoEntradaPeca)) {
            Collections.swap(conjuntoPecas, posicaoDoVazio, posicaoEntradaPeca);
            return ;
        }
        System.out.println("Essa peça não pode ser movida, digite outra peça");
        return ;
    }

    public List<String> getConjuntoPecas() {
        return conjuntoPecas;
    }

    public List<String> getConjuntoVitoria() {
        return conjuntoVitoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tabuleiro tabuleiro = (Tabuleiro) o;
        return Objects.equals(conjuntoPecas, tabuleiro.conjuntoPecas) && Objects.equals(conjuntoVitoria, tabuleiro.conjuntoVitoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conjuntoPecas, conjuntoVitoria);
    }
}
