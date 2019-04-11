package br.edu.ifsp.scl.sdm.trykotlin

fun main() {
    val listaCursos: MutableList<String> = mutableListOf("Sistemas para Dispositivos Móveis","Análise e Desenvolvimento de Sistemas")
    //var listaCursosSistemas: MutableList<String> = mutableListOf()

    listaCursos.add("Técnico em Informárica para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

//    listaCursos.forEach {
//        if(it.contains("Sistemas")){
//            listaCursosSistemas.add(it)
//        }
//    }

    val listaCursosSistemas: MutableList<String> = listaCursos.filter { it.contains("Sistemas") }.toList().toMutableList()

    listaCursosSistemas.forEach {
        println(it)
    }



}
