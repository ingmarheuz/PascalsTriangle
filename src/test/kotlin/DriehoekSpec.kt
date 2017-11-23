
import org.junit.Test

class DriehoekSpec {
    @Test
    fun test1() {
        val calculator = DriehoekCalculator()
        val driehoek : List<IntArray> = calculator.driehoek(6)
        assertk.assert {
            driehoek.size == 6
            driehoek.contains(intArrayOf(1))
            driehoek.contains(intArrayOf(1, 1))
            driehoek.contains(intArrayOf(1, 2, 1))
            driehoek.contains(intArrayOf(1, 3, 3, 1))
            driehoek.contains(intArrayOf(1, 4, 6, 4, 1))
            driehoek.contains(intArrayOf(1, 5, 10, 10, 5, 1))
        }
    }
}

