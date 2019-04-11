package br.edu.ifsp.scl.sdm.trykotlin

fun soma(i: Int , j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun foo(x: Int, y: Int, f: (Int,Int) -> Int): Int {
    return f(x, y)
}

fun bar(x: String, y: String, f: (String, String) -> String): String {
    return f(x, y)
}

fun main() {

    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))

}