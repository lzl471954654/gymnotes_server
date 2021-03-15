package net.gymnote.gymnotes.pojo


class User {
    var name : String? = ""
    var passwordHash : String? = ""
    override fun toString(): String {
        return "User(name=$name, passwordHash=$passwordHash)"
    }

}