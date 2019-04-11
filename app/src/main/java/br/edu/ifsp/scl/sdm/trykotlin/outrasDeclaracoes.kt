package br.edu.ifsp.scl.sdm.trykotlin

fun main() {
    // String com tipo explícito
    var nome: String = "João"

    // Tipo determinado implicitamente
    var sobreNome = "Lutz"

    // var e val podem ser inicializados a posteriori
    var nomeMeio: String
    nomeMeio = "Gabriel"

    // Float
    var altura: Float = 1.80f

    // Inteiro
    var idade: Int = 34

    var peso: Double = 76.toDouble()

    println("Nome: ${nome} ${nomeMeio} ${sobreNome}, altura: ${altura}, idade: ${idade}, peso: $peso")
}