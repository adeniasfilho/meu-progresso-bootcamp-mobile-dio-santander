/*Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2.
Você precisa comprar um conduite circular de maneira a passar os dois cabos por dentro dele.
Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos,
qual o raio do menor círculo que possa englobar ambos os dois?
 */

fun main(args:Array<String>) {
    val nTestes = readLine()!!.toInt()
    var i = 0
    while(i < nTestes) {
        var cont = 0
        while(cont == 0) {
            var raios = readLine()
            var raiosArray:List<String> = raios!!.split(" ")
            var r1 = raiosArray[cont].toInt()
            var r2 = raiosArray[cont+1].toInt()
            println(r1 + r2)
            cont++
        }
        i++
    }
}