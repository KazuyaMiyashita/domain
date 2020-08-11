package domain5

sealed trait User {
  import User.{RegisteredUser, TemporaryUser}

  def id: Long
  final def getName: Option[String] = this match {
    case u: RegisteredUser => Some(u.name)
    case _: TemporaryUser => None
  }
  final def getProfileImage: Option[ProfileImage] = this match {
    case u: RegisteredUser => Some(u.profileImage)
    case _: TemporaryUser => None
  }
  final def isRegisteredUser: Boolean = this match {
    case _: RegisteredUser => true
    case _: TemporaryUser => false
  }
}

object User {

  case class RegisteredUser(override val id: Long, name: String, profileImage: ProfileImage) extends User
  case class TemporaryUser(override val id: Long) extends User

}
