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


// Rombo:
    // Opcion 1:
    var num = 6
    if (num % 2 == 0) {
        num++
    }

    run {
        var i = 0
        while (i < num) {
            var j = i + 2
            while (j < num) {
                print("  ")
                j += 2
            }
            for (k in 0..i) {
                print("* ")
            }
            println()
            i += 2
        }
    }

    var i = num
    while (i > 1) {
        var j = num + 2
        while (j > i) { // #
            // for (int j = max; j > i; j = j - 2) {
            print("  ")
            j -= 2
        }
        for (k in i - 2 downTo 1) { // #
            // for (int k = i; k > 0; k--) {
            print("* ")
        }
        println()
        i -= 2
        /* # -> Elimina las primera linea */
    }

    // Opcion2:


}



