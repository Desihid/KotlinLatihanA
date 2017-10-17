/**
 * Created by SAINTEK 101 on 9/30/2017.
 */
fun main(args: Array<String>) {
    print("Masukkan nama : ")
    var name = readLine()
    print("Masukkan umur : ")
    var age:Int = readLine()!!.toInt()
    print("Masukkan departement : ")
    var departement:String?
    departement = readLine()
    println("name : " + name)
    println("age : " + age)
    println("departement : " + departement)
    val pi:Double = 3.14
    println("pi : " + pi)
}
