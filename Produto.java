public class Produto {
    String codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;

    public Produto(String codigo) {
        this.codigo = codigo;
        this.nome = null;
        this.quantidade = 0;
        this.tipo = null;
        this.valor = 0.0;
    }

    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = 0;
        this.tipo = null;
        this.valor = 0.0;
    }

    public Produto(String codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = null;
        this.valor = 0.0;
    }

    public Produto(String codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String vender(int quantidadeVendida){
        if (quantidade >= quantidadeVendida){
            this.quantidade = this.quantidade - quantidadeVendida;
            return "Produto em estoque! Valor total da venda: " + quantidadeVendida * this.valor;
        } else {
            return "Quantidade insuficiente em estoque! Quantidade disponível: " + this.quantidade;
        }
    }

    public void comprar(int quantidadeComprada, double novoValor){
        this.quantidade += quantidadeComprada;
        this.valor = novoValor;
    }

    public void comprar(int quantidadeComprada){
        this.quantidade += quantidadeComprada;
    }

    public String toString(){
        return "Código: " + this.codigo + ", Nome: " + this.nome + ", Tipo: " + this.tipo + ", Valor: " + this.valor + ", Quantidade em estoque: " + this.quantidade;
    }

    public void inserir(String novoNome, int novaQuantidade, String novoTipo, double novoValor){
        this.nome = novoNome;
        this.quantidade = novaQuantidade;
        this.tipo = novoTipo;
        this.valor = novoValor;
    }

    public boolean igual(Produto produto){
        if(this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo)){
            return true;
        } else {
            return false;
        }
    }
}
