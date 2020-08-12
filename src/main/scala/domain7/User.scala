package domain7

sealed trait User[PI <: ProfileImage] {
  import User.{RegisteredUser, TemporaryUser}

  def id: Long

  final def getName: Option[String] = this match {
    case u: RegisteredUser[_] => Some(u.name)
    case _: TemporaryUser[_] => None
  }
  final def getProfileImage: Option[PI] = this match {
    case u: RegisteredUser[_] => Some(u.profileImage)
    case _: TemporaryUser[_] => None
  }
  final def isRegisteredUser: Boolean = this match {
    case _: RegisteredUser[_] => true
    case _: TemporaryUser[_] => false
  }

}

object User {

  trait RegisteredUser[PI <: ProfileImage] extends User[PI] {
    def id: Long
    def name: String
    def profileImage: PI
  }

  case class TemporaryUser[PI <: ProfileImage](override val id: Long) extends User[PI]

}

