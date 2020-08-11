package domain1

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserSpec extends AnyFlatSpec with Matchers {
  "User" should "say hello" in {
    User(1, Some("Nyan"), Some(new URL("http://example.com/users/1.jpg")))
    User(2, None, None)
    assertThrows[AssertionError] {
      User(3, Some("Nyan"), None)
    }
    assertThrows[AssertionError] {
      User(4, None, Some(new URL("http://example.com/users/4.jpg")))
    }
  }

  "User" should "say hello2" in {
    assert(
      User(1, Some("Nyan"), Some(new URL("http://example.com/users/1.jpg"))).isRegisteredUser == true
    )
    assert(
      User(2, None, None).isRegisteredUser == false
    )
  }
}
