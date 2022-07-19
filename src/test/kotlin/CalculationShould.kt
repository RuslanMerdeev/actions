import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculationShould {

    @Test
    fun calculate() {

        val result = calculate(1, 1)

        assertEquals(2, result)
    }

    @Test
    fun calculateFirstNull() {

        val result = calculate(null, 1)

        assertEquals(1, result)
    }

    @Test
    fun calculateSecondNull() {

        val result = calculate(1, null)

        assertEquals(1, result)
    }

    @Test
    fun calculateNulls() {

        val result = calculate(null, null)

        assertEquals(0, result)
    }
}