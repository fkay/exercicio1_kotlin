// Opcionalmente poderiamos ter os valores da colecao sendo calculados com base nos vlaores dos livros

class Colecao(codigo: Int, nome: String,
              precoAluguel: Double, precoVenda: Double): itemLivraria(codigo, nome, precoAluguel, precoVenda) {
    private val livros = mutableListOf<Livro>()

    fun addLivro(livro: Livro) {
        livros.add(livro)
    }

    fun removeLivro(livro: Livro) {
        livros.remove(livro)
    }

    fun getLivro(index: Int): Livro {
        return livros.get(index)
    }

    fun getLivros(): List<Livro> {
        return livros.toList()
    }

    override fun calcularPreco(): Double {
        if(statusLivro == StatusLivro.ALUGADO) {
            return precoAluguel * diasAlugado
        } else
            return precoVenda
    }

    override fun toString():String{
        var result = "Coleção: ${nome}"
        livros.forEach{
            result = result.plus("\n  - ").plus(it.toString())
        }
        return result
    }
}