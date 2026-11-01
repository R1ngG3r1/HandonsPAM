open class Vehicle(val name: String, val maxSpeed: Int) {
  open fun describe(): String {
    return "$name dapat melaju hingga $maxSpeed km/h"
  }
}

class Car(name: String, val numberOfDoors: Int) : Vehicle(name, maxSpeed = 180) {
  override fun describe(): String {
    return "${super.describe()} dan punya $numberOfDoors pintu"
  }
}

class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, maxSpeed = 220) {
  override fun describe(): String {
    if (hasSidecar) {
      return "${super.describe()} (dengan sidecar)"
    } else {
      return "${super.describe()} (tanpa sidecar)"
    }
  }
}

fun main() {
  val vehicles = listOf<Vehicle>(
    Car("Toyota", numberOfDoors = 4),
    Motorcycle("Ninja", hasSidecar = false)
  )

  vehicles.forEach { println(it.describe()) }
}

