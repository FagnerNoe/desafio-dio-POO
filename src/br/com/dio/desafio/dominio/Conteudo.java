package br.com.dio.desafio.dominio;
//classe abstrata não é possivel
public abstract class Conteudo {
    protected static final double  XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public abstract double calcular();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
