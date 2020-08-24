object Pangram {

    fun isPangram(input: String): Boolean {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val isPang = isPang@ {
            alphabet.forEach {
                if(input.indexOf(it, ignoreCase=true) == -1) return@isPang false
            }
          true  
        } 
        return isPang()
    }
}
