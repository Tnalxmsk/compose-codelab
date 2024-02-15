package tiptime

import com.example.tiptime.calculateTip
import org.junit.Assert.*
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val actualTip = calculateTip(amount, tipPercent, false)
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        assertEquals(expectedTip, actualTip)
    }
}