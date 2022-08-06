/* Cada tartaruga é classificada em um nível dependendo de sua velocidade:

Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.*/

fun main(args: Array<String>) {

    for(i in 1..3) {
        val l = readLine()!!.toInt()
        val v = readLine()!!.split(" ")

        var maior = 0
        for (a in 0..l-1){
            if (v[a].toInt() > maior) maior = v[a].toInt()
        }
        if(maior <  10) println("1")
        else if ( maior >= 10 && maior < 20) println("2")
        else println("3")
    }
}