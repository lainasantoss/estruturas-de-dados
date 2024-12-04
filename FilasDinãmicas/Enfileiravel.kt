interface Enfileiravel {
    // Métodos Principais
    fun enfileirar(dado: Any?) // C
    fun atualizar(dado: Any?)  // U
    fun frente(): Any?         // R
    fun desenfileirar(): Any?  // D

    // Métodos Auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}
