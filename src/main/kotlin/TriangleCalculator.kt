class TriangleCalculator {
    fun buildPascalsTriangle(row: Int): List<IntArray> {
        val triangle = initializeTriangle(row)
        for (currentRow in row downTo 1 ) {
            for (column in 1..currentRow) {
                triangle.get(currentRow-1)[column -1] = coefficient(currentRow, column)
            }
        }
        return triangle
    }

    private fun initializeTriangle(row: Int): List<IntArray> {
        return (1 .. row).map { IntArray(it) }
    }

    private fun coefficient(row: Int, column: Int): Int {
        return if (column != 1 && column != row) {
            coefficient(row - 1, column - 1) + coefficient(row - 1, column)
        } else {
            1
        }
    }
}