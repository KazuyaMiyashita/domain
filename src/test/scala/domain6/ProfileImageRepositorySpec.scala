package domain6

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import domain6.impl._

class ProfileImageRepositorySpec extends AnyFlatSpec with Matchers {
  "User" should "say hello" in {

    val profileImageRepository: ProfileImageRepository = new ProfileImageRepositoryImpl {
      override def get(id: Long): ProfileImageImpl = ProfileImageImpl("42", "jpg")
      override def store(profileImage: ProfileImageImpl): Unit = {
        assert(profileImage.path == "42")
        assert(profileImage.extension == "jpg")
        ()
      }
    }

    val profileImage: profileImageRepository.PI = profileImageRepository.get(42)
    // assert(profileImage.path == "42") // compile error
    // assert(profileImage.extension == "jpg") // compile error
    assert(profileImage.url == new URL("http://example.com/users/42.jpg"))
    profileImageRepository.store(profileImage)

  }

}
