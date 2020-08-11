package domain4

import java.net.URL

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ProfileImageSpec extends AnyFlatSpec with Matchers {
  "ProfileImageSpec" should "say hello" in {
    assert(
      ProfileImage("1", "jpg").url == new URL("http://example.com/users/1.jpg")
    )
  }
}
