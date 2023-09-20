package Projeto;

class Mouse extends Produto {
    private String tipo;

    public Mouse(String descricao, String tipo) {
        super("Loja de Eletrônicos", 20.00);
        this.tipo = tipo;
        this.setDescricao(descricao);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ". Tipo: " + tipo;
    }
}