package domain7

trait UserRepository[PI <: ProfileImage] {
  def fetch(id: Long): User[PI]
  def store(user: User[PI]): Unit
}
