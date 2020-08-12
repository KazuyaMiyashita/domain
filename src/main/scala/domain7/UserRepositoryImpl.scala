package domain7

import domain7.UserRepository
import domain7.User.RegisteredUser
import domain7.impl.ProfileImageImpl

class UserRepositoryImpl[User <: RegisteredUser[ProfileImageImpl]]
    extends UserRepository[User] {

  override def fetch(id: Long): User = ???

  override def store(user: User): Unit = {
    val userId = user.id
    val path = user.profileImage.path
    val extension = user.profileImage.extension
    s"""insert into users values ($userId, $path, $extension);"""
    ()
  }
}
