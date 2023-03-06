fun main() {
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    print(days)
}