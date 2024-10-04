class Pilha (tamanho: Int) : Empilhavel {
    private var ponteiroTopo: Int = -1
    private val dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun estaVazia(): Boolean {
        return this.ponteiroTopo == -1
    }

    override fun estaCheia(): Boolean {
        return ponteiroTopo == dados.size - 1
    }

    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo++
            dados[ponteiroTopo] = dado
        } else {
            println("Pilha está cheia!")
        }
    }

    override fun desempilhar(): Any? {
        val dadoTopo: Any? = if (!estaVazia()) {
            val topo = dados[ponteiroTopo]
            dados[ponteiroTopo] = null
            ponteiroTopo--
            topo
        } else {
            println("Pilha está vazia!")
            null
        }
        return dadoTopo
    }

    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroTopo] = dado
        } else {
            println("Pilha está vazia!")
        }
    }

    override fun espiar(): Any? {
        return if (!estaVazia()) {
            dados[ponteiroTopo]
        } else {
            println("Pilha está vazia!")
            null
        }
    }

    override fun imprimir(): String {
        val retorno = StringBuilder("[")
        for (i in ponteiroTopo downTo 0) {
            retorno.append(dados[i])
            if (i > 0) {
                retorno.append(", ")
            }
        }
        retorno.append("]")
        return retorno.toString()
    }
}