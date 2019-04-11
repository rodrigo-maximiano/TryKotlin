package br.edu.ifsp.scl.sdm.trykotlin

fun main() {

    var nome: String
    //nome = null  -- Erro

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?: "Jão"

    if(sobrenome != null) {
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

    try {
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    } catch(ex: KotlinNullPointerException) {
        println("Deu merda, mané!")
    }


}