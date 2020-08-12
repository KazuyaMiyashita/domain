package domain7.impl

import domain7._
import domain7.User.{RegisteredUser, TemporaryUser}

class UserRepositoryImpl extends UserRepository[ProfileImageImpl] {

  override def fetch(id: Long): User[ProfileImageImpl] = ???

  override def store(user: User[ProfileImageImpl]): Unit = {
    user match {
      case u: TemporaryUser[_] => {
        val userId = user.id
      }
      case u: RegisteredUser[ProfileImageImpl] => {
        val userId = user.id
        val path = u.profileImage.path
        val extension = u.profileImage.extension
      }
    }

    ()
  }
}
