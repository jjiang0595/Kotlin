fun main() {
    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
    print(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday",  3 to "Wednesday")

}