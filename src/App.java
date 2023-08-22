public class App {

    public void CriaObjetosConta() {
        Conta contaA = new Conta.Builder(123456789l, "Pedro")
                .build();

        Conta contaB = new Conta.Builder(666l, "Vladimir")
                .saldoLivreInicial(2600)
                .saldoAplicacaoInicial(5000)
                .taxaRemuneracao(0.07)
                .categoriaInicial(Categoria.ADVANCED)
                .build();

        System.out.println("Conta A:" + contaA);
        System.out.println("\nConta B:" + contaB);
    }
}