import java.util.*

fun main(){
    val rahil = Rahil("Rahil")

    println("i am your assistant ${rahil.name}")
    println()
    println()
    rahil.alarm("7:30")
    println()
    println()
    rahil.makecoffee(Coffeedata(true,1))
    println()
    println()
    rahil.water(32)
    println()
    println()
    rahil.water(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()
    println()
    rahil.cook()
    println()
    println()
    rahil.cloth()
}