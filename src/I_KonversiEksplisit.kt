fun main (args: Array<String>){
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("konversi variabel valInt secara implisit : " + valSum)
    val vallong: Long = valInt.toLong() //
    println("konversi variabel valInt secara eksplisit : " + vallong)
}