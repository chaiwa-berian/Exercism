object Isogram {
   fun isIsogram(input: String): Boolean {
        val isog = isIso@ {
            input.toLowerCase().toList().distinct().forEach{x -> 
                if(input.toLowerCase().filter{
                    it == x && it.isLetter()
                }.count() > 1) return@isIso false
            }
        true
        }
        return isog()
    }  
}
