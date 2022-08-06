/* Paula simplesmente adora matemática.
Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.
Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula,
deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos.
Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das
sequências que Paula lhe apresentar.
 */

fun main(args:Array<String>) {
    val N = readLine()!!.toInt()
    for(i in 1..N) {
        var str = readLine()!!
        var N1:Int = str.substring(0,1).toInt()
        var N2:Int = str.substring(2).toInt()
        var x:String = str.substring(1,2)

        if(N1.equals(N2)) {
            println(N1 * N2)
        }else {
            if(x.uppercase() == x) {
                println(N2 - N1)
            }else {
                println(N1 + N2)
            }
        }
    }
}