class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var b = false
        // fun strIntoAscii(str : String) : List<Int>{
        //     return this.map{it.code}
        // }

        val sAsSorted = s.toList().sorted().joinToString("")
        val tAsSorted = t.toList().sorted().joinToString("")
        if(sAsSorted.equals(tAsSorted)){
           b = true
        }
        return b

    }
}
