// Interface que define os metodos comuns dos itens que pertencem a livraria (Colecao e Livros)



interface ILivro {
    fun calcularPreco(): Double
    override fun toString(): String
}