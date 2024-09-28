class Pilha {
    private val ponteiroTopo: Int
    private var dados: Array<Any?>


    constructor (tamanho: Int){
        ponteiroTopo = -1
        dados = arrayOfNulls(tamanho)
    }
}