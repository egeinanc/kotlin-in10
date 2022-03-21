fun main(args: Array<String>) {
    val children = ArrayList<String>()
    children.add("String 1")
    children.add("String 2")
    children.add("String 3")
    children.add("String 4")

    children.forEach{
        println(it)
    }

    for (child in children) {
        println(child)
    }

}
