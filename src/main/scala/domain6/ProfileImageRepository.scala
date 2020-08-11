package domain6

trait ProfileImageRepository {

  type PI <: ProfileImage

  def get(id: Long): PI
  def store(profileImage: PI): Unit

}
