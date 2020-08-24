object Isogram {
   fun isIsogram(input: String): Boolean {
        val isog = dup@ {
            input.toLowerCase().toList().distinct().forEach{x -> 
                if(input.toLowerCase().filter{
                    it == x && it.isLetter()
                }.count() > 1) return@dup false
            }
        true
        }
        return isog()
    }  
}
