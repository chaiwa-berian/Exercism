object Isogram {

    fun isIsogram(input: String): Boolean {
        return ('a'..'z').all{x ->
            input.toLowerCase().filter{
                it == x
            }.count() <= 1
        }
    }
}
