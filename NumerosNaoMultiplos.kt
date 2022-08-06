/* Escreva um algoritmo que leia 2 valores inteiros A e B calcule a soma dos números que não são múltiplos de 13
entre A e B, incluindo ambos.
 */

fun main(args:Array<String>) {
    val x = (readLine()?:return).toInt()
    val y = (readLine()?:return).toInt()
    var total = 0

    if(x < y) {
        for(x in x..y) {
            if(x%13 !=0) {
                total +=x
            }
        }
    }else if(x > y) {
        for(x in y..x) {
            if(x%13 !=0) {
                total += x
            }
        }
    }
    println(total)
}