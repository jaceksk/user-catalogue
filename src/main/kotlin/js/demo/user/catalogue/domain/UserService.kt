package js.demo.user.catalogue.domain

import js.demo.user.catalogue.domain.model.User
import js.demo.user.catalogue.domain.model.command.CreateUserCommand
import js.demo.user.catalogue.domain.port.UserRepository
import java.util.UUID

class UserService(
        private val userRepository: UserRepository
) {

    fun createUser(command: CreateUserCommand): UUID {
        return userRepository.upsert(User(
                userId = UUID.randomUUID(),
                lastName = command.lastName,
                firstName = command.firstName,
                email = command.email,
                login = command.login
        )).userId
    }
}