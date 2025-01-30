/**
 * Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
 *
 * - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
 * - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
 * - Значения часов, минут и секунд отображать двумя цифрами.
 */
package lesson1
const val SECS_IN_MINUTES = 60
const val MINUTES_IN_HOUR = 60
const val SECS_IN_HOUR = MINUTES_IN_HOUR * SECS_IN_MINUTES

fun main() {

    val seconds = 6480
    val hours = seconds / SECS_IN_HOUR
    val minutes = (seconds % SECS_IN_HOUR) / MINUTES_IN_HOUR
    val lastSeconds = (seconds % SECS_IN_HOUR) % MINUTES_IN_HOUR
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, lastSeconds)
    println(formattedTime)

}