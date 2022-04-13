fun main() {
    var name = listOf("Gian", "Mellisa", "Wanjiru", "Stephen", "Kelvin", "Elvin", "Duncan", "Mark", "Peter", "Faith")
    println(name[0])
    println(name[2])
    println(name[4])
    println(name[6])
    println(name[8])
    val meters= height(listOf(5, 4, 9, 7, 5, 10))
    println(meters)
    var person1=Person("Mellisa", 21, 18.6, 50.5)
    var person2=Person("Wanjiru", 18, 7.5, 35.5)
    var person3=Person("Jerusa", 34,10.2,69.6)
    var people= listOf(person1,person2,person3)
    var p=people.sortedBy { Person->Person.age }
    println(p)

    var u=Person("Hilda", 23,5.5, 4.6)
    var v=Person("Nice", 25,5.6, 34.3)
    var list=listOf(u,v)
        println(list.plus(list))




        var Subaru = Car("KBB 133", 100)
        var Jeep = Car("KCE 764", 250)
        var Cars = listOf(Subaru, Jeep)
        println(listOfObjects(Cars))


    }

//A function that returns a list of string at even indices
    fun name(names: List<String>): List<String> {
        names.forEachIndexed { name, k ->
            if (name % 2 == 0) {
                println(k)
            }
        }
        return names

    }
//List of people's height in meters and return the average height and total height
    fun height(numbers: List<Int>): String {
        val H = numbers.sum()
        var average = numbers.average()
        var totalheight = "$H, $average"

        return totalheight
    }

//List of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
    data class Person(var name: String, var age: Int, var height: Double, var weight: Double)

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
    fun add(name: List<Any>): List<Any> {
        return listOf()
    }
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

    data class Car(var registration: String, var mileage: Int)

    fun listOfObjects(vehicles: List<Car>): Int {
        var M = 0
        vehicles.forEach { car ->
            car.mileage
            M += car.mileage

        }
        var average = M / vehicles.count()
        return average
    }







