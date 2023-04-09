package exercise_3

sealed class User(open val id : String,open val email : String) {
    data class Email(override val id : String, override val email : String) : User(id, email)
    data class Facebook(override val id : String, override val email : String) : User(id, email)
    data class Google(override val id : String, override val email : String) : User(id, email)
}

fun printUsers(user : User) {
    return when (user) { //ho usato User. per richiamare le data classes e passato user come parametro per modificarlo poi nel main
        is User.Email -> println("Email user: ${user}")
        is User.Facebook -> println("Facebook user: ${user}")
        is User.Google -> println("Google user: ${user}")
    }
}

