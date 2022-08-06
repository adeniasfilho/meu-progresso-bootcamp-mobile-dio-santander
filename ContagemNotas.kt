/*Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o
valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
Na sequência mostre o valor lido e a relação de notas necessárias.
 */


import java.util.Scanner

fun main() {
    val notas: IntArray = intArrayOf(100,50,20,10,5,2,1)
    var valor = readLine()!!.toInt()
    println(valor)

    for(i in 0..(notas.size - 1)) {
        if(valor >= notas[i]) {
            println("${valor/notas[i]}notas(s) de R$ " +notas[i]+",00")
        }else {
            println("0 nota(s) de R$"+notas[i]+", 00")
        }
        valor = valor % notas[i]
    }
}