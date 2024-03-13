package js.demo.user.catalogue.adapter.persistence

import js.demo.user.catalogue.domain.model.User
import js.demo.user.catalogue.domain.port.UserRepository
import java.util.*

class InMemoryUserRepository(
        private val userList: HashMap<UUID, User>
) : UserRepository {

    override fun find(userId: UUID): User? {
        return userList.getOrDefault(userId, null)
    }

    override fun findAll(): List<User> {
        return userList.values.stream().toList()
    }

    override fun upsert(user: User): User {
        userList[user.userId] = user
        return user
    }
}