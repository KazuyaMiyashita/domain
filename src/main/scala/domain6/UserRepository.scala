package domain6

trait UserRepository {

  def fetch(id: Long): Option[User]
  def store(user: User): Unit

}
