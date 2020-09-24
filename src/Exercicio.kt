// Programa do Exercicio Integrador

fun main(){
    println("Bem vindo a Livraria DH")

    val func1 = Funcionario(25, "Zeca Bala", "23245-x")
    val func2 = Funcionario(26, "Maria das Dores", "12345-9")

    val cliente1 = Cliente("João Jão", "4567-0")
    val cliente2 = Cliente("Zaza", "23456-X")

    val livro1 = Livro(123, "Calculo 1", "James Stewart", "1995", 2.5, 100.0)
    val livro2 = Livro(124, "Calculo 2", "James Stewart", "1997", 2.5, 100.0)

    val livro3 = Livro(210, "Eletrônica vol 1", "Malvino", "01/02/1990", 2.0, 75.0)
    val livro4 = Livro(212, "Eletrônica vol 2", "Malvino", "01/02/1991", 2.0, 80.0)

    val livro5 = Livro(301, "Um curso de algebra linear", "Mary Lilian", "2001", 1.0, 40.0)
    val livro6 = Livro(401, "Estatistica Basica", "Pedro Morettin", "2005", 5.0, 250.0)

    val colecao1 = Colecao(1001, "Curso de Eletronica Basica", 5.0, 200.0)
    colecao1.addLivro(livro3)
    colecao1.addLivro(livro4)

    val livraria = Livraria("Livraria DH", "23/09/2020")

    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro5)
    livraria.cadastrarLivro(livro6)
    livraria.cadastrarColecao(colecao1)

    // testes
    livraria.verificarEstoque()

    livraria.consultarItem(401)
    livraria.consultarItem(405)

    livraria.consultarItem("Um curso de algebra linear")
    livraria.consultarItem("Curso de Eletronica Basica")
    livraria.consultarItem("Zeca")

    livraria.alugarItem(123, 10, func1, cliente1)
    livraria.efetuarVenda(124, func2, cliente1)

    livraria.verificarEstoque()

    livraria.alugarItem(1001, 20, func1, cliente2)
    livraria.efetuarVenda(0, func1, cliente2)

    livraria.alugarItem(124, 10, func1, cliente2)

    livraria.verificarEstoque()

    cliente1.consultaHistorico()
    func1.consultaHistorico()

    cliente2.consultaHistorico()
    func2.consultaHistorico()
}