object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        var answer = 0
        arr.forEachIndexed { index, _ ->
            when (arr.copyOfRange(0, index).sum()) {
                arr.copyOfRange(index +1, arr.size).sum() -> answer = index
            }
        }
        return answer
    }
}

fun main(args: Array<String>){
    val arrayTest: IntArray = intArrayOf(1,2,3,4,3,2,1)
     println(EqualSidesOfAnArray.findEvenIndex(arrayTest))
}
