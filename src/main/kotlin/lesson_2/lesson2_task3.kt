/**
 * Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
 *
 *  – Создай целочисленные переменные и проинициализируй их этими данными;
 *  – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 *  – Выведи результат в консоль.
 *
 */
package lesson_2
const val MINUTES_IN_HOUR: Int = 60
fun main(){
    val startHour: Int = 9
    val startMinute: Int = 39
    val wayTime: Int = 457
    val endMinutes: Int = startHour * MINUTES_IN_HOUR + startMinute + wayTime
    val endHour: Int = endMinutes / MINUTES_IN_HOUR
    val endMinute: Int = endMinutes - (endHour * MINUTES_IN_HOUR)
    println("$endHour:$endMinute")
}

