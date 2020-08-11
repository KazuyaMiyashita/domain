package domain5

import java.net.URL

case class ProfileImageImpl(path: String, extension: String) extends ProfileImage {

  def url: URL = new URL(ProfileImageImpl.baseUrl + path + "." + extension)

}

object ProfileImageImpl {

  val baseUrl = "http://example.com/users/"

}
