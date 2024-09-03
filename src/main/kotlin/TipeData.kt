fun main(args: Array<String>) {
    val minByte: Byte = -128
    val maxByte: Byte = -128 //8 BIT
    val minShort: Short = -32768
    val maxShort: Short = 32767 //16 BIT
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 //32 BIT
    val minLong: Long = -922337203685477807
    val maxLong: Long = 922337203685477807 //64 BIT

    println("minByte: " + minByte)
    println("maxByte: " + maxByte)
    println("minShort: " + minShort)
    println("maxShort: " + maxShort)
    println("minInt: " + minInt)
    println("maxInt: " + maxInt)
    println("minLong: " + minLong)
    println("maxLong: " + maxLong)
}