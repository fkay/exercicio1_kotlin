class Livro(codigo: Int, nome:String, val autor: String, val dataLancamento:String,
            precoAluguel: Double, precoVenda: Double): itemLivraria(codigo, nome, precoAluguel, precoVenda) {

    constructor(codigo: Int, nome: String,
                autor:String, dataLancamento: String): this(codigo, nome,
                                                    autor, dataLancamento,0.0, 0.0) {

    }

    override fun calcularPreco(): Double {
        if(statusLivro == StatusLivro.ALUGADO) {
            return precoAluguel * diasAlugado
        } else
            return precoVenda
    }

    override fun toString(): String {
        return("Livro ${nome} - Autor: ${autor}")
    }

}