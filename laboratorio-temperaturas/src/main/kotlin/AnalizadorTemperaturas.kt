package cl.duoc

fun main(){
    checkpointOne()
    checkpointTwo()
    checkpointThree()
    checkpointFour()
}
fun checkpointOne() {
    println("Checkpoint 1")
    println("Analizador iniciado")

    val list: List<Int> = listOf(18, 22, 25, 17, 29, 31, 20)
    println(list)
    for (i in list) {
        println("Temperatura: ${i}c")
    }
}

fun clasificarTemperatura(temperatura: Int):String {
    return if (temperatura < 18) "Frio"
    else if (temperatura < 24 ) "Templado"
    else "Caluroso"
}

fun checkpointTwo() {
    println("Checkpoint 2")
    val list: List<Int> = listOf(18, 22, 25, 17, 29, 31, 20)
    for (i in list) {
        println("Temperatura: ${i}c (${clasificarTemperatura(i)})")
    }
}

fun checkpointThree() {
    println("Checkpoint 3")
    val list: List<Int> = listOf(18, 22, 25, 17, 29, 31, 20)
    var cont = 0;
    for (i in list) {
        if (i >= 25)
            cont++
    }
    println("Total: $cont")
}

fun checkpointFour() {
    println("Checkpoint 4")
    val mutableList: MutableList<Int> = mutableListOf(18, 22, 25, 17, 29, 31, 20)
    mutableList.add(26)
    var count = 0
    for (i in mutableList) {
        count++
        println("Temperatura: ${i}c")
    }
    println("Total: $count")
}