class Funcionario(val registro: Int, nome: String, rg:String):Pessoa(nome, rg) {
    // não é necessário, mas para demonstrar que pode especializar a funçao
    override fun addAluguel(item: itemLivraria) {
        super.addAluguel(item)
    }

    override fun addCompraVenda(item: itemLivraria) {
        super.historico.add(TransacaoVenda(item))
    }

}