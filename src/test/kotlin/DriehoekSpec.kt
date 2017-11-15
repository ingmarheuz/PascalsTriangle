
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object DriehoekSpec : Spek({
    describe("a driehoekCalculator") {
        val calculator = DriehoekCalculator()
        on("driehoek_2") {
            val driehoek : List<IntArray> = calculator.driehoek(5);
            it("should return ((1), (1, 1), (1, 2, 1), (1, 3, 3, 1), (1, 4, 6, 4, 1), (1, 5, 10, 10, 5, 1)") {
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
    }
})

