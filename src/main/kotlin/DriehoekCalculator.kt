class DriehoekCalculator {
    fun driehoek(row: Int): List<IntArray> {
        val driehoek = initialize(row)
        for (currentRow in row downTo 1 ) {
            for (column in 1..currentRow) {
                driehoek.get(currentRow-1)[column -1] = pascal(currentRow, column)
            }
        }
        return driehoek
    }

    private fun initialize(row: Int): List<IntArray> {
        var initializedDriehoek = listOf<IntArray>()
        for( i in 1 .. row) {
            initializedDriehoek += IntArray(i)
        }
        return initializedDriehoek
    }

    private fun pascal(row: Int, column: Int): Int {
        if (column == 1 || column == row) {
            return 1
        }
        val value = pascal(row - 1, column - 1) + pascal(row - 1, column)
        return value
    }
}