package js.demo.user.catalogue.query

import js.demo.user.catalogue.domain.port.UserRepository
import js.demo.user.catalogue.query.view.UserSimpleView

class UserQueryService(
        private val userRepository: UserRepository
) {

    fun findAll(): List<UserSimpleView> {
        return userRepository.findAll().stream()
                .map { UserSimpleView(it.lastName, it.firstName, it.email, it.login, ) }
                .toList()
    }

}