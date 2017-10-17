/**
 * Created by SAINTEK 101 on 10/9/2017.
 */
fun main(args: Array<String>) {
    for (i in 1..5){
        println("*")
    }

    for (i in 1..5){
        for(x in 1..5)
            print("*")
    }

    for (i in 1..5){
        for(x in 1..5)
            print("*")
        println("")
    }

    for (i in 1..5){
        for (x in 1..i)
            print("*")
        println()
    }

    for (i in 1..5){
        for (x in 4 downTo i) {
            print(" ")
        }
        for (y in 1..i){
            print("*")
        }
        println()
    }
}

