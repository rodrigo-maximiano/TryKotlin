package br.edu.ifsp.scl.sdm.trykotlin


fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int) : Int {
    return f(i, j)
}

fun multiplica(i: Int, j: Int): Int {
    return i * j
}

fun raizQuadrada(numero: Int): Int {
    for(n in 1..numero) {
        if(n * n == numero) {
            return n
        }
    }
    return -1
}

fun main() {
    // chamadas do primeiro passo
    println(processaInteiros(10, 5, ::soma))
    println(processaInteiros(10, 5, ::multiplica))
    println(processaInteiro(25, ::raizQuadrada))

    //chamadas do segundo passo
    println(processaInteiros(10, 5, {x, y -> x + y}))
    println(processaInteiros(10, 5, {x, y -> x * y}))
    println(processaInteiro(25, { raizQuadrada(it)}))

}