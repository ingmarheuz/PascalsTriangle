class DriehoekCalculator {
    fun driehoek(row: Int): List<IntArray> {
        var driehoek = listOf<IntArray>()
        for (currentRow in row downTo 1 ) {
            val rowArray = IntArray(currentRow)
            for (column in 1..currentRow) {
                val value = pascal(currentRow, column)
                rowArray[column - 1] = value
            }
            driehoek += rowArray
        }
        return driehoek
    }

    fun pascal(row: Int, column: Int): Int {
        if (column == 1 || column == row) {
            return 1
        }
        val value = pascal(row - 1, column - 1) + pascal(row - 1, column)
        return value
    }
}