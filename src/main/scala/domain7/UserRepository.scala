package domain7

trait UserRepository[U <: User] {
  def fetch(id: Long): U
  def store(user: U): Unit
}
