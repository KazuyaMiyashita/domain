package domain5

trait UserRepository {

  def store(user: User): Unit

}
