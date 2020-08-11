package domain2

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserSpec extends AnyFlatSpec with Matchers {
  "User" should "say hello" in {
    User.createRegisteredUser(1, "Nyan", new URL("http://example.com/users/1.jpg"))
    val user2 = User.createTemporaryUser(2)

    // compile error
    // user2.copy(name = None)

    // compile error
    // User(3, Some("Nyan"), None)
    // User(4, None, Some(new URL("http://example.com/users/4.jpg")))
  }

  "User" should "say hello2" in {
    assert(
      User.createRegisteredUser(1, "Nyan", new URL("http://example.com/users/1.jpg")).isRegisteredUser == true
    )
    assert(
      User.createTemporaryUser(2).isRegisteredUser == false
    )
  }
}
