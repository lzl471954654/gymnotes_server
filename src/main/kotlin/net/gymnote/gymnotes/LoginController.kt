package net.gymnote.gymnotes

import net.gymnote.gymnotes.pojo.User
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @RequestMapping("/login")
    fun login(user: User): String? {
        return user.toString() + "test"
    }
}