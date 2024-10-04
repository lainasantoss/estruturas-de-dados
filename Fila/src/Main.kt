fun main() {
    val fila = FilaEstatica(8)

    fila.enfileirar("Primeiro")
    fila.enfileirar("Segundo")
    fila.enfileirar("Terceiro")

    println(fila.imprimir())

    fila.desenfileirar()

    println(fila.imprimir())

    fila.atualizar("Atualizado")

    println(fila.imprimir())
}