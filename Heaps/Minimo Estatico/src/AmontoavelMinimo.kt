interface AmontoavelMinimo {
    // Métodos Principais
    fun inserir(dado: Long)
    fun buscar(): Long?
    fun atualizar(novoDado: Long)
    fun extrair(): Long?
    fun obter(): Long?

    // Métodos Auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}
