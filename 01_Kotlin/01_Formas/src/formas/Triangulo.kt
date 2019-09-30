package formas

fun main() {
    val max = 5
    for (i in max downTo 0){
        for (j in i..max){
            print("* ")
        }
        println()
    }

    for (i in 0..max){
        for(j in i until max){
            print("* ")
        }
        println()
    }
}