
import assertk.assertions.hasSize
import org.junit.Assert.assertTrue
import org.junit.Test

class DriehoekTest {
    @Test
    fun test1() {
        val calculator = DriehoekCalculator()
        val driehoek : List<IntArray> = calculator.driehoek(6)
        assertk.assert(driehoek).hasSize(6)
        assertTrue(driehoek.get(0).contentEquals(intArrayOf(1)))
        assertTrue(driehoek.get(1).contentEquals(intArrayOf(1, 1)))
        assertTrue(driehoek.get(2).contentEquals(intArrayOf(1, 2, 1)))
        assertTrue(driehoek.get(3).contentEquals(intArrayOf(1, 3, 3, 1)))
        assertTrue(driehoek.get(4).contentEquals(intArrayOf(1, 4, 6, 4, 1)))
        assertTrue(driehoek.get(5).contentEquals(intArrayOf(1, 5, 10, 10, 5, 1)))
    }
}

