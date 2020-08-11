package domain6.impl

import java.net.URL
import domain6.ProfileImage

case class ProfileImageImpl(path: String, extension: String) extends ProfileImage {

  def url: URL = new URL(ProfileImageImpl.baseUrl + path + "." + extension)

}

object ProfileImageImpl {

  val baseUrl = "http://example.com/users/"

}
