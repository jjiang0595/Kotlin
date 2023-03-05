fun main() {
//    val numbers:IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    val numbers = arrayOf(1,2,3,4,5,6)
    val numbersD:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)

//    print(numbers.contentToString())
//
//    for(element in numbers) {
//        print("${element+2}")
//    }

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    print(fruits.contentToString())

    for (i in fruits.indices) {
        print("${fruits[i].name} is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)
