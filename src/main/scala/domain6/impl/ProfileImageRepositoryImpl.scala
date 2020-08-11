package domain6.impl

import domain6.ProfileImageRepository

class ProfileImageRepositoryImpl extends ProfileImageRepository {

  override type PI = ProfileImageImpl
  override def get(id: Long): ProfileImageImpl = ???
  override def store(profileImage: ProfileImageImpl): Unit = ???

}
