fun main(args: Array<String>) {
    val myName: String = "muhammad susilo"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    println("------------------------")


    /// contoh  menggabungkan string dengan tipe data lain
    val s = "abc" +1 +3
    val g = 2
    println(s + g +"def")
    /// contoh  menggabungkan string dengan tipe data lain

    println("------------------------")

        //contoh menyimpan data String yang memuat keyword Kotlin
        var text = """ 
        for (c in "foo") 
           print(c) 
    """
        println(text)

    var text2 = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(text2)

    }