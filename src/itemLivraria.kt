enum class StatusLivro {
    DISPONIVEL, ALUGADO, VENDIDO
}

abstract class itemLivraria(val codigo: Int, val nome: String,
                            val precoAluguel: Double, val precoVenda: Double, ): ILivro {
    var diasAlugado: Int = 0
    var statusLivro: StatusLivro = StatusLivro.DISPONIVEL
}