// poderia ter

class Cliente(nome: String, rg: String) : Pessoa(nome, rg) {
    override fun addAluguel(item: itemLivraria) {
        super.addAluguel(item)
    }

    override fun addCompraVenda(item: itemLivraria) {
        super.historico.add(TransacaoCompra(item))
    }
}