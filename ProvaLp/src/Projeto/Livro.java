package Projeto;

class Livro extends Produto {
    private String autor;

    public Livro(String descricao, String autor) {
        super("Livros Online", 30.00);
        this.autor = autor;
        this.setDescricao(descricao); 
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ". Autor: " + autor;
    }
}