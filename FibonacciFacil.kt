/* A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 */

fun main(args:Array<String>) {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1

    for(i in 1..(n-1)) {
        print("$a")
        val sum = a+b
        a = b
        b = sum
    }
    println("$a")
}
