open abstract class Animal(val name: String){
    abstract fun makeSound()
}

class dog(name: String) : Animal(name){
    override fun makeSound() {
        println("${name} faz o som de Woof")
    }
}
class cat(name: String) : Animal(name){
    override fun makeSound() {
        println("${name} faz o som de Meow")
    }
}
fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        animal.makeSound()
    }
}


fun main() {
 val animals = listOf(dog("Oreo"), cat("Pierre"))
    animalSounds(animals)
}