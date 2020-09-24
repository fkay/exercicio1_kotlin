// classe que define uma transacao
// tipoTransacao = 0 aluguel,
//               = 1 venda/compra

enum class TipoTransacao {
    ALUGUEL, VENDA, COMPRA
}

abstract class Transacao(val item: itemLivraria, val tipoTransacao: TipoTransacao) {
    override fun toString(): String {
        return ("${item.nome} - ${tipoTransacao.name}")
    }
}

class TransacaoAluguel(item: itemLivraria) : Transacao(item, TipoTransacao.ALUGUEL){
}
class TransacaoVenda(item: itemLivraria) : Transacao(item, TipoTransacao.VENDA){

}

class TransacaoCompra(item: itemLivraria) : Transacao(item, TipoTransacao.COMPRA){

}