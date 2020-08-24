object Pangram {
    fun isPangram(input: String): Boolean {
       return ('a'..'z').all{it in input.toLowerCase()}
    }
}
