
import assertk.assertions.hasSize
import org.junit.Assert.assertTrue
import org.junit.Test

class TriangleTest {
    @Test
    fun test1() {
        val calculator = TriangleCalculator()
        val triangle : List<IntArray> = calculator.buildPascalsTriangle(6)
        assertk.assert(triangle).hasSize(6)
        assertTrue(triangle.get(0).contentEquals(intArrayOf(1)))
        assertTrue(triangle.get(1).contentEquals(intArrayOf(1, 1)))
        assertTrue(triangle.get(2).contentEquals(intArrayOf(1, 2, 1)))
        assertTrue(triangle.get(3).contentEquals(intArrayOf(1, 3, 3, 1)))
        assertTrue(triangle.get(4).contentEquals(intArrayOf(1, 4, 6, 4, 1)))
        assertTrue(triangle.get(5).contentEquals(intArrayOf(1, 5, 10, 10, 5, 1)))
    }
}

