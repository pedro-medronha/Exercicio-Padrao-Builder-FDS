enum Categoria {
    NORMAL, ADVANCED, PREMIUM
}

public class Conta {

    private Long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;

    private Conta(Builder builder) {
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }

    public static class Builder {

        private Long numero;
        private String nomeCorrentista;
        private int saldoLivreInicial = 0;
        private int salAplicacaoInicial = 0;
        private double taxaRemuneracao = 0.0;
        private double taxaSaldoNegativo = 0.0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(Long numero, String nomeCorrentista) {
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivreInicial(int saldoLivreInicial) {
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public Builder saldoAplicacaoInicial(int saldoAplicacaoInicial) {
            this.salAplicacaoInicial = saldoAplicacaoInicial;
            return this;
        }

        public Builder taxaRemuneracao(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder taxaSaldoNegativo(double taxaSaldoNegativo) {
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public Builder categoriaInicial(Categoria categoriaInicial) {
            this.categoriaInicial = categoriaInicial;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }

    public Long getNumero() {
        return this.numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getSaldoLivreInicial() {
        return this.saldoLivreInicial;
    }

    public void setSaldoLivreInicial(int saldoLivreInicial) {
        this.saldoLivreInicial = saldoLivreInicial;
    }

    public int getSalAplicacaoInicial() {
        return this.salAplicacaoInicial;
    }

    public void setSalAplicacaoInicial(int salAplicacaoInicial) {
        this.salAplicacaoInicial = salAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return this.taxaRemuneracao;
    }

    public void setTaxaRemuneracao(double taxaRemuneracao) {
        this.taxaRemuneracao = taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return this.taxaSaldoNegativo;
    }

    public void setTaxaSaldoNegativo(double taxaSaldoNegativo) {
        this.taxaSaldoNegativo = taxaSaldoNegativo;
    }

    public Categoria getCategoriaInicial() {
        return this.categoriaInicial;
    }

    public void setCategoriaInicial(Categoria categoriaInicial) {
        this.categoriaInicial = categoriaInicial;
    }

    @Override
    public String toString() {
        return "{" +
                " numero='" + getNumero() + "'" +
                ", nomeCorrentista='" + getNomeCorrentista() + "'" +
                ", saldoLivreInicial='" + getSaldoLivreInicial() + "'" +
                ", salAplicacaoInicial='" + getSalAplicacaoInicial() + "'" +
                ", taxaRemuneracao='" + getTaxaRemuneracao() + "'" +
                ", taxaSaldoNegativo='" + getTaxaSaldoNegativo() + "'" +
                ", categoriaInicial='" + getCategoriaInicial() + "'" +
                "}";
    }
}