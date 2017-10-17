/**
 * Created by SAINTEK 101 on 9/30/2017.
 */
fun main(args: Array<String>) {
    //input
    print("Masukan Umur Anda:")
    var DOB:Int= readLine()!!.toInt()

    //process
    var year=2017
    var age:Int?
    age=year-DOB

    //output
    println("Tahun Lahir Anda: $age")
}