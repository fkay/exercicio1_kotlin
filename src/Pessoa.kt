// Classe abstrata pessoa

abstract class Pessoa(val nome: String, open val rg: String) {
    val historico = mutableListOf<Transacao>()
    open fun addAluguel(item: itemLivraria) {
        historico.add(TransacaoAluguel(item))
    }
    open abstract fun addCompraVenda(item: itemLivraria)

    open fun consultaHistorico() {
        println("\nHistorico de transações de ${nome}")
        historico.forEach {
            println("${it.item.toString()} - ${it.tipoTransacao.name}")
        }
    }
}