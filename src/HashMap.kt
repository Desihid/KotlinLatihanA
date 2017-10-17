/**
 * Created by SAINTEK 101 on 10/16/2017.
 */
fun main(args: Array<String>) {
    var map = HashMap<Int,String>()
    map.put(1,"Guntur")
    map.put(2,"Desi")
    map.put(3,"Hidayani")
    println(map.get(3))

    map.put(3,"UNISNU Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

    /**var map = HashMap<String,String>()
    map.put("nama_depan","Guntur")
    map.put("nama_tengah","Desi")
    map.put("nama_belakang","Hidayani")
    println(map.get("nama_depan"))

    map.put("nama_tengah","UNISNU Jepara")
    //println(map.keys)
    for (k in map.keys){
        println(k + "" + map.get(k))
    }*/

}
