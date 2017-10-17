/**
 * Created by SAINTEK 101 on 10/16/2017.
 */
fun main(args: Array<String>) {
    var arraylist = ArrayList<String>()
    arraylist.add("Guntur")
    arraylist.add("Desi")
    arraylist.add("Hidayani")
    arraylist.add("Jepara")

    println("First name:" + arraylist.get(0))

    println("all element by object")
    for (item in arraylist){
        println(item)
    }

    arraylist.set(0, "UNISNU Jepara")

    println("all element by index")
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //search
    if (arraylist.contains("Vin Diesel")){
        println("name is found")
    }else{
        println("name is not found")
    }

}