object Isogram {
   fun isIsogram(input: String): Boolean {
        val isog = isIso@ {
            input.toLowerCase().toList().distinct().filter{ v -> v.isLetter()}.forEach{x -> 
                if(input.toLowerCase().filter{
                    it == x && it.isLetter()
                }.count() > 1) return@isIso false
            }
        true
        }
        return isog()
    }  
}
