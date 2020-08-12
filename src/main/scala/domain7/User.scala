package domain7

sealed trait User {
  import User.{RegisteredUser, TemporaryUser}

  def id: Long

  final def getName: Option[String] = this match {
   case u: RegisteredUser[_] => Some(u.name)
   case _: TemporaryUser => None
  }
  final def getProfileImage: Option[ProfileImage] = this match {
   case u: RegisteredUser[_] => Some(u.profileImage)
   case _: TemporaryUser => None
  }
  final def isRegisteredUser: Boolean = this match {
   case _: RegisteredUser[_] => true
   case _: TemporaryUser => false
  }

}

object User {

  trait RegisteredUser[PI <: ProfileImage] extends User {
    def id: Long
    def name: String
    def profileImage: PI
  }

  case class TemporaryUser(override val id: Long) extends User

}

