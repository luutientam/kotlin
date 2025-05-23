fun main(){
val names: List<String?> = listOf("Minh", null, "An", "Linh", null, "Tú")

        names
            .filterNotNull()              // bỏ null
            .map { it.uppercase() }       // viết hoa
            .filter { it.length > 3 }     // lọc tên > 3 ký tự
            .forEach { println(it) }      // in ra từng dòng
            
}
