fun main() {
    val pilha: Empilhavel = Pilha(8)

    pilha.empilhar("IFBA")
    pilha.empilhar("Instituto Federal da Bahia")
    println(pilha.imprimir()) // Vai imprimir o conteúdo da pilha
    pilha.desempilhar()
    println(pilha.imprimir())
}
