object Raindrops {

    fun convert(n: Int): String {
        var str = ""
        (1..n).forEach { if(n % it == 0){
            when(it){
            3 -> str+="Pling"
            5 -> str+="Plang"
            7 -> str+="Plong"               
            }
        } } 
        if(str == "") return  n.toString() else return str
    }
}
