package js.demo.user.catalogue.config

import js.demo.user.catalogue.adapter.persistence.InMemoryUserRepository
import js.demo.user.catalogue.domain.UserService
import js.demo.user.catalogue.domain.port.UserRepository
import js.demo.user.catalogue.query.UserQueryService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.HashMap

@Configuration
class UserCatalogueConfig {

    @Bean
    fun userService(userRepository: UserRepository) = UserService(userRepository)

    @Bean
    fun userQueryService(userRepository: UserRepository) = UserQueryService(userRepository)

    @Bean
    fun userRepository() = InMemoryUserRepository(HashMap())
}