class ListaEstatica(val tamanho: Int) : Listavel {

    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var quantidade = 0
    private val dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia()) {
            if (posicao in 0..quantidade) {
                val posicaoFisica = (ponteiroInicio + posicao) % dados.size
                for (i in quantidade downTo posicao + 1) {
                    dados[(ponteiroInicio + i) % dados.size] = dados[(ponteiroInicio + i - 1) % dados.size]
                }
                dados[posicaoFisica] = dado
                ponteiroFim = (ponteiroFim + 1) % dados.size
                quantidade++
            } else {
                println("Posição inválida!")
            }
        } else {
            println("Lista está cheia!")
        }
    }

    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % dados.size
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("Lista está cheia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        return if (!estaVazia() && posicao in 0 until quantidade) {
            dados[(ponteiroInicio + posicao) % dados.size]
        } else {
            println(if (estaVazia()) "Lista está vazia!" else "Posição inválida!")
            null
        }
    }

    override fun selecionarTodos(): Array<Any?> {
        return if (!estaVazia()) {
            val dadosAux = arrayOfNulls<Any?>(quantidade)
            for (i in 0 until quantidade) {
                dadosAux[i] = dados[(ponteiroInicio + i) % dados.size]
            }
            dadosAux
        } else {
            println("Lista está vazia!")
            arrayOfNulls(0)
        }
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia() && posicao in 0 until quantidade) {
            dados[(ponteiroInicio + posicao) % dados.size] = dado
        } else {
            println(if (estaVazia()) "Lista está vazia!" else "Posição inválida!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        return if (!estaVazia() && posicao in 0 until quantidade) {
            val posicaoFisica = (ponteiroInicio + posicao) % dados.size
            val aux = dados[posicaoFisica]
            for (i in posicao until quantidade - 1) {
                dados[(ponteiroInicio + i) % dados.size] = dados[(ponteiroInicio + i + 1) % dados.size]
            }
            dados[(ponteiroInicio + quantidade - 1) % dados.size] = null
            ponteiroFim = if (ponteiroFim == 0) dados.size - 1 else ponteiroFim - 1
            quantidade--
            aux
        } else {
            println(if (estaVazia()) "Lista está vazia!" else "Posição inválida!")
            null
        }
    }

    override fun limpar() {
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
    }

    override fun imprimir(): String {
        var retorno = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            retorno += if (i == quantidade - 1)
                "${dados[ponteiroAux % dados.size]}"
            else
                "${dados[ponteiroAux % dados.size]},"
            ponteiroAux++
        }
        retorno += "]"
        return retorno
    }
}
