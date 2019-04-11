package br.edu.ifsp.scl.sdm.trykotlin

fun main() {
    var frase: String = "Hello, world!"

    frase = "Hello, IFSP"

    println(frase)
    println("$frase")
    println("${frase.length}")
    println("${frase.count()}")

    for(c in frase.toCharArray()) {
        println(c)
    }

}