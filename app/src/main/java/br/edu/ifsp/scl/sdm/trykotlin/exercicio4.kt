package br.edu.ifsp.scl.sdm.trykotlin

//fun soma(i: Int , j: Int) = i + j

//fun cat(i: String, j: String): String = "${i}${j}"

fun <T> xpto(x: T, y: T, f: (T, T) -> T) : T {
    return f(x, y)
}

fun main(){
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}