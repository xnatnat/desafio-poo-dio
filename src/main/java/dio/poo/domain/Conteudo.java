package dio.poo.domain;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String
            titulo,
            descricao;

    public abstract double calculaXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
