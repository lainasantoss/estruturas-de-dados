interface Listavel {
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun inserir(posicao: Int, dado: Any?)
    fun anexar(dado: Any?)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun atualizar(posicao: Int, dado: Any?)
    fun apagar(posicao: Int): Any?
    fun limpar()
    fun imprimir(): String
}

// metodos extas
// fun inserirInicio(dado: Any)
// fun selecionarInicio(): Any?
// fun atualizarFim(dado: Any?)
