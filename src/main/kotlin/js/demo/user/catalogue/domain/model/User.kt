package js.demo.user.catalogue.domain.model

import java.util.UUID

data class User(
        val userId: UUID,
        val lastName: String,
        val firstName: String,
        val email: String,
        val login: String
)