/* Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */

import java.util.*

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var a = reader.nextDouble()
    var b = reader.nextDouble()
    var weightA = 3.5
    var weightB = 7.5
    var totalWeight = 11
    var m = (a * weightA + b * weightB)/totalWeight
    var r = "%.5f".format(m)
    println("MEDIA = ${r}")
}