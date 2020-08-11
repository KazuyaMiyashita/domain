package domain4

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserSpec extends AnyFlatSpec with Matchers {
  "User" should "say hello" in {
    User.RegisteredUser(1, "Nyan", ProfileImage("1", "jpg"))
    User.TemporaryUser(2)
  }

  "User" should "say hello2" in {
    assert(
      User.RegisteredUser(1, "Nyan", ProfileImage("1", "jpg")).isRegisteredUser == true
    )
    assert(
      User.TemporaryUser(2).isRegisteredUser == false
    )
  }
}
