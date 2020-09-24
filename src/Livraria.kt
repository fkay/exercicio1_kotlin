class Livraria(var nome: String, val dataCriacao: String) {
    val items = mutableListOf<itemLivraria>()

    fun cadastrarLivro(livro: Livro) {
        items.add(livro)
    }

    fun cadastrarColecao(colecao: Colecao) {
        items.add(colecao)
    }

    private fun buscaItemPorCodigo(codigo: Int): itemLivraria? {
        return (items.firstOrNull {
            it.codigo == codigo
        })
    }

    fun consultarItem(codigo: Int) {
        val item = buscaItemPorCodigo(codigo)
        item?.let {
            println(item.toString())
        } ?: run { println("Livro não encontrado") }
    }

    fun consultarItem(nome: String) {
        val item = items.firstOrNull {
            it.nome == nome
        }
        item?.let {
            println(item.toString())
        } ?: run { println("Livro não encontrado") }
    }

    fun alugarItem(codigo: Int, dias: Int, func: Funcionario, cliente: Cliente) {
        val item = buscaItemPorCodigo(codigo)
        item?.let {
            if (it.statusLivro != StatusLivro.DISPONIVEL) {
                println("Livro não disponível")
            } else {
                it.statusLivro = StatusLivro.ALUGADO
                it.diasAlugado = dias
                func.addAluguel(it)
                cliente.addAluguel(it)
                println("Livro ${it.nome} alugado para ${cliente.nome} por ${func.nome}")
            }
        } ?: run { println("Item não encontrado") }
    }

    fun efetuarVenda(codigo: Int, func: Funcionario, cliente: Cliente) {
        val item = buscaItemPorCodigo(codigo)
        item?.let {
            if (it.statusLivro != StatusLivro.DISPONIVEL) {
                println("Livro não disponível")
            } else {
                it.statusLivro = StatusLivro.VENDIDO
                func.addCompraVenda(it)
                cliente.addCompraVenda(it)
                println("Livro ${it.nome} vendido para ${cliente.nome} por ${func.nome}")
            }
        } ?: run { println("Item não encontrado") }
    }

    fun verificarEstoque() {
        println("\nESTOQUE ATUAL DE ${nome}")
        var totalAlugado = 0.0
        var contAlugado = 0
        var totalVendido = 0.0
        var contVendido = 0
        var totalDisponivel = 0.0
        var contDisponivel = 0
        items.forEach {
            println("${it.toString()}    -    ${it.statusLivro}")
            when(it.statusLivro) {
                StatusLivro.VENDIDO -> {
                    contVendido++
                    totalVendido += it.calcularPreco()
                }
                StatusLivro.ALUGADO -> {
                    contAlugado++
                    totalAlugado += it.calcularPreco()
                }
                StatusLivro.DISPONIVEL -> {
                    contDisponivel++
                    totalDisponivel += it.calcularPreco()
                }
            }
        }
        println("Vendidos: ${contVendido} - Total R$ ${totalVendido}")
        println("Alugados: ${contAlugado} - Total R$ ${totalAlugado}")
        println("Disponivel: ${contDisponivel} - Total R$ ${totalDisponivel}")
    }
}