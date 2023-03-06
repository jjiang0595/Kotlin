fun main(){
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(6.4554)
    myArrayList.add(65.123)
    myArrayList.add(35.12354)
    myArrayList.add(21.8754)
    myArrayList.add(82.0045)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)
}