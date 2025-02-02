/**
 * В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
 *
 * – Расходы на выплату зарплаты постоянных сотрудников;
 * – Общие расходы по ЗП после прихода стажеров;
 * – Среднюю ЗП одного сотрудника после устройства стажеров.
 *
 * Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */
package lesson_2
const val REGULAR_SALARY: Int = 30_000
const val INTERN_SALARY: Int = 20_000
fun main(){
    val regularCount: Int = 50
    val internCount: Int = 30
    val allRegularSalary: Int = REGULAR_SALARY * regularCount
    val allSumSalary: Int = allRegularSalary + (internCount * INTERN_SALARY)
    val middleSumSalary: Int = allSumSalary / (regularCount + internCount)
    println("Расходы на выплату зарплаты постоянных сотрудников: $allRegularSalary")
    println("Общие расходы по ЗП после прихода стажеров: $allSumSalary")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $middleSumSalary")

}

