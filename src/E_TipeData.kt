fun main (args: Array<String>) {
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767//16bit
    val minInt: Int = -2147483648
    val maxInt: Int = -2147483648 //32 bit
    val minlong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807//64 bit

    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minlong)
    println("maxLong:" + maxLong)

}