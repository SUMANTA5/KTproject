import java.util.*

class Rahil(val name:String) {

    fun alarm(time:String)=println("Good morning Its $name time is $time")

    fun makecoffee(coffee:Coffeedata){

        if (coffee.Black){
            println("Your black Coffee and ${coffee.Sugar} spoons of sugar ready ")
        }else{
            println("Your Milk Coffee and ${coffee.Sugar} spoons of sugar ready ")
        }
    }

    fun water(temperature: Int) = println("Your water with $temperature is ready")
    fun bag(day : Int){
        val mass = "You also ready your bag"
        val subject = arrayListOf("c","c++","DBMS","JAVA","Kotlin")

        when(day){

            Calendar.MONDAY-> println("$mass and today subject is ${subject[0]}${subject[1]}")
            Calendar.TUESDAY-> println("$mass and today subject is ${subject[0]}${subject[1]}")
            Calendar.WEDNESDAY-> println("$mass and today subject is ${subject[2]}${subject[3]}")
            Calendar.THURSDAY-> println("$mass and today subject is ${subject[2]}${subject[3]}")
            Calendar.FEBRUARY-> println("$mass and today subject is ${subject[0]}${subject[1]}")
            Calendar.SATURDAY-> println("$mass and today subject is ${subject[4]}${subject[1]}")
            Calendar.SUNDAY-> println("$mass and today subject is ${subject[3]}${subject[2]}")
        }

    }
    fun cook(){
        val breakfast = arrayListOf(
            "Bakery and Bread",
                "Meat and Seafood",
                "Pasta and Rice"
                )
        val lunch = arrayListOf(
            "Bakery and Bread",
            "Meat and Seafood",
            "Pasta and Rice"
                )

        println("Your breakfast ${breakfast.random()} and ${lunch.random()} is ready!")

    }
    fun cloth() {
        val dress = arrayListOf(
            "jacket",
            "jeans",
            "pajamas",
            "pants",
            "raincoat",
            "scarf",
            "shirt"
        )
        println("your cloth is${dress.random()} ready")
    }

}