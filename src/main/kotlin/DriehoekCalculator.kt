class DriehoekCalculator {
    fun driehoek(row: Int): List<IntArray> {
        return when (row) {
            0 -> listOf(intArrayOf(1))
            else -> {
                val newSize = row + 1
                val lastRow = row - 1
                val newRow = IntArray(newSize)
                val driehoek = driehoek(lastRow)
                var lastRead = 0;
                driehoek.last().withIndex().forEach { (index, value) ->
                    if (index == driehoek.lastIndex) {
                        newRow[index+1] = 1
                    } else {
                        newRow[index] = lastRead + value
                    }
                    lastRead = value;
                }
                driehoek + newRow
            }
        }
    }
}