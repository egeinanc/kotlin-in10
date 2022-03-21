import classes.User

fun main(args: Array<String>) {
    val condition = true
    if (condition) {
        println("Condition is true")
    } else {
        println("Condition is false")
    }

    val bob = User("Bob", 22)
    when (bob.age) {
        22 -> println("He is definitely 22 years old")
        23 -> println("He is definitely 23 years old")
        else -> println("He is something else")
    }
}
