package br.edu.ifsp.scl.sdm.trykotlin

fun main() {
    //List e MutableList
//    var familia: List<String> = listOf<String>("Gustav", "Helena", "Tavito", "João", "Léo")
//    var lista: MutableList<String>
//    var lista2: ArrayList<String>
//
//    //familia.add("Dahra") - Erro porque a lista é imutável
//
//    //percorrendo usando FOR
//
////    for(integrante in familia) {
////        println(integrante)
////    }
//
//    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
//
//    // Percorrer FOR usando IntRange
//    for (i in 0..9) {
//        println(i)
//    }
//
//    val listaInteiros2: List<Int> = (1..10 step 2).toList()
//
//    // Percorrer FOR usando IntRange
//    for (i in 0..listaInteiros2.size - 1) {
//        println(listaInteiros2[i])
//    }
//
//    val listaCursos: MutableList<String> = mutableListOf<String>("Sistemas para Dispositivos Móveis", "String 2", "String 3")
//
//    listaCursos.add("Técnico em Informática para Internet")
//
//    listaCursos.forEach { println(it) }

    println("Set e MutableSet");
    val setCursos: MutableSet<String> = mutableSetOf<String>("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.add("MA")

    setCursos.forEach { println(it) }

    println("Map e MutableMap");
    val letrasMap: MutableMap<String, String> = mutableMapOf(Pair("1", "a"),Pair("2", "b"))
    letrasMap.put("3", "c")
    letrasMap.put("4", "d")

    letrasMap.forEach { println("${it.key}: ${it.value}") }

    //Somente na API 24 >
    //letrasMap.forEach{ t,u -> println("$t - $u") }


}