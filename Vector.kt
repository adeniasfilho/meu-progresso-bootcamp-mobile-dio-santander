/* Você recebeu o desafio de ler um valor e criar um programa que coloque o valor lido na primeira posição de
um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior.
Por exemplo, se o valor lido for 1,
os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
 */

fun main(args: Array<String>) {
        val v = readLine()!!.toInt()
        val a = IntArray(10).toMutableList()

        for (i in 0 until 10) {
            a[i] = if (i == 0) v
            else a[i - 1] * 2
        }
        for(k in 0 until 10) {
            println("N[$k]=${a[k]}")
        }
}
