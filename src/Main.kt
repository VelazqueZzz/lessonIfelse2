//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
const val AGE_OF_MAJORITY = 18

fun main() {
println("Введите год рождения:")
val yearBorn = readln().toInt()
val year = 2026 - yearBorn
if (year >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}