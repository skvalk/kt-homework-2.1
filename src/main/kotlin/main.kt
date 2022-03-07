const val PERCENT: Float = 0.75F
const val MIN_COMMISSION: Int = 35_00

fun main() {
    val amount = 10000_00
    val commission: Int = ((amount * PERCENT) / 100).toInt()
    val result = if (commission <= MIN_COMMISSION) MIN_COMMISSION else commission

    println("Размер комиссии в копейках составляет: $result")
}