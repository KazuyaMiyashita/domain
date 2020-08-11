package domain5

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserRepositorySpec extends AnyFlatSpec with Matchers {
  "User" should "say hello" in {

    val userRepositoryImpl = new UserRepository {
      override def store(user: User): Unit = {
        val userId = user.id
        val profileImage = user.getProfileImage

        profileImage match {
          case None => s"""insert into users values ($userId, null, null);"""
          case Some(p) => {
            // p.path is ProfileImage, not ProfileImageImpl
            val path = ??? // p.path
            val extension = ??? // p.extension
            s"""insert into users values ($userId, $path, $extension);"""
          }
        }
        ()
      }
    }

    val user = User.RegisteredUser(1, "Nyan", ProfileImageImpl("1", "jpg"))

    assertThrows[NotImplementedError] {
      userRepositoryImpl.store(user)
    }

  }

}
