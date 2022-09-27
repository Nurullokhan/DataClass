fun main(args: Array<String>) {

    val user = User("John", "Smith", 25)
    println(user.name)
    println(user.surname)
    println(user.age)

    println(user.toString())

    println("********************")

    val userCopy = user.copy(name = "Alexander", surname = "Rybak", age = 36) //Data class copy function
    println(userCopy.name)
    println(userCopy.surname)
    println(userCopy.age)

    println(userCopy.toString())

}