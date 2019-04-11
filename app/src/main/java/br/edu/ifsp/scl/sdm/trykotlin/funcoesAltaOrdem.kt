package br.edu.ifsp.scl.sdm.trykotlin

//passando 1 função por parâmetro

fun processaTexto(str1: String, str2: String, processa: (String, String) -> String): String {
    return processa(str1, str2)
}

fun concatena(a: String, b: String): String {
    return "${a}${b}"
}

fun inverte(a: String, b: String): String {
    return a.reversed() + b.reversed()
}

//Estendendo List<String>
fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    val listaString: MutableList<String> = mutableListOf()
    // forma pragmática
//    for(s in this) {
//        listaString.add(funcao(s))
//    }

    this.forEach{ listaString.add(funcao(it)) }

    return listaString
}

fun primeiraLetra(str: String): String {
    return str.first().toString()
}

fun ultimaLetra(str: String): String {
    return str.last().toString()
}

//fun <T> List<T>.paraCada(List<T> -> (T)) {
//
//}


fun incrementa(i: Int): Int {
    return i + 1;
}

fun main() {
    //Exemplo 1
    println(processaTexto("Olá ", "Mundo", ::inverte))
    println(processaTexto("Olá ", "Mundo", ::concatena))
    println(processaTexto("Olá ", "Mundo", ::concatena))

    //Exemplo 2
    val listaNomes: List<String> = listOf("João","Rafael","Felipe")
    var listaPrimeiraLetra: List<String> = listaNomes.paraCadaString(::primeiraLetra)
    var listaUltimaLetra: List<String> = listaNomes.paraCadaString(::ultimaLetra)

    listaPrimeiraLetra.forEach{println(it)}
    listaUltimaLetra.forEach{println(it)}

    val listaInteiros: List<Int> = (1..10).toList()
    //val listaIncrementos: List<Int> = listaInteiros.paraCada(::incrementa)
    //listaIncrementos.forEach{ println(it) }
}